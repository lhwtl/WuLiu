package com.hlp.controller;

import com.hlp.model.PacStockitem;
import com.hlp.services.PacStockitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacStockitemController {
    @Autowired
    private PacStockitemService service;
    @RequestMapping("selectPacStockitem")
    public List<PacStockitem> selectPacStockitem(){
        System.out.println("进来了");
        return  service.selectPacStockitem();
    }
    @RequestMapping("selectPacStockitemkc")
    public List<PacStockitem> selectPacStockitemkc(){
        System.out.println("a");
        List<PacStockitem> list=service.selectPacStockitemkc();
        for (PacStockitem stockitem : list) {
            System.out.println(stockitem);
        }
        return list;
    }
    @RequestMapping("insertPacStockitem")
    public int insertPacStockitem(PacStockitem pacStockitem){
        return service.insertPacStockitem(pacStockitem);
    }
    @RequestMapping("updatePacStockitem")
    public int updatePacStockitem(PacStockitem pacStockitem){
        return service.updatePacStockitem(pacStockitem);
    }
}
