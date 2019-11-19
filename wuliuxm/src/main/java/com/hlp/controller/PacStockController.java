package com.hlp.controller;

import com.hlp.model.PacStock;
import com.hlp.services.PacStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacStockController {
    @Autowired
    private PacStockService service;

    @RequestMapping("selectPacStock")
    public List<PacStock> selectPacStock(){
        return service.selectPacStock();
    }
    @RequestMapping("deletePacStock")
    public int deletePacStock(Short id){
        return service.deletePacStock(id);
    }
    @RequestMapping("updatePacStock")
    public int updatePacStock(PacStock record){
        return service.updatePacStock(record);
    }
    @RequestMapping("insertPacStock")
    public int insertPacStock(PacStock record){
        return service.insertPacStock(record);
    }
    @RequestMapping("selectPacStockid")
    public PacStock selectPacStockid(Short id){
        return service.selectPacStockid(id);
    }
}
