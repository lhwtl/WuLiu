package com.hlp.controller;

import com.hlp.model.BasPartition;
import com.hlp.services.BasPartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasPartitionController {
    @Autowired
    private BasPartitionService basPartitionService;
    @RequestMapping("select_BasPartition")
    public List<BasPartition> select_BasPartition(){
        List<BasPartition> list = basPartitionService.selectBasPartition();
        for(BasPartition bb:list){
            System.out.println(bb.getBasZoneinfo().getZonecode());
        }
        return list;
    }
}
