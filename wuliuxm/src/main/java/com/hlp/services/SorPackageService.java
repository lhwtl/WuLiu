package com.hlp.services;

import com.hlp.model.SorPackage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorPackageService {

    public List<SorPackage> FillSorPackageLX();

    public SorPackage FillSorPackageByidLX(int id);

    public int insertSorPackageLX(SorPackage sorPackage);

    public int updateSorPackage(SorPackage sorPackage);

}
