package com.hlp.controller;

import com.hlp.model.SorCheckbounddetails;
import com.hlp.services.SorCheckbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SorCheckbounddetailsController {
    @Autowired
    private SorCheckbounddetailsService sorCheckbounddetailsService;
    /*查询详情*/
    @RequestMapping("FillSSorCheckbounddetailspackagesByidLx")
    public List<SorCheckbounddetails> FillSSorCheckbounddetailspackageByidLx(String packageid){
        List<SorCheckbounddetails> sorCheckbounddetails = sorCheckbounddetailsService.FillSSorCheckbounddetailspackageByidLx("PK"+packageid);
        System.out.println(sorCheckbounddetails);
        return sorCheckbounddetails;
    }
    @RequestMapping("FillSSorCheckbounddetailspackagesByidQKLx")
    public List<SorCheckbounddetails> FillSSorCheckbounddetailspackagesByidQKLx(String packageid){
        List<SorCheckbounddetails> sorCheckbounddetails = sorCheckbounddetailsService.FillSSorCheckbounddetailspackageByidLx(packageid);
        System.out.println(sorCheckbounddetails);
        return sorCheckbounddetails;
    }
    /*id查询单个*/
    @RequestMapping("FillSSorCheckbounddetailsByidLx")
    public SorCheckbounddetails FillSSorCheckbounddetailsByidLx(int id){
        SorCheckbounddetails sorCheckbounddetails = sorCheckbounddetailsService.FillSSorCheckbounddetailsByidLx(id);
        return sorCheckbounddetails;
    }
   /*删除单个*/
    @RequestMapping("deleteSorCheckbounddetailsByidLx")
    public void deleteSorCheckbounddetailsByidLx(int id){
        sorCheckbounddetailsService.deleteSorCheckbounddetailsByidLx(id);
    }
    /*删除详情    主表删除同事删除详情   主表以写*/
    @RequestMapping("deleteSorCheckbounddetailsLx")
    public void deleteSorCheckbounddetailsLx(String packageid){
        sorCheckbounddetailsService.deleteSorCheckbounddetailsLx("PK"+packageid);
    }
    /*新增*/
    @RequestMapping("insertSorCheckbounddetailsLx")
    public void insertSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails){
        Date date=new Date();
        int rs=(int) date.getTime();
        sorCheckbounddetails.setId(-rs);
        sorCheckbounddetails.setPackageid("PK"+sorCheckbounddetails.getPackageid());
        sorCheckbounddetails.setStoragedate(date);
        System.out.println("zhiA:"+sorCheckbounddetails);
        sorCheckbounddetailsService.insertSorCheckbounddetailsLx(sorCheckbounddetails);
    }
    /*修改*/
    @RequestMapping("updateSorCheckbounddetailsLx")
    public void updateSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails){
        System.out.println("zhi:"+sorCheckbounddetails);
        sorCheckbounddetails.setStoragedate(new Date());
        sorCheckbounddetailsService.updateSorCheckbounddetailsLx(sorCheckbounddetails);
    }


}
