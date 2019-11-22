package com.hlp.services;

import com.hlp.model.PacStockitem;

import java.util.List;

public interface PacStockitemService {
    List<PacStockitem> selectPacStockitem();

    int insertPacPackaging(PacStockitem pacStockitem);

    int updatePacStockitem(PacStockitem pacStockitem);
}
