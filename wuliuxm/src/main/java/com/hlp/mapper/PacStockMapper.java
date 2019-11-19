package com.hlp.mapper;

import com.hlp.model.PacStock;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockMapper {
    @Select("select * from PacStock")
    List<PacStock> selectPacStock();
    @Delete("delete from PacStock where id=#{id}")
    int deletePacStock(Short id);
    @Insert("insert into PacStock values(null,#{warehouseno}," +
            "#{reservoirtype},#{transport},#{subordinateunit}," +
            "#{drawerno},#{drawername},#{remark})")
    int insertPacStock(PacStock record);
    @Select("select * from PacStock where id=#{id}")
    PacStock selectPacStockid(Short id);
    @Update("update PacStock set warehouseno=#{warehouseno}," +
            "reservoirtype=#{reservoirtype},transport=#{transport}," +
            "subordinateunit=#{subordinateunit}," +
            "drawerno=#{drawerno},drawername=#{drawername}," +
            "remark=#{remark} where id=#{id}")
    int updatePacStock(PacStock record);
}