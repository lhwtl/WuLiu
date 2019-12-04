package com.hlp.controller;

import com.hlp.model.AccWorkorder;
import com.hlp.services.AccWorkorderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccWorkorderController {
    @Autowired
    private AccWorkorderServices accWorkorderServices;

    @RequestMapping("selectAllAccWorkorderHlp")
    public List<AccWorkorder> selectAllAccWorkorderHlp(){
       List<AccWorkorder> list= accWorkorderServices.selectAllAccWorkorderHlp();
       return list;
    }

    @RequestMapping("select_AccWorkorder")
    public List<AccWorkorder> select_AccWorkorder(){
        List<AccWorkorder> list=accWorkorderServices.selectAccWorkorderts();
      /*  for(AccWorkorder aa:list){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(aa.getAccBusinessadmissibility().getReservationtime());
            aa.getAccBusinessadmissibility().setReservationtimes(format);

        }*/
        return list;

    }
//根据结果集查询分件编码
    @RequestMapping("selectAccWorkorderJgjByts")
    public List<AccWorkorder> selectAccWorkorderJgjByts(){
        List<AccWorkorder> list=accWorkorderServices.selectAccWorkorderJgjByts();
        return list;

    }
}
