package com.hlp.services;

import com.hlp.model.SyRole;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SyRoleService {

    public List<SyRole> FillAllSyRole();

    public SyRole OneSyRoleByid(int id);

}
