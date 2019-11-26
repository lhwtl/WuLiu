package com.hlp.mapper;

import com.hlp.model.SyRolesmenus;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SyRolesmenusMapper {
    /*删除角色的权限*/
    @Delete("delete from Sy_Rolesmenus where roleid=#{roleid}")
    public int deleteSyRolesmenusRoleidLx(int roleid);

    /*新增角色权限*/
    @Insert("insert into sy_rolesmenus values(sy_rolesmenus_id.nextval,#{roleid},#{menuid})")
    public int insertyRolesmenusLx(SyRolesmenus syRolesmenus);

    /*根据角色id查对应的权限*/
    @Select("select * from  Sy_Rolesmenus where roleid=#{roleid}")
    public List<SyRolesmenus> FillAllSyRolesmenusRoleByidLx(int roleid);

}
