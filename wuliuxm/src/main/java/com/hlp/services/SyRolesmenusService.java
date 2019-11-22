package com.hlp.services;

import com.hlp.model.SyRolesmenus;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SyRolesmenusService {

    /*删除角色的权限*/
    public int deleteSyRolesmenusRoleidLx(int roleid);

    /*新增角色权限*/
    public int insertyRolesmenusLx(SyRolesmenus syRolesmenus);

    /*根据角色id查对应的权限*/
    public List<SyRolesmenus> FillAllSyRolesmenusRoleByidLx(int roleid);
}
