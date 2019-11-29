package com.hlp.controller;

import com.hlp.model.PacStockc;
import com.hlp.services.PacStockcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacStockcController {
    @Autowired
    private PacStockcService service;
    @RequestMapping("selectPacStockc")
    public List<PacStockc> selectPacStockc(){
        List<PacStockc> list=service.selectPacStockc();
        return list;
    }
    @RequestMapping("insertPacStockc")
    public int insertPacStockc(PacStockc record){
        return service.insertPacStockc(record);
    }
    @RequestMapping("updatePacStockc")
    public int updatePacStockc(PacStockc record){
        return service.updatePacStockc(record);
    }
}
