package com.hlp.controller;

import com.hlp.model.LogTrack;
import com.hlp.services.LogTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogTrackController {
    @Autowired
    private LogTrackService logTrackService;
    //查询跟踪表
    @RequestMapping ("selectLogTrackHLP")
    public Map<String,Object> selectLogTrackHLP(int pages, int rows,String linename,String logisticscar){
        Map<String,Object> map=new HashMap<>();
       List<LogTrack> list= logTrackService.selectLogTrackHLP(pages, rows,linename,logisticscar);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (LogTrack logTrack : list) {
            logTrack.setStarttimes(sdf.format(logTrack.getStarttime()));
            logTrack.setArrivaltimes(sdf.format(logTrack.getArrivaltime()));
        }
       int max=logTrackService.selectLogTrackByMaxHlp();
       map.put("total",max);
       map.put("rows",list);
       return map;
    }

    //根据id 删除跟踪表
    @RequestMapping("delectLogTrackByidHlp")
    public void delectLogTrackByidHlp(int id){
        logTrackService.delectLogTrackByidHlp(id);
    }

}
