package com.hlp.controller;

import com.hlp.model.BasArea;
import com.hlp.services.BasAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasAreaController {
    @Autowired
    private BasAreaService basAreaService;
    @RequestMapping("select_BasArea")
    public List<BasArea> select_BasArea(){
        List<BasArea> list = basAreaService.selectBasArea();
        for(BasArea bb:list){
            System.out.println(bb.getSyUnits().getName() + bb.getSyUnits().getOperationtime());
        }
        return list;
    }
}
