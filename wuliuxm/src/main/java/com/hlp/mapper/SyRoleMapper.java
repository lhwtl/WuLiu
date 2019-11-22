package com.hlp.mapper;

import com.hlp.model.SyEmp;
import com.hlp.model.SyRole;
import org.apache.ibatis.annotations.*;
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


    /*多条件分页查询lx*/
    @Select("select b.* from (select t.*,rownum rn from Sy_Role t where rolename like '%'||#{rolename}||'%' and disabled=#{disabled})b where  b.rn> (#{pag}-1)*#{size} and b.rn <=#{pag}*#{size}")
    public List<SyRole> FillAllSyRoleLikePagLx(String rolename,int disabled,int pag,int size);
    /*多条件最大值*/
    @Select("select count(*) from Sy_Role where rolename like '%'||#{rolename}||'%' and disabled=#{disabled}")
    public  int MaxSyRoleLx(String rolename,int disabled);
    /*Max*/
    @Select("select count(*) from Sy_Role")
    public  int MaxSyRoleOewLx();
    /*z主页显示*/
    @Select("select b.* from (select t.*,rownum rn from Sy_Role t )b where  b.rn> (#{pag}-1)*#{size} and b.rn <=#{pag}*#{size}")
    public List<SyRole> FillAllSyRoleZhuLx(int pag,int size);
    /*新增*/
    @Insert("insert into sy_role values(sy_role_id.nextval,#{rolename},#{roledesc},#{disabled})")
    public int insertSyRoleLx(SyRole syRole);
    /*修改*/
    @Update("update sy_role set rolename=#{rolename},roledesc=#{roledesc},disabled=#{disabled} where id=#{id}")
    public int updateSyRoleLx(SyRole syRole);
    /*删除*/
    @Delete("delete from sy_role where id=#{id}")
    public int deleteSyRoleLx(int id);

}