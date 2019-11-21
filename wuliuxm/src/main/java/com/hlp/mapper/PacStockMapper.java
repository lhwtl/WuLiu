package com.hlp.mapper;

import com.hlp.model.PacPackaging;
import com.hlp.model.PacStock;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockMapper {
    @Select("select * from pac_stock")
    List<PacStock> selectPacStock();
    @Delete("delete from pac_stock where id=#{id}")
    int deletePacStock(Short id);
    @Insert("insert into pac_stock values(null,#{warehouseno}," +
            "#{reservoirtype},#{transport},#{subordinateunit}," +
            "#{drawerno},#{drawername},#{remark})")
    int insertPacStock(PacStock record);
    @Select("select * from pac_stock where id=#{id}")
    PacStock selectPacStockid(Short id);
    @Update("update pac_stock set warehouseno=#{warehouseno}," +
            "reservoirtype=#{reservoirtype},transport=#{transport}," +
            "subordinateunit=#{subordinateunit}," +
            "drawerno=#{drawerno},drawername=#{drawername}," +
            "remark=#{remark} where id=#{id}")
    int updatePacStock(PacStock record);
    @Select("select * from pac_stock where warehouseno=#{warehouseno} and goodscode=#{goodscode}")
    List<PacPackaging> selectPacPackagingname();
}