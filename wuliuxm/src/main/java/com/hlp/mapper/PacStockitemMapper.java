package com.hlp.mapper;


import com.hlp.model.PacPackaging;
import com.hlp.model.PacStockitem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockitemMapper {
    @Select("select * from pac_stockitem")
    List<PacStockitem> selectPacStockitem();
    @Insert("insert into pac_stockitem values(2,RW1001,#{goodscode},#{goodsname}" +
            ",#{storagenum},#{actualnum},#{plannedprice},#{specifications}," +
            "#{type},#{status})")
    int insertPacPackaging(PacStockitem pacStockitem);
    @Update("update pac_stockitem set goodscode=#{goodscode},goodsname=#{goodsname}," +
            "storagenum=#{storagenum},actualnum=#{actualnum},plannedprice=#{plannedprice}," +
            "specifications=#{specifications},type=#{type},status=#{status} where id=#{id}")
    int updatePacStockitem(PacStockitem pacStockitem);
}
