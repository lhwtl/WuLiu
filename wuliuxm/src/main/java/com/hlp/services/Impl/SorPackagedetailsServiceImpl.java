package com.hlp.services.Impl;

import com.hlp.mapper.SorPackagedetailsMapper;
import com.hlp.model.SorPackagedetails;
import com.hlp.services.SorPackagedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorPackagedetailsServiceImpl implements SorPackagedetailsService {
    @Autowired
    private SorPackagedetailsMapper som;

    @Override
    public List<SorPackagedetails> FillSorPackagedetailsLX() {
        return som.FillSorPackagedetailsLX();
    }

    @Override
    public List<SorPackagedetails> FillSorPackagedetailsByidLx(int id) {
        return som.FillSorPackagedetailsByidLx(id);
    }

    @Override
    public int insertSorPackagedetailsLx(SorPackagedetails sorPackagedetails) {
        return som.insertSorPackagedetailsLx(sorPackagedetails);
    }

    @Override
    public SorPackagedetails FillSorPackagedetailsOneByidLx(int id) {
        return som.FillSorPackagedetailsOneByidLx(id);
    }

    @Override
    public List<SorPackagedetails> FillSorPackagedetailsManyByidLx(String inputtype) {
        return som.FillSorPackagedetailsManyByidLx(inputtype);
    }
}
