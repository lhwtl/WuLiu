package com.hlp.controller;

import com.alibaba.fastjson.JSONObject;
import com.hlp.model.SorOutbound;
import com.hlp.model.SorOutbounddetails;
import com.hlp.model.SorStoragedetails;
import com.hlp.services.SorOutboundService;
import com.hlp.services.SorOutbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SorOutboundController {
    @Autowired
    private SorOutboundService sorOutboundService;
    @Autowired
    private SorOutbounddetailsService sorOutbounddetailsService;

    /*查询全部*/
    @RequestMapping("FillSorOutboundLx")
    public List<SorOutbound> FillSorOutboundLx(){
        List<SorOutbound> sorOutbounds = sorOutboundService.FillSorOutboundLx();
        System.out.println("A:"+sorOutbounds);
        return sorOutbounds;
    }
    /*主表和详情删除*/
    @RequestMapping("deleteSorOutboundLx")
    public void deleteSorOutboundLx(int id ,String packageid){
        System.out.println(id+" ABC  "+packageid);
        sorOutboundService.deleteSorOutboundLx(id);/*删除主*/
        sorOutbounddetailsService.deleteSorOutbounddetailsLx("CK-"+id);/*删除详情*/
    }
    /*新增主表和详情*/
    @RequestMapping("insertSorOutboundLx")
    public void insertSorOutboundLx(SorOutbound sorOutbound){
        System.out.println("进方法");
        System.out.println("A+:"+sorOutbound);
        //生成入库交接单号
        Date date=new Date();
        int rs=(int) date.getTime();
        System.out.println(rs);
        //设置入库交接单号
        sorOutbound.setId(-rs);
        //设置当前时间
        sorOutbound.setDeliverydate(date);
        sorOutbound.setEnterdate(date);
        List<SorOutbounddetails> list = new ArrayList<>();
        // contantUser 需要转的字符串，DoVendorCon   tantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(sorOutbound.getList(), SorOutbounddetails.class);
        //调用添加入库的方法
        sorOutboundService.insertSorOutboundLx(sorOutbound);
        //单号
        int i=1;
        for (SorOutbounddetails s : list) {
            //设置出库关联表
            String ck="CK"+rs;
            s.setPackageid(ck);
            ++i;
            s.setId((int)(-rs+i));
            s.setScandate(new Date());
            //添加入库详情
            System.out.println("??"+s);
            sorOutbounddetailsService.insertSorOutbounddetailsLx(s);
            System.out.println(s);
        }
        System.out.println(sorOutbound);
    }
    /*修改主表和详情*/
    @RequestMapping("updateSorOutboundLx")
    public void updateSorOutboundLx(SorOutbound sorOutbound){
      //  sorOutboundService.updateSorOutboundLx(sorOutbound);
        System.out.println("进方法"+sorOutbound);
        sorOutbound.setDeliverydate(new Date());
        sorOutbound.setEnterdate(new Date());
        List<SorOutbounddetails> list = new ArrayList<>();
        // contantUser 需要转的字符串，DoVendorCon   tantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(sorOutbound.getList(), SorOutbounddetails.class);
        //调用添加入库的方法
        sorOutboundService.updateSorOutboundLx(sorOutbound);
        //单号
        int i=1;
        for (SorOutbounddetails s : list) {
           i++;
            //添加入库详情
            s.setScandate(new Date());
            sorOutbounddetailsService.updateSorOutbounddetailsLx(s);
            System.out.println(s);
        }
        System.out.println(sorOutbound);
    }



}
