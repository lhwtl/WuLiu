package com.hlp.services.Impl;

import com.hlp.mapper.SorStoragedetailsMapper;
import com.hlp.model.SorStoragedetails;
import com.hlp.services.SorStorageService;
import com.hlp.services.SorStoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorStoragedetailsServiceImpl implements SorStoragedetailsService {
@Autowired
private SorStoragedetailsMapper ssm;


    @Override
    public List<SorStoragedetails> FillSorStoragedetailsByidLx(String id) {
        return ssm.FillSorStoragedetailsByidLx(id);
    }

    @Override
    public int deleteSorStoragedetailsByidLx(String id) {
        return ssm.deleteSorStoragedetailsByidLx(id);
    }

    @Override
    public int insertStoragedetailsByidLx(SorStoragedetails sorStoragedetails) {
        return ssm.insertStoragedetailsByidLx(sorStoragedetails);
    }

    @Override
    public int updateStoragedetailsByidLx(SorStoragedetails sorStoragedetails) {
        return ssm.updateStoragedetailsByidLx(sorStoragedetails);
    }

    @Override
    public List<SorStoragedetails> FillSorStoragedetailsKCLx(String id) {
        return ssm.FillSorStoragedetailsKCLx(id);
    }

    @Override
    public List<SorStoragedetails> FilSorStoragedetailsKcLX() {
        return ssm.FilSorStoragedetailsKcLX();
    }
}
