package com.hlp.mapper;

import com.hlp.model.SorCheckbounddetails;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorCheckbounddetailsMapper {
    @Select("select  * from  Sor_Checkbounddetails where packageid=#{packageid}")
    public List<SorCheckbounddetails> FillSSorCheckbounddetailspackageByidLx(String packageid);
    @Select("select * from Sor_Checkbounddetails  where id=#{id}")
    public SorCheckbounddetails FillSSorCheckbounddetailsByidLx(int id );
    /*根据id删除*/
    @Delete("delete from Sor_Checkbounddetails  where id=#{id}")
    public int deleteSorCheckbounddetailsByidLx(int id);
    /*删除packageid详情*/
    @Delete("delete from Sor_Checkbounddetails  where packageid=#{packageid}")
    public int deleteSorCheckbounddetailsLx(String packageid);
    @Insert("insert into Sor_Checkbounddetails(id,packageid,cargocount,weight,volume,cargotype,direction,storageperson,storagedate) values(#{id},#{packageid},#{cargocount},#{weight},#{volume},#{cargotype},#{direction},#{storageperson},#{storagedate})")
    public int insertSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails);
    @Update("update Sor_Checkbounddetails set cargocount=#{cargocount},weight=#{weight},volume=#{volume},cargotype=#{cargotype},direction=#{direction},storageperson=#{storageperson},storagedate=#{storagedate} where id=#{id}")
    public int updateSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails);



    /*正在的库存*/
    @Select("select * from Sor_Checkbounddetails")
    public List<SorCheckbounddetails> FillKCSorCheckbounddetailslx();

}
