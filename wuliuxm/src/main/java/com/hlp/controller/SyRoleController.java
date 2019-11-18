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
    public String FillAllSyRole(){
        List<SyRole> syRoles = syRoleService.FillAllSyRole();
        System.out.println(syRoles);

        return "";
    }

   /*根据id查询角色*/
    @RequestMapping("OneSyRole")
    public String OneSyRole(){
        SyRole syRoles = syRoleService.OneSyRoleByid(2);
        System.out.println(syRoles);

        return "";
    }
}
