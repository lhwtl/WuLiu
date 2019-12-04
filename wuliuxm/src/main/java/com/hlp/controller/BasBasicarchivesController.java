package com.hlp.controller;

import com.hlp.model.BasBasicarchives;
import com.hlp.services.BasBasicarchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class BasBasicarchivesController {
    @Autowired
    private BasBasicarchivesService basBasicarchivesService;
    @RequestMapping("select_BasBasicarchives")
    public List<BasBasicarchives> select_BasBasicarchives(){
        List<BasBasicarchives> list = basBasicarchivesService.selectBasBasicarchive();
        for(BasBasicarchives bb:list){
            String aa="JC00"+bb.getId();
            bb.setNameid(aa);
        }
        return list;
    }

    @RequestMapping("delete_BasBasicarchives")
    public int delete_BasBasicarchives(Short id){
        return basBasicarchivesService.deleteBasBasicarchivesIdts(id);
    }

    @RequestMapping("insert_BasBasicarchivests")
    public int insert_BasBasicarchivests(BasBasicarchives basBasicarchives){
        System.out.println("添加");
        System.out.println(basBasicarchives);
        basBasicarchives.setOperationtime(new Date());
        return basBasicarchivesService.insertBasBasicarchivesIdts(basBasicarchives);
    }

    @RequestMapping("update_BasBasicarchivests")
    public int update_BasBasicarchivests(BasBasicarchives basBasicarchives){
        System.out.println("修改");
        System.out.println(basBasicarchives);
        return basBasicarchivesService.updateBasBasicarchivesIdts(basBasicarchives);
    }
}
