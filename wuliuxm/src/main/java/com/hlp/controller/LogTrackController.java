package com.hlp.controller;

import com.hlp.model.LogTrack;
import com.hlp.services.LogTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogTrackController {
    @Autowired
    private LogTrackService logTrackService;
    @RequestMapping ("selectLogTrackHLP")
    public Map<String,Object> selectLogTrackHLP(int pages, int rows,String linename,String logisticscar){
        Map<String,Object> map=new HashMap<>();
       List<LogTrack> list= logTrackService.selectLogTrackHLP(pages, rows,linename,logisticscar);
       int max=logTrackService.selectLogTrackByMaxHlp();
       map.put("total",max);
       map.put("rows",list);
       return map;
    }

}
