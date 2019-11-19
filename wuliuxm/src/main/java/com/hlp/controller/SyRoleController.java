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
}
