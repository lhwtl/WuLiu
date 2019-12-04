package com.hlp.controller;

import com.hlp.model.BasZonecustominfo;
import com.hlp.services.BasZonecustominfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasZonecustominfoController {
    @Autowired
    private BasZonecustominfoService basZonecustominfoService;
    @RequestMapping("select_BasZonecustominfoKHts")
    public List<BasZonecustominfo> select_BasZonecustominfoKHts(Short zoneinfoid){
        List<BasZonecustominfo> list = basZonecustominfoService.selectBasZonecustominfoKHts(zoneinfoid);
        return list;
    }
}
