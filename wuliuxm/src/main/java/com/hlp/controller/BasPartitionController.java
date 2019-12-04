package com.hlp.controller;

import com.hlp.model.BasPartition;
import com.hlp.services.BasPartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class BasPartitionController {
    @Autowired
    private BasPartitionService basPartitionService;
    @RequestMapping("select_BasPartition")
    public List<BasPartition> select_BasPartition(){
        List<BasPartition> list = basPartitionService.selectBasPartition();
        return list;
    }
    @RequestMapping("delete_BasPartition")
    public int delete_BasPartition(Short id){
        return basPartitionService.deleteBasPartitionts(id);
    }

    @RequestMapping("insert_BasPartition")
    public int insert_BasPartition(BasPartition basPartition){
        return basPartitionService.insertBasPartitionts(basPartition);
    }

    @RequestMapping("update_BasPartition")
    public int update_BasPartition(BasPartition basPartition){
        return basPartitionService.updateBasPartitionts(basPartition);
    }
}
