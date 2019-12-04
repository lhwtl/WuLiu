package com.hlp.mapper;

import com.hlp.model.PacPackaging;
import com.hlp.model.PacStock;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockMapper {
    @Select("select * from pac_stock")
    List<PacStock> selectPacStock();
    @Delete("delete from pac_stock where id=#{id}")
    int deletePacStock(Short id);
    @Insert("insert into pac_stock values(pac_stock_id.nextval,'RW1001'," +
            "#{reservoirtype},#{transport},#{subordinateunit}," +
            "#{drawerno},#{drawername},sysdate,#{remark})")
    int insertPacStock(PacStock record);
    @Select("select * from pac_stock where id=#{id}")
    PacStock selectPacStockid(Short id);
    @Update("update pac_stock set warehouseno=#{warehouseno}," +
            "reservoirtype=#{reservoirtype},transport=#{transport}," +
            "subordinateunit=#{subordinateunit}," +
            "drawerno=#{drawerno},drawername=#{drawername}," +
            "remark=#{remark} where id=#{id}")
    int updatePacStock(PacStock record);
    @Select("select * from pac_stock where warehouseno like '%'|| #{warehouseno}||'%' and reservoirtype like '%'|| #{reservoirtype} || '%'")
    List<PacStock> selectPacPacStockname(PacStock record);

    @Select("select * from pac_stock where warehouseno=#{warehouseno}")
    PacStock selectPacStockwarehouseno(String warehouseno);

    @Select({"select * from pac_stock where warehouseno like '%' || 'warehouseno' || '%'and subordinateunit like  '%' || 'subordinateunit' || '%'"})
    @Results({
            @Result(property = "id" , column = "id" ,id=true),
            @Result(property = "warehouseno", column = "warehouseno"),
            @Result(property = "pacStockitem", column = "warehouseno" ,one = @One(select = "com.hlp.mapper.PacStockitemMapper.selectPacStockwarehouseno"))
    })

    public List<PacStock> selectPacStockXH(@Param("warehouseno") String warehouseno,@Param("subordinateunit") String subordinateunit);

    @Select("select * from pac_stock where warehouseno like '%'||'R'||'%' and subordinateunit like '%'||'分'||'%' ")
   public List<PacStock> selectPacStockXHs();



}