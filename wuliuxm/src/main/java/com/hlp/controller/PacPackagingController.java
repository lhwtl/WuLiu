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
        System.out.println("aa");
        List<PacPackaging> list=pacPackagingService.selectPacPackaging();
        System.out.println("首页查询:"+list);
        return list;
    }
    @RequestMapping("deletePacPackaging")
    public int deletePacPackaging(Short id){

        System.out.println("删除");
        return pacPackagingService.deletePacPackaging(id);
    }
    @RequestMapping("insertPacPackaging")
    public int  insertPacPackaging(PacPackaging record){
        System.out.println("新增");
        return pacPackagingService.insertPacPackaging(record);
    }
    @RequestMapping("updatePacPackaging")
    public int updatePacPackaging(PacPackaging record){
        System.out.println(record);
        System.out.println("修改");
        return pacPackagingService.updatePacPackaging(record);
    }
    @RequestMapping("selectPacPackagingid")
    public PacPackaging selectPacPackagingid(Short id){
        return pacPackagingService.selectPacPackagingid(id);
    }

    @RequestMapping("selectPacPackagingname")
    public List<PacPackaging> selectPacPackagingname(PacPackaging record){
        return pacPackagingService.selectPacPackagingname(record);
    }
}
