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
        System.out.println("查询");
        List<BasArea> list = basAreaService.selectBasArea();
        return list;
    }

    @RequestMapping("delete_BasArea")
    public int delete_BasArea(Short id){
        return basAreaService.deleteBasAreats(id);
    }

    @RequestMapping("insert_BasAreats")
    public int insert_BasAreats(BasArea basArea){
        System.out.println("添加");
        System.out.println(basArea);
        return basAreaService.inserteBasAreats(basArea);
    }

    @RequestMapping("update_BasAreats")
    public int update_BasAreats(BasArea basArea){
        System.out.println("修改");
        System.out.println(basArea);
        return basAreaService.updateBasAreats(basArea);
    }

}
