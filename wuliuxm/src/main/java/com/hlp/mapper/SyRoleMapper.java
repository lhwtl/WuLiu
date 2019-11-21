package com.hlp.mapper;

import com.hlp.model.SyEmp;
import com.hlp.model.SyRole;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SyRoleMapper {


    /*查询全部角色*/
    @Select("select * from Sy_Role")
    public List<SyRole> FillAllSyRole();
    /*查询一个角色   多对多*/
    @Select("select * from Sy_Role where id=#{id}")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "syMenus",column = "id",many=@Many(select="com.hlp.mapper.SyMenusMapper.FillAllSyMenusByid"))
    })
    public SyRole OneSyRoleByid(int id);


}