package com.hlp.services.Impl;

import com.hlp.mapper.SyRolesmenusMapper;
import com.hlp.model.SyRolesmenus;
import com.hlp.services.SyRoleService;
import com.hlp.services.SyRolesmenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SyRolesmenusServiceImpl implements SyRolesmenusService {
    @Autowired
    private SyRolesmenusMapper srs;


    @Override
    public int deleteSyRolesmenusRoleidLx(int roleid) {
        return srs.deleteSyRolesmenusRoleidLx(roleid);
    }

    @Override
    public int insertyRolesmenusLx(SyRolesmenus syRolesmenus) {
        return srs.insertyRolesmenusLx(syRolesmenus);
    }

    @Override
    public List<SyRolesmenus> FillAllSyRolesmenusRoleByidLx(int roleid) {
        return srs.FillAllSyRolesmenusRoleByidLx(roleid);
    }
}
