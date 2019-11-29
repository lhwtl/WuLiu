package com.hlp.controller;

import com.hlp.model.AccWorksheet;
import com.hlp.services.AccWorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccWorksheetController {
    @Autowired
    private AccWorksheetService accWorksheetService;
    @RequestMapping("insert_AccWorksheet")
    public int insert_AccWorksheet(AccWorksheet accWorksheet){
        System.out.println("添加");
        System.out.println("A:"+accWorksheet);
        return accWorksheetService.insertAccWorksheetts(accWorksheet);
    }
}
