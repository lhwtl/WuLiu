package com.hlp.controller;

import com.hlp.model.BasSubstitute;
import com.hlp.services.BasSubstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class BasSubstituteController {
    @Autowired
    private BasSubstituteService basSubstituteService;
    @RequestMapping("select_BasSubstitute")
    public List<BasSubstitute> select_BasSubstitute(){
        List<BasSubstitute> list = basSubstituteService.selectBasSubstitute();
        for (BasSubstitute bb:list){
            System.out.println(bb.getBasBasicarchives().getName());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(bb.getSyUnits().getOperationtime());
            bb.getSyUnits().setTime(format);
            System.out.println(format);
        }
        return list;
    }

    @RequestMapping("delete_BasSubstitute")
    public int delete_BasSubstitute(Short id){
      return basSubstituteService.deleteBasSubstitutets(id);
    }

    @RequestMapping("insert_BasSubstitute")
    public int insert_BasSubstitute(BasSubstitute basSubstitute){
        System.out.println("添加");
        System.out.println(basSubstitute);
        return basSubstituteService.insertBasSubstitutets(basSubstitute);

    }

    @RequestMapping("update_BasSubstitute")
    public int update_BasSubstitute(BasSubstitute basSubstitute){
        System.out.println("修改");
        System.out.println(basSubstitute);
        return basSubstituteService.updateBasSubstitutets(basSubstitute);

    }
}
