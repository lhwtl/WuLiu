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

    @Override
    public List<SyRole> FillAllSyRoleLikePagLx(String rolename, int disabled, int pag, int size) {
        return srm.FillAllSyRoleLikePagLx(rolename,disabled,pag,size);
    }

    @Override
    public int MaxSyRoleLx(String rolename, int disabled) {
        return srm.MaxSyRoleLx(rolename,disabled);
    }

    @Override
    public List<SyRole> FillAllSyRoleZhuLx(int pag, int size) {
        return srm.FillAllSyRoleZhuLx(pag,size);
    }

    @Override
    public int insertSyRoleLx(SyRole syRole) {
        return srm.insertSyRoleLx(syRole);
    }

    @Override
    public int updateSyRoleLx(SyRole syRole) {
        return srm.updateSyRoleLx(syRole);
    }

    @Override
    public int deleteSyRoleLx(int id) {
        return srm.deleteSyRoleLx(id);
    }

    @Override
    public int MaxSyRoleOewLx() {
        return srm.MaxSyRoleOewLx();
    }
}
