package com.hlp.controller;

import com.hlp.model.BasBasicarchives;
import com.hlp.services.BasBasicarchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasBasicarchivesController {
    @Autowired
    private BasBasicarchivesService basBasicarchivesService;
    @RequestMapping("select_BasBasicarchives")
    public List<BasBasicarchives> select_BasBasicarchives(){
        List<BasBasicarchives> list = basBasicarchivesService.selectBasBasicarchive();
        for(BasBasicarchives bb:list){
            System.out.println(bb.getName() + bb.getRemarks()+bb.getSyEmp().getEmpname());
        }
        return list;
    }
}
