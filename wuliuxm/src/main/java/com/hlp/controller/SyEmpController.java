package com.hlp.controller;

import com.hlp.mapper.SyEmpMapper;
import com.hlp.model.SyEmp;
import com.hlp.model.SyMenus;
import com.hlp.model.SyRole;
import com.hlp.services.SyEmpService;
import com.hlp.services.SyMenusService;
import com.hlp.services.SyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
