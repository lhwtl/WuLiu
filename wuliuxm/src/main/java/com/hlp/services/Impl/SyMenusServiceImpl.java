package com.hlp.services.Impl;

import com.hlp.mapper.SyMenusMapper;
import com.hlp.model.SyMenus;
import com.hlp.services.SyMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyMenusServiceImpl implements SyMenusService {

    @Autowired
    private SyMenusMapper smm;


    @Override
    public List<SyMenus> FillAllSyMenusPage(String colName,int pag,int size) {
        return smm.FillAllSyMenusPage(colName,pag,size);
    }

    @Override
    public List<SyMenus> FillAllSyMenusByid(int id) {
        return smm.FillAllSyMenusByid(id);
    }

    @Override
    public List<SyMenus> FillAllSyZJMenusByid(int id,int sid) {
        return smm.FillAllSyZJMenusByid(id,sid);
    }

    @Override
    public int MaxSyMenus() {
        return smm.MaxSyMenus();
    }

    @Override
    public List<SyMenus> FillAllOneColumnSyMenus(String f) {
        return smm.FillAllOneColumnSyMenus(f);
    }

    @Override
    public List<SyMenus> FillAllLikeTextSyMenus(String colName) {
        return smm.FillAllLikeTextSyMenus(colName);
    }

    @Override
    public  List<SyMenus> FillSyMenusByidLX(int id,String pid,int pag,int size) {
        return smm.FillSyMenusByidLX(id,pid,pag,size);
    }

    @Override
    public List<SyMenus> FillSyMenusByidLXxxxxx(String id) {
        return smm.FillSyMenusByidLXxxxxx(id);
    }

    @Override
    public int MaxTwoMenusByidLX(int id, String pid) {
        return smm.MaxTwoMenusByidLX(id,pid);
    }

    @Override
    public int insertSyMenusLX(SyMenus syMenus) {
        return smm.insertSyMenusLX(syMenus);
    }

    @Override
    public int deleteSyMenusByidLx(int id) {
        return smm.deleteSyMenusByidLx(id);
    }

    @Override
    public int updateSyMenusLx(SyMenus syMenus) {
        return smm.updateSyMenusLx(syMenus);
    }

    @Override
    public SyMenus FillSyMenusByIdLx(int id) {
        return smm.FillSyMenusByIdLx(id);
    }

    @Override
    public int MaxMenusLikeNameLX(String name) {
        return smm.MaxMenusLikeNameLX(name);
    }

    @Override
    public List<SyMenus> FillAllSyMenusByIdLx(int id) {
        return smm.FillAllSyMenusByIdLx(id);
    }
}
