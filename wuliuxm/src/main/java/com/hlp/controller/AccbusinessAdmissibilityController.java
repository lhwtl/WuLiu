package com.hlp.controller;

import com.hlp.model.AccBusinessadmissibility;

import com.hlp.services.AccBusinessadmissibilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccbusinessAdmissibilityController {
    @Autowired
    private AccBusinessadmissibilityServices accBusinessadmissibilityServices;
    @RequestMapping("selectHlpAccBusinessadmissibility")
    public Map<String,Object> selectHlpAccBusinessadmissibility(int pages, int rows,String telphone,String businessnoticeno){
        Map<String,Object> map=new HashMap<>();
        List<AccBusinessadmissibility> list= accBusinessadmissibilityServices.selectHlpAccBusinessadmissibility(pages,rows,telphone,businessnoticeno);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        for (AccBusinessadmissibility accBusinessadmissibility : list) {
           String time= sdf.format(accBusinessadmissibility.getAccWorkorder().getWorkgenerationtime());
           accBusinessadmissibility.getAccWorkorder().setWorkgenerationtimes(time);
        }


        int max=accBusinessadmissibilityServices.selectCountHlp();
        map.put("total",max);
        map.put("rows",list);

        for (AccBusinessadmissibility accBusinessadmissibility : list) {
            System.out.println(accBusinessadmissibility);
        }
        return map;
    }


}
