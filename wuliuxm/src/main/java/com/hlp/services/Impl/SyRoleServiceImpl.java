package com.hlp.services.Impl;

import com.hlp.mapper.SyRoleMapper;
import com.hlp.model.SyRole;
import com.hlp.services.SyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyRoleServiceImpl implements SyRoleService {
    @Autowired
    private SyRoleMapper srm;

    @Override
    public List<SyRole> FillAllSyRole() {
        return srm.FillAllSyRole();
    }

    @Override
    public SyRole OneSyRoleByid(int id) {
        return srm.OneSyRoleByid(id);
    }
}
