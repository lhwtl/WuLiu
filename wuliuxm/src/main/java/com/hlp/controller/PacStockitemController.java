package com.hlp.controller;

import com.alibaba.fastjson.JSON;
import com.hlp.model.PacStock;
import com.hlp.model.PacStockc;
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
            System.out.println("xx"+stockitem.getPacStock());

            System.out.println(":AAA:"+stockitem);
        }
        return list;
    }
    @RequestMapping("insertPacStockitem")
    public int insertPacStockitem(PacStockitem pacStockitem){
        System.out.println("top");
        pacStockitem.setWarehouseno("RW1001");
        System.out.println("值："+pacStockitem);
        PacStock p=new PacStock();
        pacStockitem.setPacStock(p);
        p.setSubordinateunit("福田分部");
        System.out.println(p.getSubordinateunit());
        return service.insertPacStockitem(pacStockitem);
    }
    @RequestMapping("updatePacStockitem")
    public int updatePacStockitem(PacStockitem pacStockitem){
        return service.updatePacStockitem(pacStockitem);
    }

    @RequestMapping("selectPacStockitemhc")
    public List<PacStockitem> selectPacStockitemhc(PacStockitem P,String name){
        System.out.println("xx:"+name);
        System.out.println(P.getGoodscode());
        System.out.println(P);
        PacStock p=new PacStock();
        p.setSubordinateunit(name);
        P.setPacStock(p);
        System.out.println(P);
        List<PacStockitem> list=service.selectPacStockitemhc(P);

        for (PacStockitem stockitem : list) {
            System.out.println("xx"+stockitem.getPacStock());

            System.out.println(":AAA:"+stockitem);
        }
        return list;
    }

}
