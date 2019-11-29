package com.hlp.controller;

import com.hlp.model.SorOutbounddetails;
import com.hlp.services.SorOutbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SorOutbounddetailsController {
    @Autowired
    private SorOutbounddetailsService sorOutbounddetailsService;

    /*查询详情*/
    @RequestMapping("FiillSorOutbounddetailsByid")
    public List<SorOutbounddetails> FiillSorOutbounddetailsByid(String packageid){
        System.out.println("值:"+packageid);
        List<SorOutbounddetails> sorOutbounddetails = sorOutbounddetailsService.FiillSorOutbounddetailsByid(packageid);
        return  sorOutbounddetails;
    }

}
