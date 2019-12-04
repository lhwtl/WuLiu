package com.hlp.services.Impl;

import com.hlp.mapper.SorPackageMapper;
import com.hlp.model.SorPackage;
import com.hlp.services.SorPackageService;
import com.hlp.services.SorPackagedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorPackageServiceImpl implements SorPackageService {
    @Autowired
    private SorPackageMapper spm;

    @Override
    public List<SorPackage> FillSorPackageLX() {
        return spm.FillSorPackageLX();
    }

    @Override
    public SorPackage FillSorPackageByidLX(int id) {
        return spm.FillSorPackageByidLX(id);
    }

    @Override
    public int insertSorPackageLX(SorPackage sorPackage) {
        return spm.insertSorPackageLX(sorPackage);
    }

    @Override
    public int updateSorPackage(SorPackage sorPackage) {
        return spm.updateSorPackage(sorPackage);
    }
}
