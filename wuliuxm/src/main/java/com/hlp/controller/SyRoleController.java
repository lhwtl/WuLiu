package com.hlp.controller;

import com.hlp.model.SyRole;
import com.hlp.services.SyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SyRoleController {
    @Autowired
    private SyRoleService syRoleService;

    /*查询全部角色*/
    @RequestMapping("FillAllSyRole")
    public List<SyRole> FillAllSyRole(){
        List<SyRole> syRoles = syRoleService.FillAllSyRole();
        System.out.println("角色"+syRoles);
        return syRoles;
    }

   /*根据id查询角色*/
   // @RequestMapping("OneSyRole")
   /* public syRoles OneSyRole(){
        SyRole syRoles = syRoleService.OneSyRoleByid(1);
        System.out.println("角色"+syRoles);
        return syRoles;
    }*/

/*多条件查询分页*/
   @RequestMapping("FillAllSyRoleLikePagLx")
   public List<SyRole> FillAllSyRoleLikePagLx(String rolename,String disabled ,int pag,int size){
       System.out.println("abc:"+rolename+"  "+disabled+"    "+pag+"    "+size);
     int  ztid=1;
       if(disabled.equals("否")){
           ztid=0;
       }
       List<SyRole> syRoles = syRoleService.FillAllSyRoleLikePagLx(rolename,ztid,pag,size);
       System.out.println(syRoles);
       return syRoles;
   }
    /*多条件MAX*/
    @RequestMapping("MaxSyRoleOewLx")
    public int MaxSyRoleOewLx(){
        System.out.println("aa小法");
        int i = syRoleService.MaxSyRoleOewLx();
        System.out.println("收缩MAX:"+i);
        return i;
    }
    /*多条件MAX*/
    @RequestMapping("MaxSyRoleLx")
    public int MaxSyRoleLx(String rolename,String disabled){
        int  ztid=1;
        if(disabled.equals("否")){
            ztid=0;
        }
        System.out.println("aaa:"+rolename+"  "+disabled);
        int i = syRoleService.MaxSyRoleLx(rolename,ztid);
        System.out.println("MAX:"+i);
        return i;
    }
    /*主页*/
    @RequestMapping("FillAllSyRoleZhuLx")
    public List<SyRole> FillAllSyRoleZhuLx(int pag, int size){
        System.out.println("aaa:"+pag+"  "+pag);
        List<SyRole> syRoles = syRoleService.FillAllSyRoleZhuLx(pag, size);
        System.out.println("主页L:"+syRoles);
        return syRoles;
    }
    /*新增*/
    @RequestMapping("insertSyRoleLx")
    public int insertSyRoleLx(SyRole syRole){
        System.out.println("ABC:"+syRole);
        int i = syRoleService.insertSyRoleLx(syRole);
        System.out.println("新增:"+i);
        return  i;
    }
    /*修改*/
    @RequestMapping("updateSyRoleLx")
    public int updateSyRoleLx(SyRole syRole){
        System.out.println("ABC:"+syRole);
        int i = syRoleService.updateSyRoleLx(syRole);
        System.out.println("修改:"+i);
        return  i;
    }
    /*删除*/
    @RequestMapping("deleteSyRoleLx")
    public int deleteSyRoleLx(int id){
        int i = syRoleService.deleteSyRoleLx(id);
        return  i;
    }


}
