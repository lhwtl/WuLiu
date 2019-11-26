package com.hlp.controller;

import com.hlp.model.LogLogisticstransfer;
import com.hlp.services.LogLogisticstransferService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogLogisticstransferController {
    @Autowired
    private LogLogisticstransferService logLogisticstransferService;
@RequestMapping("selectLogLogisticstransferHlp")
    public Map<String,Object> selectLogLogisticstransferHlp(int pages,int rows,String transferint,String driver){
        Map<String,Object> map=new HashMap<>();
        List<LogLogisticstransfer> list=logLogisticstransferService.selectLogLogisticstransferHlp(pages, rows,transferint,driver);
        int max=logLogisticstransferService.selectLogLogisticstransferByMaxHlp();
        map.put("total",max);
        map.put("rows",list);
        return map;

    }
}
