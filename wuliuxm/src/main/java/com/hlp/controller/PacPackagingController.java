package com.hlp.controller;

import com.hlp.model.PacPackaging;
import com.hlp.services.PacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacPackagingController {
    @Autowired
    PacPackagingService pacPackagingService;

    @RequestMapping("selectPacPackaging")
    public List<PacPackaging> selectPacPackaging(){
        List<PacPackaging> list=pacPackagingService.selectPacPackaging();
        return list;
    }
    @RequestMapping("deletePacPackaging")
    public int deletePacPackaging(Short id){
        return pacPackagingService.deletePacPackaging(id);
    }
    @RequestMapping("insertPacPackaging")
    public int  insertPacPackaging(PacPackaging record){
        return pacPackagingService.insertPacPackaging(record);
    }
    @RequestMapping("updatePacPackaging")
    public int updatePacPackaging(PacPackaging record){
        return pacPackagingService.updatePacPackaging(record);
    }
    @RequestMapping("selectPacPackagingid")
    public PacPackaging selectPacPackagingid(Short id){
        return pacPackagingService.selectPacPackagingid(id);
    }
}
