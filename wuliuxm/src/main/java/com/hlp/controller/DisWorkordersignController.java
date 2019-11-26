package com.hlp.controller;

import com.hlp.model.DisWorkordersign;
import com.hlp.services.DisWorkordersignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisWorkordersignController {
    @Autowired
    private DisWorkordersignService disWorkordersignService;

    //签收录入
    @RequestMapping("selectDisWorkordersignHlp")
    public Map<String,Object> selectDisWorkordersignHlp(int pages, int rows,String worksheetno,String recipient){
        Map<String,Object> map=new HashMap<>();
        List<DisWorkordersign> list=disWorkordersignService.selectDisWorkordersignHlp(pages, rows,worksheetno,recipient);
        int max=disWorkordersignService.selectDisWorkordersignMaxHlp();
        map.put("total",max);
        map.put("rows",list);
        System.out.println(list);
        return map;

    }

    //确认取消签收录入
    @RequestMapping("selectDisWorkordersignQSslrHlp")
    public Map<String,Object> selectDisWorkordersignQSslrHlp(int pages, int rows,String worksheetno){
        Map<String,Object> map=new HashMap<>();
        List<DisWorkordersign> list=disWorkordersignService.selectDisWorkordersignQSslrHlp(pages, rows,worksheetno);
        int max=disWorkordersignService.selectDisWorkordersignMaxHlp();
        map.put("total",max);
        map.put("rows",list);
        System.out.println(list);
        return map;

    }



}
