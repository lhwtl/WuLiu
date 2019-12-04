package com.hlp.mapper;

import com.hlp.model.SorPackagedetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorPackagedetailsMapper {

    @Select("select * from sor_packagedetails ")
    public List<SorPackagedetails> FillSorPackagedetailsLX();

    @Select("select * from sor_packagedetails where id=#{id}")
    public List<SorPackagedetails> FillSorPackagedetailsByidLx(int id);

    @Insert("insert into sor_packagedetails values(#{id},#{warename},#{destination},#{ticket},#{actualcargoint},#{cargoint},#{weight},#{volume},#{service},#{importanthints},#{ask},#{inputtype})")
    public int insertSorPackagedetailsLx(SorPackagedetails sorPackagedetails);


    @Select("select * from sor_packagedetails where id=#{id}")
    public SorPackagedetails FillSorPackagedetailsOneByidLx(int id);

    @Select("select * from sor_packagedetails where inputtype=#{inputtype}")
    public List<SorPackagedetails> FillSorPackagedetailsManyByidLx(String inputtype);


}
