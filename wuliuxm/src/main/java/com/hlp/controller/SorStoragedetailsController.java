package com.hlp.controller;


import com.alibaba.fastjson.JSONObject;
import com.hlp.model.SorStorage;
import com.hlp.model.SorStoragedetails;
import com.hlp.services.SorStorageService;
import com.hlp.services.SorStoragedetailsService;
import com.sun.org.apache.xpath.internal.functions.FuncSubstring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SorStoragedetailsController {
    @Autowired
    private SorStoragedetailsService sorStoragedetailsService;
    @Autowired
    private SorStorageService sorStorageService;

    @RequestMapping("FillSorStoragedetailsByidLx")
    public List<SorStoragedetails> FillSorStoragedetailsByidLx(int id){
        System.out.println("编号:"+id);
        String ck="CK"+id;
        List<SorStoragedetails> sorStoragedetails = sorStoragedetailsService.FillSorStoragedetailsByidLx(ck);
        return sorStoragedetails;
    }
    /*超级新增*/
    @RequestMapping("insertStoragedetailsByidLx")
    public int insertStoragedetailsByidLx(SorStorage sorStorage ){
        System.out.println("op"+sorStorage);
        System.out.println("进方法");
        //生成入库交接单号
        Date date=new Date();

        int rs=(int) date.getTime();
        System.out.println(rs);
        //设置入库交接单号
        sorStorage.setId(-rs);
        //设置当前时间
        sorStorage.setAcceptdate(new Date());
        System.out.println("op"+sorStorage);
        List<SorStoragedetails> list = new ArrayList<>();
        // contantUser 需要转的字符串，DoVendorCon   tantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(sorStorage.getList(), SorStoragedetails.class);

        //调用添加入库的方法
        int i1 = sorStorageService.insertSorStorageLx(sorStorage);
        //单号
        int i=1;
        for (SorStoragedetails storagedetails : list) {

            //设置出库关联表
            String ck="CK"+rs;
            storagedetails.setOutboundid(ck);

            ++i;
            storagedetails.setId((short)(rs+i));
            //添加入库详情
            int i2 = sorStoragedetailsService.insertStoragedetailsByidLx(storagedetails);
            System.out.println(storagedetails);

        }
        System.out.println(sorStorage);



        System.out.println("新增:"+sorStorage);
       // int i = sorStorageService.insertSorStorageLx(sorStorage);

        //int i = sorStoragedetailsService.insertStoragedetailsByidLx(sorStoragedetails);
        return i1;
    }
    /*修改*/
    @RequestMapping("updateStoragedetailsByidLx")
    public void updateStoragedetailsByidLx(SorStorage sorStorage ){

        //设置当前时间
        sorStorage.setAcceptdate(new Date());
        List<SorStoragedetails> list = new ArrayList<>();
        // contantUser 需要转的字符串，DoVendorCon   tantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(sorStorage.getList(), SorStoragedetails.class);
        //调用添加入库的方法
        int i1 = sorStorageService.updateSorStorageLx(sorStorage);
        //单号
        int i=1;
        for (SorStoragedetails storagedetails : list) {
            ++i;
            //添加入库详情
            int i2 = sorStoragedetailsService.updateStoragedetailsByidLx(storagedetails);
            System.out.println(storagedetails);
        }
        System.out.println(sorStorage);
    }
    /*删除  和删除详情*/
    @RequestMapping("deleteSorStorageLx")
    public void deleteSorStorageLx(int id){
        System.out.println("编号:"+id);
        int i = sorStorageService.deleteSorStorageLx(id);
        String ck="CK"+id;
        int aa = sorStoragedetailsService.deleteSorStoragedetailsByidLx(ck);

    }




    /*库存*/
    @RequestMapping("FilSorStoragedetailsKcLX")
    public List<SorStoragedetails> FilSorStoragedetailsKcLX(){
        List<SorStoragedetails> sorStoragedetails = sorStoragedetailsService.FilSorStoragedetailsKcLX();
        for (SorStoragedetails sorStoragedetail : sorStoragedetails) {
            String pid = sorStoragedetail.getOutboundid().substring(3);
            System.out.println("截取"+pid);
            int id = Integer.parseInt(pid);
            /*查出全部详情  截取CK-  在吧截取后的值  放入查询单个入库
            * 在吧当个入库的值  放入详情的入库关系中形成一对一*/
            /*SorStorage sorStorage = sorStorageService.FillSorStorageKCLX(id);
            System.out.println("??"+sorStorage);*/
            sorStoragedetail.setSorStorage(sorStorageService.FillSorStorageKCLX(id));
            System.out.println(sorStoragedetail);
        }
        /*FillSorStorageByidLX*/
        return sorStoragedetails;
    }

}
