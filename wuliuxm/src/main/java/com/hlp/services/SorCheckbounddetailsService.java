package com.hlp.services;

import com.hlp.model.SorCheckbounddetails;
import com.hlp.model.SorPackagedetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorCheckbounddetailsService {

    public List<SorCheckbounddetails> FillSSorCheckbounddetailspackageByidLx(String packageid);
    public SorCheckbounddetails FillSSorCheckbounddetailsByidLx(int id );
    /*根据id删除*/
    public int deleteSorCheckbounddetailsByidLx(int id);
    /*删除packageid详情*/
    public int deleteSorCheckbounddetailsLx(String packageid);
    public int insertSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails);
    public int updateSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails);
    public List<SorCheckbounddetails> FillKCSorCheckbounddetailslx();



}



