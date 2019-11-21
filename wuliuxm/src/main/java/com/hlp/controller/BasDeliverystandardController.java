package com.hlp.controller;

import com.hlp.model.BasDeliverystandard;
import com.hlp.services.BasDeliverystandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

//收派标准表
@RestController

public class BasDeliverystandardController {
    @Autowired
    private BasDeliverystandardService basDeliverystandardService;
    @RequestMapping("select_BasDeliverystandard")
    public List<BasDeliverystandard> select_BasDeliverystandard(){
        List<BasDeliverystandard> list = basDeliverystandardService.selectBasDeliverystandard();


        for (BasDeliverystandard bb:list){
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(bb.getOperationtime());
            bb.setTime(format);

        }
        return list;
    }
}
