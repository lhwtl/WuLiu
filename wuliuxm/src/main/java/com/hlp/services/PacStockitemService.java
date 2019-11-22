package com.hlp.services;

import com.hlp.model.PacStockitem;

import java.util.List;

public interface PacStockitemService {
    List<PacStockitem> selectPacStockitem();

    int insertPacPackaging(Short id);

    int updatePacStockitem(PacStockitem pacStockitem);
}
