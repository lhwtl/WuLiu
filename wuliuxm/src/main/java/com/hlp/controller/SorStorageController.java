package com.hlp.controller;

import com.hlp.model.SorStorage;
import com.hlp.services.SorStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SorStorageController {
    @Autowired
    private SorStorageService sorStorageService;

    @RequestMapping("FillAllSorStorageLx")
    public List<SorStorage> FillAllSorStorageLx(){
        List<SorStorage> sorStorages = sorStorageService.FillAllSorStorageLx();
        for (SorStorage sorStorage : sorStorages) {
            System.out.println(sorStorage.getSyEmp().getSyUnits());
            System.out.println("入库:"+sorStorage);
        }
        return sorStorages;
    }
}
