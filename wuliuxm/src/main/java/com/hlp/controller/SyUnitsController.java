package com.hlp.controller;

import com.hlp.model.SyUnits;
import com.hlp.services.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SyUnitsController {
    @Autowired
    private SyUnitsService syUnitsService;

    @RequestMapping("FillAllSyUnitsLx")
    public List<SyUnits> FillAllSyUnitsLx(){
        List<SyUnits> syUnits = syUnitsService.FillAllSyUnitsLx();
        System.out.println("公司:"+syUnits);
        return syUnits;
    }
}
