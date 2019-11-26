package com.hlp.services;

import com.hlp.model.PacStockitem;

import java.util.List;

public interface PacStockitemService {
    List<PacStockitem> selectPacStockitem();

    int insertPacStockitem(PacStockitem pacStockitem);

    int updatePacStockitem(PacStockitem pacStockitem);

    List<PacStockitem>selectPacStockitemkc();
}
