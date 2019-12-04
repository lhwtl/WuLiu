package com.hlp.controller;

import com.hlp.model.BasZoneinfo;
import com.hlp.services.BasZoneinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class BasZoneinfoContoller {
    @Autowired
    private BasZoneinfoService basZoneinfoService;

    @RequestMapping("select_BasZoneinfo")
    public List<BasZoneinfo> select_BasZoneinfo(){
        List<BasZoneinfo> list = basZoneinfoService.selectBasZoneinfo();
        return list;
    }
    @RequestMapping("delete_BasZoneinfo")
    public int delete_BasZoneinfo(short id){
        return basZoneinfoService.deleteBasZoneinfoZonecodets(id);
    }

    @RequestMapping("insert_BasZoneinfots")
    public int insert_BasZoneinfots(BasZoneinfo basZoneinfo,int id){
        System.out.println("添加");

        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String pj=sdf.format(new Date());
        basZoneinfo.setZonecode("DQ"+pj);
        System.out.println(basZoneinfo);
        return basZoneinfoService.insertBasZoneinfoZonecodets(basZoneinfo);
    }

    @RequestMapping("update_BasZoneinfots")
    public int update_BasZoneinfots(BasZoneinfo basZoneinfo){
        System.out.println("修改");
        System.out.println(basZoneinfo);
        return basZoneinfoService.updateBasZoneinfoZonecodets(basZoneinfo);
    }

    //根据结果集查询定区编码
    @RequestMapping("selectBasZoninfoJgjByts")
    public List<BasZoneinfo> selectBasZoninfoJgjByts(){
        List<BasZoneinfo> list=basZoneinfoService.selectBasZoninfoJgjByts();
        return list;

    }
}
