package com.hlp.controller;

import com.hlp.model.BasShuttlebus;
import com.hlp.model.LogTrack;
import com.hlp.services.BasShuttlebusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BasShuttlebusController  {
    @Autowired
    private BasShuttlebusService basShuttlebusService;
    @RequestMapping("select_BasShuttlebus")
    public List<BasShuttlebus> select_BasShuttlebus(){
        List<BasShuttlebus> list=basShuttlebusService.selectBasShuttlebus();
        for (BasShuttlebus bb:list){
            SimpleDateFormat sdf = new SimpleDateFormat();
            String format = sdf.format(bb.getOperationtime());
            bb.setTime(format);

            System.out.println(bb.getId());
        }
        return list;
    }


    @RequestMapping("selectBasShuttlebusHLP")
    public Map<String,Object> selectBasShuttlebusHLP(int pages,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BasShuttlebus> list=basShuttlebusService.selectBasShuttlebusHLP(pages, rows);
        int max=basShuttlebusService.selectBasShuttlebusByMax();
        map.put("total",max);
        map.put("rows",list);
        return map;
    }
}
