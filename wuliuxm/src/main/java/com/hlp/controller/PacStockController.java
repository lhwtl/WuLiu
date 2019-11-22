package com.hlp.controller;

import com.hlp.model.PacPackaging;
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
        System.out.println("查询进来了");
        return service.selectPacStock();
    }
    @RequestMapping("deletePacStock")
    public int deletePacStock(Short id){
        System.out.println("删除进来了");
        return service.deletePacStock(id);
    }
    @RequestMapping("updatePacStock")
    public int updatePacStock(PacStock record){
        System.out.println("修改进来了");
        return service.updatePacStock(record);
    }
    @RequestMapping("insertPacStock")
    public int insertPacStock(PacStock record){
        System.out.println("新增进来了");
        return service.insertPacStock(record);
    }
    @RequestMapping("selectPacStockid")
    public PacStock selectPacStockid(Short id){
        return service.selectPacStockid(id);
    }
    @RequestMapping("selectPacStockname")
    public List<PacStock> selectPacStockname(PacStock record){
        System.out.println(record);
        return service.selectPacStockname(record);
    };
}
