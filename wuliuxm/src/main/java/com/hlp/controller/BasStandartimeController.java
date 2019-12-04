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



        return list;
    }

    @RequestMapping("delete_BasStandartime")
    public int delete_BasStandartime(short id){
        return basStandartimeService.deleteBasStandartimets(id);
    }

    @RequestMapping("insert_BasStandartimets")
    public int insert_BasStandartimets(BasStandartime basStandartime){
        System.out.println("添加");
        System.out.println(basStandartime);
        return basStandartimeService.insertBasStandartimets(basStandartime);
    }

    @RequestMapping("update_BasStandartimets")
    public int update_BasStandartimets(BasStandartime basStandartime){
        System.out.println("修改");
        System.out.println(basStandartime);
        return basStandartimeService.updateBasStandartimets(basStandartime);
    }

}
