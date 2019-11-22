package com.hlp.controller;

import com.hlp.model.BasZoneinfo;
import com.hlp.services.BasZoneinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasZoneinfoContoller {
    @Autowired
    private BasZoneinfoService basZoneinfoService;

    @RequestMapping("select_BasZoneinfo")
    public List<BasZoneinfo> select_BasZoneinfo(){
        List<BasZoneinfo> list = basZoneinfoService.selectBasZoneinfo();
        for (BasZoneinfo bb:list){
            System.out.println(bb.getSyUnits().getName());
        }
        return list;
    }
}
