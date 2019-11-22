package com.hlp.services;

import com.hlp.model.SyRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SyRoleService {

    public List<SyRole> FillAllSyRole();

    public SyRole OneSyRoleByid(int id);
    public List<SyRole> FillAllSyRoleLikePagLx(String rolename,int disabled,int pag,int size);
    /*多条件最大值*/
    public  int MaxSyRoleLx(String rolename,int disabled);
    public List<SyRole> FillAllSyRoleZhuLx(int pag,int size);
    /*新增*/
    public int insertSyRoleLx(SyRole syRole);
    /*修改*/
    public int updateSyRoleLx(SyRole syRole);
    /*删除*/
    public int deleteSyRoleLx(int id);
    /*MAX*/
    public  int MaxSyRoleOewLx();


}
