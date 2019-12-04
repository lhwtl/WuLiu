package com.hlp.controller;

import com.hlp.model.SorStorage;
import com.hlp.model.SyEmp;
import com.hlp.services.SorStorageService;
import com.hlp.services.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SorStorageController {
    @Autowired
    private SorStorageService sorStorageService;
    @Autowired
    private SyEmpService syEmpService;
    @RequestMapping("FillAllSorStorageLx")
    public List<SorStorage> FillAllSorStorageLx(){

        List<SorStorage> sorStorages = sorStorageService.FillAllSorStorageLx();
        System.out.println("A"+sorStorages);
        for (SorStorage sorStorage : sorStorages) {
            System.out.println("C"+sorStorage.getSyEmp().getSyUnits());
            System.out.println("入库:"+sorStorage);
        }
        return sorStorages;
    }

    /*库存查询*/
    @RequestMapping("FillKuChunSorStorageLx")
    public List<SorStorage> FillKuChunSorStorageLx(){
        List<SorStorage> sorStorages = sorStorageService.FillKuChunSorStorageLx();
        for (SorStorage sorStorage : sorStorages) {
            System.out.println(sorStorage.getSorStoragedetails());
        }
        System.out.println(sorStorages);
        return sorStorages;
    }


}
