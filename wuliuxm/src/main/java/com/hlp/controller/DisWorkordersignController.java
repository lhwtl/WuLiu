package com.hlp.controller;

import com.hlp.model.DisWorkordersign;
import com.hlp.model.SyEmp;
import com.hlp.services.DisWorkordersignService;
import com.hlp.services.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class DisWorkordersignController {
    @Autowired
    private DisWorkordersignService disWorkordersignService;
    @Autowired
    private SyEmpService syEmpService;

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
//添加签收录入

    @RequestMapping("addDisWorkordersignHlp")
    public int addDisWorkordersignHlp(DisWorkordersign disWorkordersign){
        disWorkordersign.setInputtime(new Date());
        disWorkordersign.setSigntime(new Date());
        disWorkordersign.setInvalidatemark((short)1);
        int i= disWorkordersignService.addDisWorkordersignHlp(disWorkordersign);
        return i;
    }
    //修改签收录入
    @RequestMapping("updateDisWorkordersignHlp")
    public int updateDisWorkordersignHlp(DisWorkordersign disWorkordersign){
        int i=disWorkordersignService.updateDisWorkordersignHlp(disWorkordersign);
        return i;
    }


}
