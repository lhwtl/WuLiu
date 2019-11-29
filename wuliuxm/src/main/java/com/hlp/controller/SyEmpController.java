package com.hlp.controller;

import com.hlp.mapper.SyEmpMapper;
import com.hlp.model.SyEmp;
import com.hlp.model.SyMenus;
import com.hlp.model.SyRole;
import com.hlp.services.SyEmpService;
import com.hlp.services.SyMenusService;
import com.hlp.services.SyRoleService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class SyEmpController {

    @Autowired
    private SyEmpService syEmpService;
    @Autowired
    private SyRoleService syRoleService;
    @Autowired
    private SyMenusService syMenusService;

    /*登录  sssssss查询权限下拉*/
    @RequestMapping("LoginSyEmp")
    public SyRole LoginSyEmp(SyEmp syEmp){
        /*登入的账号*/
        SyEmp syEmp1 = syEmpService.LoginSyEmp(syEmp);

        /*根据登入的账号获取管理员id的角色  根据多对多  角色里面的权限查出对应的权限列表一级*/
        SyRole syRole = syRoleService.OneSyRoleByid(syEmp1.getId());
        for (SyMenus syMenu : syRole.getSyMenus()) {
            /*查询权限里面的二级列表*/
                List<SyMenus> syMenus = syMenusService.FillAllSyZJMenusByid(syRole.getId(),syMenu.getId());

              /*把二级列表放入一级列表下面*/
                syMenu.setSymbols(syMenus);
        }
        return syRole;
    }
    /*查询全部*/
    @RequestMapping("FillAllSyEmpLx")
    public List<SyEmp> FillAllSyEmpLx(){
        List<SyEmp> syEmps = syEmpService.FillAllSyEmpLx();
        System.out.println("全部"+syEmps);
        return syEmps;
    }
    /*多条件分页查询查询*/
    @RequestMapping("FillAllSyEmpLikePagLx")
    public List<SyEmp> FillAllSyEmpLikePagLx(String empname,int disabled ,int pag,int size  ){
        System.out.println("abc");

        System.out.println("r1:"+disabled+empname+"：名"+disabled+"：状态"+pag+"：页"+size+":行");
        List<SyEmp> syEmps = syEmpService.FillAllSyEmpLikePagLx(empname,disabled,pag,size);
        System.out.println(syEmps);
        return syEmps;
    }
    /*多条件Max*/
    @RequestMapping("MaxSyEmpLx")
    public int MaxSyEmpLx(String empname,String disabled){
        System.out.println("max");
        int tzid=1;
        if (disabled=="否"){
            tzid=0;
        }
        int i = syEmpService.MaxSyEmpLx(empname, tzid);
        System.out.println(i);
        return  i;
    }
    /*主页查询*/
    @RequestMapping("FillAllSyEmpZhuLx")
    public List<SyEmp> FillAllSyEmpZhuLx(int pag,int size){
        List<SyEmp> syEmps = syEmpService.FillAllSyEmpZhuLx(pag, size);
        System.out.println("主页面:"+syEmps);
        return syEmps;
    }
    /*修改*/
    @RequestMapping("updateSyEmpLx")
    public int updateSyEmpLx(SyEmp syEmp){
        System.out.println(syEmp);
        int i = syEmpService.updateSyEmpLx(syEmp);
        System.out.println("修改"+i);
        return i;
    }
    /*新增*/
    @RequestMapping("insertSyEmpLx")
    public int insertSyEmpLx(SyEmp syEmp){
        System.out.println(syEmp);
        int i = syEmpService.insertSyEmpLx(syEmp);
        System.out.println("新增"+i);
        return i;
    }
    /*删除*/
    @RequestMapping("deleteSyEmpLx")
    public int deleteSyEmpLx(int id){
        System.out.println(id);
        int i = syEmpService.deleteSyEmpLx(id);
        System.out.println("删除"+i);
        return i;
    }

    /*根据工号查询*/
    @RequestMapping("FillAllSyEmpEmpToLx")
    public SyEmp FillAllSyEmpEmpToLx(String empno){
        SyEmp syEmp = syEmpService.FillAllSyEmpEmpToLx(empno);
        return syEmp;
    }

    //查询所有员工
    @RequestMapping("selectSyEmpAllHlp")
    public List<SyEmp> selectSyEmpAllHlp(){
        List<SyEmp> list=syEmpService.selectSyEmpAllHlp();
        return list;
    }
    //根据编码查询员工
    @RequestMapping("selectSyEmpByempnoHlp")
    public SyEmp selectSyEmpByempnoHlp(String empno){
       SyEmp syEmp=syEmpService.selectSyEmpByempnoHlp(empno);
        return syEmp;
    }
//根据id查询
    @RequestMapping("selectSyEmpByIdHlp")
    public SyEmp selectSyEmpByIdHlp(int id){
        SyEmp syEmp=syEmpService.selectSyEmpByIdHlp(id);
        return syEmp;
    }

}
