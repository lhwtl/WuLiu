package com.hlp.mapper;

import com.hlp.model.SorCheckbound;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorCheckboundMapper {

    @Select("select * from Sor_Checkbound")
    public List<SorCheckbound> FillSorCheckboundLx();
    @Select("select * from Sor_Checkbound where id=#{id}")
    public List<SorCheckbound> FillSorCheckboundByidLx(int id);
    @Delete("delete from Sor_Checkbound where id=#{id}")
    public int deleteSorCheckbound(int id);
    @Insert("insert into Sor_Checkbound values(#{id},#{scanid},#{cargosum},#{checkperson},#{checkdate},#{checkcompany})")
    public int insertSorCheckboundLx(SorCheckbound sorCheckbound);
    @Update("update Sor_Checkbound set scanid=#{scanid},cargosum=#{cargosum},checkperson=#{checkperson},checkdate=#{checkdate},checkcompany=#{checkcompany} where id=#{id}")
    public int updateSorCheckboundLx(SorCheckbound sorCheckbound );

}
