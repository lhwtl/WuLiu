package com.hlp.mapper;


import com.hlp.model.PacPackaging;
import com.hlp.model.PacStockitem;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockitemMapper {
    @Select("select * from pac_stockitem")
    List<PacStockitem> selectPacStockitem();
    @Insert("insert into pac_stockitem values(pac_stockitem_id.nextval,RW1001,#{goodscode},#{goodsname}" +
            ",#{storagenum},#{actualnum},#{plannedprice},#{specifications}," +
            "#{type},#{status})")
    int insertPacStockitem(PacStockitem pacStockitem);
    @Update("update pac_stockitem set goodscode=#{goodscode},goodsname=#{goodsname}," +
            "storagenum=#{storagenum},actualnum=#{actualnum},plannedprice=#{plannedprice}," +
            "specifications=#{specifications},type=#{type},status=#{status} where id=#{id}")
    int updatePacStockitem(PacStockitem pacStockitem);

    @Select("select * from pac_stockitem ")
   @Results({
            @Result(property = "id" , column = "id" ,id=true),
            @Result(property = "warehouseno", column = "warehouseno"),
            @Result(property = "pacStock", column = "warehouseno" ,one = @One(select = "com.hlp.mapper.PacStockMapper.selectPacStockwarehouseno"))
    })
    List<PacStockitem>selectPacStockitemkc();
}
