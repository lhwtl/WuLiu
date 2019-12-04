package com.hlp.controller;

import com.hlp.model.AccWorksheet;
import com.hlp.services.AccWorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class AccWorksheetController {
    @Autowired
    private AccWorksheetService accWorksheetService;
    @RequestMapping("insert_AccWorksheet")
    public int insert_AccWorksheet(AccWorksheet accWorksheet){
        System.out.println("添加");
        System.out.println("A:"+accWorksheet);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String ywd=sdf.format(new Date());
        accWorksheet.setWorksheetno("GZDH"+ywd);
        return accWorksheetService.insertAccWorksheetts(accWorksheet);
    }
}
