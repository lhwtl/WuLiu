package com.hlp.controller;

import com.hlp.model.RetReturnlist;
import com.hlp.services.RetReturnlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RetReturnlistController {
    @Autowired
    private RetReturnlistService retReturnlistService;

    @RequestMapping("selectRetReturnlistHlp")
    public Map<String,Object> selectRetReturnlistHlp(int pages, int rows,String worksheetno){
        Map<String ,Object> map=new HashMap<>();
        int max=retReturnlistService.selectRetReturnlistMaxHlp();
        List<RetReturnlist> list=retReturnlistService.selectRetReturnlistHlp(pages, rows,worksheetno);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (RetReturnlist retReturnlist : list) {
            String time=sdf.format(retReturnlist.getConfirmationtime());
            String time1=sdf.format(retReturnlist.getEntrytime());
            String time2=sdf.format(retReturnlist.getRecordingtime());
            retReturnlist.setConfirmationtimes(time);
            retReturnlist.setEntrytimes(time1);
            retReturnlist.setRecordingtimes(time2);
        }
        map.put("total",max);
        map.put("rows",list);
        return map;
    }

    //申请返货单
    @RequestMapping("selectRetReturnlistScfhdHlp")
    public Map<String,Object> selectRetReturnlistScfhdHlp(int pages, int rows,String worksheetno){
        Map<String ,Object> map=new HashMap<>();
        int max=retReturnlistService.selectRetReturnlistMaxHlp();
        List<RetReturnlist> list=retReturnlistService.selectRetReturnlistScfhdHlp(pages, rows,worksheetno);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (RetReturnlist retReturnlist : list) {
            String time=sdf.format(retReturnlist.getConfirmationtime());
            String time1=sdf.format(retReturnlist.getEntrytime());
            String time2=sdf.format(retReturnlist.getRecordingtime());
            retReturnlist.setConfirmationtimes(time);
            retReturnlist.setEntrytimes(time1);
            retReturnlist.setRecordingtimes(time2);
        }
        map.put("total",max);
        map.put("rows",list);
        return map;
    }
}
