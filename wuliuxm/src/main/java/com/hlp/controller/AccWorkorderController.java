package com.hlp.controller;

import com.hlp.model.AccWorkorder;
import com.hlp.services.AccWorkorderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
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

    @RequestMapping("selectAccWorkorderByJonNo")
    public AccWorkorder selectAccWorkorderByJonNo(String jobno){
       AccWorkorder accWorkorder= accWorkorderServices.selectAccWorkorderByJonNo(jobno);
       return accWorkorder;
    }
}
