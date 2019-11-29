package com.hlp.controller;

import com.hlp.model.LogLogistics;
import com.hlp.model.LogTrack;
import com.hlp.services.IaeLineresourceService;
import com.hlp.services.LogLogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogLogisticsController {
    @Autowired
    private LogLogisticsService logLogisticsService;
    @Autowired
    private IaeLineresourceService iaeLineresourceService;
    @RequestMapping("selectLogLogisticsHLP")
    public Map<String,Object> selectLogLogisticsHLP(int pages, int rows,String logisticsint,String linename){
        Map<String,Object> map=new HashMap<>();
       List<LogLogistics> list= logLogisticsService.selectLogLogisticsHLP(pages, rows,logisticsint,linename);
       int max=logLogisticsService.selectLogLogisticsByMaxHLP();
       map.put("total",max);
       map.put("rows",list);
       return map;
    }
}
