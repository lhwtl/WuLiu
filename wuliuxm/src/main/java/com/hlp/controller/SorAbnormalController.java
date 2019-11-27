package com.hlp.controller;

import com.hlp.model.SorAbnormal;
import com.hlp.services.SorAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SorAbnormalController {
    @Autowired
    private SorAbnormalService service;
    /*查询全部*/
    @RequestMapping("selectSorAbnormalLX")
    public List<SorAbnormal>selectSorAbnormalLX(){
        List<SorAbnormal> list=service.selectSorAbnormalLX();
        System.out.println(list);
        for (SorAbnormal sorAbnormal : list) {
            System.out.println(sorAbnormal.getSorStorage());
        }
        return list;
    }
    /*新增*/
    @RequestMapping("insertSorAbnormalLX")
    public int insertSorAbnormalLX(SorAbnormal sor){
        int rs=(int) new Date().getTime();
        System.out.println(rs);
        sor.setId(-rs);
        System.out.println("值:"+sor);
        System.out.println(" x :"+sor);
        System.out.println(sor);
        return service.insertSorAbnormalLX(sor);
    }



}
