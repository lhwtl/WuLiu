package com.hlp.mapper;


import com.hlp.model.PacPackaging;
import com.hlp.model.PacStockitem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PacStockitemMapper {
    @Select("select * from pac_stockitem")
    List<PacStockitem> selectPacPackaging();
    @Delete("delete from pac_stockitem where id=#{id}")
    int deletePacPackaging(Short id);

    List<PacPackaging> selectPacPackagingname();
}
