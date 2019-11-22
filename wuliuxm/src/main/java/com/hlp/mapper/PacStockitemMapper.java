package com.hlp.mapper;


import com.hlp.model.PacPackaging;
import com.hlp.model.PacStockitem;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockitemMapper {
    @Select("select * from pac_stockitem")
    List<PacStockitem> selectPacStockitem();

    int insertPacPackaging(Short id);

    int updatePacStockitem(PacStockitem pacStockitem);
}
