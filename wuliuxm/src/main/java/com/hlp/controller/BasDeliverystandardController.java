package com.hlp.controller;

import com.hlp.model.BasDeliverystandard;
import com.hlp.services.BasDeliverystandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//收派标准表
@RestController

public class BasDeliverystandardController {
    @Autowired
    private BasDeliverystandardService basDeliverystandardService;
    //查询
    @RequestMapping("select_BasDeliverystandard")
    public List<BasDeliverystandard> select_BasDeliverystandard(){
        List<BasDeliverystandard> list =basDeliverystandardService.selectBasDeliverystandardts();


        for (BasDeliverystandard bb:list){
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(bb.getOperationtime());
            bb.setTime(format);

        }
        return list;
    }

    //添加
    @RequestMapping("insert_BasDeliverystandard")
    public int insert_BasDeliverystandard(BasDeliverystandard bd, Short cancal ){
        System.out.println(cancal);
        System.out.println("000");
        bd.setOperationtime(new Date());
        System.out.println(bd);
        return basDeliverystandardService.insertBasDeliverystandardts(bd);
    }
    //删除
    @RequestMapping("delete_BasDeliverystandard")
    public int delete_BasDeliverystandard(Short id){
        System.out.println("AA");
       return basDeliverystandardService.deleteBasDeliverystandardts(id);
    }
    //byid
    @RequestMapping("byid_BasDeliverystandard")
    public BasDeliverystandard byid_BasDeliverystandard(Short id){
        System.out.println("byid");
        BasDeliverystandard basDeliverystandard = basDeliverystandardService.selectBasDeliverystandardByidts(id);
        System.out.println(basDeliverystandard.getId());
        return basDeliverystandard;
    }

    //修改
    @RequestMapping("update_BasDeliverystandard")
    public int update_BasDeliverystandard(BasDeliverystandard basDeliverystandard){
        basDeliverystandard.setOperationtime(new Date());
        System.out.println(basDeliverystandard.getCancel());
        System.out.println(basDeliverystandard);
        int i = basDeliverystandardService.updateBasDeliverystandardts(basDeliverystandard);

        System.out.println("修改："+i);
        return i;
    }

}
