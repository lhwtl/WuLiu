package com.hlp.controller;

import com.hlp.model.SyRolesmenus;
import com.hlp.services.SyRolesmenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SyRolesmenusController {
    @Autowired
    private SyRolesmenusService syRolesmenusService;

    /*删除*/
    @RequestMapping("deleteSyRolesmenusRoleidLx")
    public int deleteSyRolesmenusRoleidLx(int roleid){
        System.out.println("角色删除id:"+roleid);
        int i = syRolesmenusService.deleteSyRolesmenusRoleidLx(roleid);
        System.out.println("删除:"+i);
        return i;
    }
    /*新增*/
    @RequestMapping("insertyRolesmenusLx")
    public int insertyRolesmenusLx(SyRolesmenus syRolesmenus,Short []  qxlistid,int roleid){
        System.out.println("xxx");
        System.out.println(roleid+":  id");
        int s=0;
        for (int i : syRolesmenus.getQxlistid()) {
            syRolesmenus.setMenuid((short)i);
            syRolesmenus.setRoleid((short) roleid);
            System.out.println(i+"   :   "+syRolesmenus);
             s = syRolesmenusService.insertyRolesmenusLx(syRolesmenus);
            /*复选框id选择添加数据*/

        }

       // int i = syRolesmenusService.insertyRolesmenusLx(syRolesmenus);
        System.out.println("新增:");
        return s;
    }
    /*角色查*/
    @RequestMapping("FillAllSyRolesmenusRoleByidLx")
    public List<SyRolesmenus> FillAllSyRolesmenusRoleByidLx(int roleid){
        System.out.println("查询id:"+roleid);
        List<SyRolesmenus> syRolesmenus = syRolesmenusService.FillAllSyRolesmenusRoleByidLx(roleid);
        System.out.println("查询:"+syRolesmenus);
        return syRolesmenus;
    }


}
