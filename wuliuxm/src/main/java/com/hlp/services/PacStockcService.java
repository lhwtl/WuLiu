package com.hlp.services;

import com.hlp.model.PacStockc;

import java.util.List;

public interface PacStockcService {
    List<PacStockc> selectPacStockc();
    int insertPacStockc(PacStockc record);
    int updatePacStockc(PacStockc record);
    List<PacStockc> selectPacStockcmhc(PacStockc P);
}
