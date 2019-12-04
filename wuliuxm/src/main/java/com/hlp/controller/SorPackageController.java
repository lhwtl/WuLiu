package com.hlp.controller;

import com.hlp.model.SorPackage;
import com.hlp.services.SorPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SorPackageController {

    @Autowired
    private SorPackageService packageService;

    @RequestMapping("FillSorPackageLX")
    public List<SorPackage> FillSorPackageLX(){
        List<SorPackage> sorPackages = packageService.FillSorPackageLX();
        return sorPackages;
    }



}
