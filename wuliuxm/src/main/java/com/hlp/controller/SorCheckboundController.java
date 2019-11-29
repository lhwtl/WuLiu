package com.hlp.controller;

import com.hlp.model.SorCheckbound;
import com.hlp.services.SorCheckboundService;
import com.hlp.services.SorCheckbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SorCheckboundController {

    @Autowired
    private SorCheckboundService sorCheckboundService;
    @Autowired
    private SorCheckbounddetailsService sorCheckbounddetailsService;

    /*全部*/
    @RequestMapping("FillSorCheckboundLx")
    public List<SorCheckbound> FillSorCheckboundLx(){
        List<SorCheckbound> sorCheckbounds = sorCheckboundService.FillSorCheckboundLx();
        return sorCheckbounds;
    }
    /*id*/
    @RequestMapping("FillSorCheckboundByidLx")
    public List<SorCheckbound> FillSorCheckboundByidLx(int id){
        List<SorCheckbound> sorCheckbounds = sorCheckboundService.FillSorCheckboundByidLx(id);
        return sorCheckbounds;
    }
   /*删除*/
    @RequestMapping("deleteSorCheckbound")
    public void deleteSorCheckbound(int id){
          sorCheckboundService.deleteSorCheckbound(id);
          sorCheckbounddetailsService.deleteSorCheckbounddetailsLx("PK"+id);
    }
    /*修改*/
    @RequestMapping("updateSorCheckboundLx")
    public void updateSorCheckboundLx(SorCheckbound sorCheckbound){
        System.out.println("值:"+sorCheckbound);
        sorCheckboundService.updateSorCheckboundLx(sorCheckbound);
    }
    /*新增*/
    @RequestMapping("insertSorCheckboundLx")
    public void insertSorCheckboundLx(SorCheckbound sorCheckbound){
        //生成单号
        Date date=new Date();
        int rs=(int) date.getTime();
        sorCheckbound.setId(-rs);
        sorCheckbound.setCheckdate(new Date());
        System.out.println("值:"+sorCheckbound);
        sorCheckboundService.insertSorCheckboundLx(sorCheckbound);
    }


}
