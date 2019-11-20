package com.hlp.controller;

import com.hlp.model.AccBusinessadmissibility;

import com.hlp.services.AccBusinessadmissibilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccbusinessAdmissibilityController {
    @Autowired
    private AccBusinessadmissibilityServices accBusinessadmissibilityServices;
    @RequestMapping("selectHlpAccBusinessadmissibility")
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibility(){
        List<AccBusinessadmissibility> list= accBusinessadmissibilityServices.selectHlpAccBusinessadmissibility();
        return list;
    }
@RequestMapping("selectHlpAccBusinessadmissibilityByteleAndbusi")
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityByteleAndbusi(AccBusinessadmissibility accBusinessadmissibility){
              List<AccBusinessadmissibility> list=accBusinessadmissibilityServices.selectHlpAccBusinessadmissibilityByteleAndbusi(accBusinessadmissibility);
              return list;
    }

}
