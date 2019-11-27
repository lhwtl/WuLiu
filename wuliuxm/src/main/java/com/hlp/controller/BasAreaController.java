package com.hlp.controller;

import com.hlp.model.BasArea;
import com.hlp.services.BasAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
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
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(bb.getSyUnits().getOperationtime());
            bb.getSyUnits().setTime(format);
            System.out.println(format);
        }
        return list;
    }

    @RequestMapping("delete_BasArea")
    public int delete_BasArea(Short id){
        return basAreaService.deleteBasAreats(id);
    }
}
