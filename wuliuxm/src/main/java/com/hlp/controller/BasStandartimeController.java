package com.hlp.controller;

import com.hlp.model.BasStandartime;
import com.hlp.services.BasStandartimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class BasStandartimeController {
    @Autowired
    private BasStandartimeService basStandartimeService;
    @RequestMapping("select_BasStandartime")
    public List<BasStandartime> select_BasStandartime(){
        List<BasStandartime> list = basStandartimeService.selectBasStandartime();
        for (BasStandartime bb:list){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            //平时上班时间
            String format = sdf.format(bb.getWorkingtime());
            //平时下班时间
            String format2 =sdf.format(bb.getClosingtime());
            //周六上班时间
            String format3 =sdf.format(bb.getSaturdayworkingtime());
            //周六下班时间
            String format4 =sdf.format(bb.getSaturdayclosingtime());
            //周日上班时间
            String format5 =sdf.format(bb.getSundayworkingtime());
            //周日下班时间
            String format6 =sdf.format(bb.getSundayclosingtime());

            bb.setWorkingtime1(format);
            bb.setClosingtime1(format2);
            bb.setSaturdayworkingtime1(format3);
            bb.setSaturdayclosingtime1(format4);
            bb.setSundayworkingtime1(format5);
            bb.setSundayclosingtime1(format6);

            System.out.println(bb.getSyUnits().getName());

        }
        return list;
    }

}
