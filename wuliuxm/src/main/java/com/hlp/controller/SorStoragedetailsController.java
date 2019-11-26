package com.hlp.controller;

import com.alibaba.fastjson.JSONObject;
import com.hlp.model.SorStorage;
import com.hlp.model.SorStoragedetails;
import com.hlp.services.SorStorageService;
import com.hlp.services.SorStoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        List<SorStoragedetails> sorStoragedetails = sorStoragedetailsService.FillSorStoragedetailsByidLx(id);
        return sorStoragedetails;
    }
    /*超级新增*/
    @RequestMapping("insertStoragedetailsByidLx")
    public int insertStoragedetailsByidLx(SorStorage sorStorage ){
        System.out.println("进方法");
        //生成入库交接单号
        Date date=new Date();

        int rs=(int) date.getTime();
        System.out.println(rs);
        System.out.println(-rs);
        //设置入库交接单号
        sorStorage.setId(rs);
        //设置当前时间
        sorStorage.setAcceptdate(date);
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
    public int updateStoragedetailsByidLx(SorStoragedetails sorStoragedetails){
        System.out.println("修改:"+sorStoragedetails);
        int i = sorStoragedetailsService.updateStoragedetailsByidLx(sorStoragedetails);
        return  i;
    }


}
