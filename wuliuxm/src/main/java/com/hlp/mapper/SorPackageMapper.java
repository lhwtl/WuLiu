package com.hlp.mapper;

import com.hlp.model.SorPackage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorPackageMapper {

    @Select("select * from Sor_Package")
    public List<SorPackage> FillSorPackageLX();

    @Select("select * from Sor_Package where id=#{id}")
    public SorPackage FillSorPackageByidLX(int id);

    @Insert("insert into Sor_Package values(#{id},#{packageperson},#{sealint},#{destination},#{reckondes},#{timelimit},#{ticketsum},#{cargosum},#{weightsum},#{volumesum},#{state},#{ask})")
    public int insertSorPackageLX(SorPackage sorPackage);

    @Update("update Sor_Package set ticketsum=#{ticketsum},cargosum=#{cargosum},weightsum=#{weightsum},volumesum=#{volumesum} where id=#{id} ")
    public int updateSorPackage(SorPackage sorPackage);


}
