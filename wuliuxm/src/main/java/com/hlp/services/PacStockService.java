package com.hlp.services;

import com.hlp.model.PacPackaging;
import com.hlp.model.PacStock;

import java.util.List;

public interface PacStockService {
    List<PacStock> selectPacStock();
    int deletePacStock(Short id);
    int insertPacStock(PacStock record);
    PacStock selectPacStockid(Short id);
    int updatePacStock(PacStock record);
    List<PacStock> selectPacStockname(PacStock record);
    PacStock selectPacStockwarehouseno(String warehouseno);
}
