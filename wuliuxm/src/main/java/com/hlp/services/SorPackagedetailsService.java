package com.hlp.services;

import com.hlp.model.SorPackagedetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SorPackagedetailsService {

    public List<SorPackagedetails> FillSorPackagedetailsLX();

    public List<SorPackagedetails> FillSorPackagedetailsByidLx(int id);

    public int insertSorPackagedetailsLx(SorPackagedetails sorPackagedetails);

    public SorPackagedetails FillSorPackagedetailsOneByidLx(int id);

    public List<SorPackagedetails> FillSorPackagedetailsManyByidLx(String inputtype);
}
