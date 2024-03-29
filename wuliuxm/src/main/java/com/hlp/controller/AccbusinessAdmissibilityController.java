
package com.hlp.controller;

import com.hlp.model.AccBusinessadmissibility;

import com.hlp.model.SyEmp;
import com.hlp.services.AccBusinessadmissibilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class AccbusinessAdmissibilityController {
    @Autowired
    private AccBusinessadmissibilityServices accBusinessadmissibilityServices;
    //查台转单
    @RequestMapping("selectHlpAccBusinessadmissibility")
    public Map<String,Object> selectHlpAccBusinessadmissibility(int pages, int rows, String telphone, String businessnoticeno){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Map<String,Object> map=new HashMap<>();
        List<AccBusinessadmissibility> list= accBusinessadmissibilityServices.selectHlpAccBusinessadmissibility(pages,rows,telphone,businessnoticeno);
        for (AccBusinessadmissibility accBusinessadmissibility : list) {
           String time= sdf.format(accBusinessadmissibility.getAccWorkorder().getWorkgenerationtime());
           accBusinessadmissibility.getAccWorkorder().setWorkgenerationtimes(time);
           String time1=sdf.format(accBusinessadmissibility.getReservationtime());
           accBusinessadmissibility.setReservationtimes(time1);
        }
        int max=accBusinessadmissibilityServices.selectCountHlp();
        map.put("total",max);
        map.put("rows",list);

        for (AccBusinessadmissibility accBusinessadmissibility : list) {
            System.out.println(accBusinessadmissibility);
        }
        return map;
    }

//人工调度模糊查询
    @RequestMapping("selectHlpAccBusinessadmissibilityRgdd")
    public Map<String,Object> selectHlpAccBusinessadmissibilityRgdd(int pages, int rows,short processingunit,String businessnoticeno){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Map<String,Object> map=new HashMap<>();
        List<AccBusinessadmissibility> list= accBusinessadmissibilityServices.selectHlpAccBusinessadmissibilityRgdd(pages, rows,processingunit,businessnoticeno)
;        for (AccBusinessadmissibility accBusinessadmissibility : list) {
            String time= sdf.format(accBusinessadmissibility.getAccWorkorder().getWorkgenerationtime());
            String times= sdf.format(accBusinessadmissibility.getReservationtime());
            accBusinessadmissibility.getAccWorkorder().setWorkgenerationtimes(time);
            accBusinessadmissibility.setReservationtimes(times);
        }
        int max=accBusinessadmissibilityServices.selectCountHlp();
        map.put("total",max);
        map.put("rows",list);

        for (AccBusinessadmissibility accBusinessadmissibility : list) {
            System.out.println(accBusinessadmissibility);
        }
        return map;
    }
     //人工调度分页查询
    @RequestMapping("selectHlpAccBusinessadmissibilityRgddfy")
    public Map<String,Object> selectHlpAccBusinessadmissibilityRgddfy(int pages, int rows){
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Map<String,Object> map=new HashMap<>();
        System.out.println(pages+" 00  "+rows);
        List<AccBusinessadmissibility> list= accBusinessadmissibilityServices.selectHlpAccBusinessadmissibilityRgddfy(pages, rows);
       for (AccBusinessadmissibility accBusinessadmissibility : list) {
            String time= sdf.format(accBusinessadmissibility.getAccWorkorder().getWorkgenerationtime());
            accBusinessadmissibility.getAccWorkorder().setWorkgenerationtimes(time);
           String times= sdf.format(accBusinessadmissibility.getReservationtime());
           accBusinessadmissibility.setReservationtimes(times);
           //accBusinessadmissibility.getDisDispatchhistory().setOperationtimes(sdf.format(accBusinessadmissibility.getDisDispatchhistory().getOperationtime()));
        }
        System.out.println(list);

        int max=accBusinessadmissibilityServices.selectCountHlp();
        map.put("total",max);
        map.put("rows",list);
        return map;
    }

    //查询业务受理
    @RequestMapping("select_AccBusinessadmissibility")
    public List<AccBusinessadmissibility> select_AccBusinessadmissibility(){
        List<AccBusinessadmissibility> list = accBusinessadmissibilityServices.selectAccBusinessadmissibilityts();
       /* for (AccBusinessadmissibility aa:list){
            SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = adf.format(aa.getReservationtime());
            aa.setReservationtimes(format);
            System.out.println(format);
            System.out.println(aa.getReservationtime());
        }*/
        return list;
    }

    //添加
    @RequestMapping("insert_AccBusinessadmissibilityts")
    public int insert_AccBusinessadmissibilityts(AccBusinessadmissibility accBusinessadmissibility){
        System.out.println("添加");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String ywd=sdf.format(new Date());
        String kh =sdf.format(new Date());
        accBusinessadmissibility.setBusinessnoticeno("YWD"+ywd);
        accBusinessadmissibility.setCustomcode("KH"+kh);
        System.out.println(accBusinessadmissibility);
        return accBusinessadmissibilityServices.insertAccBusinessadmissibilityBusinessnoticenots(accBusinessadmissibility);
    }

    //修改
    @RequestMapping("update_AccBusinessadmissibilityts")
    public int update_AccBusinessadmissibilityts(AccBusinessadmissibility accBusinessadmissibility){
        System.out.println("修改");
        System.out.println(accBusinessadmissibility);
        return accBusinessadmissibilityServices.updateAccBusinessadmissibilityBusinessnoticenots(accBusinessadmissibility);
    }
    //删除
    @RequestMapping("delete_AccBusinessadmissibilityts")
    public int delete_AccBusinessadmissibilityts(Short id){
        return accBusinessadmissibilityServices.deleteAccBusinessadmissibilityBusinessnoticenots(id);
    }




}

