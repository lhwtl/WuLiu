package com.hlp.controller;

import com.hlp.model.PacPackagingc;
import com.hlp.services.PacPackagingcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacPackagingcController {
    @Autowired
    private PacPackagingcService service;
    @RequestMapping("selectPacPackagingc")
    public List<PacPackagingc> selectPacPackagingc(){
        List<PacPackagingc> list=service.selectPacPackagingc();
        for (PacPackagingc packagingc : list) {
            System.out.println(packagingc);
        }
        return list;
    }
}
