package com.hlp.controller;

import com.hlp.model.BiglogLogisticscontroltable;
import com.hlp.services.BiglogLogisticscontroltableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BiglogLogisticscontroltableController {

    @Autowired
    private BiglogLogisticscontroltableService service;
    @RequestMapping("selectBiglogLogisticscontroltable")
    public List<BiglogLogisticscontroltable> selectBiglogLogisticscontroltable(){
        System.out.println("查询");
        return service.selectBiglogLogisticscontroltable();
    }
    @RequestMapping("insertBiglogLogisticscontroltable")
    public int insertBiglogLogisticscontroltable(BiglogLogisticscontroltable b){
        System.out.println("新增");
        return service.insertBiglogLogisticscontroltable(b);
    }
    @RequestMapping("updateBiglogLogisticscontroltable")
    public int updateBiglogLogisticscontroltable(BiglogLogisticscontroltable b){
        System.out.println("修改");
        return service.updateBiglogLogisticscontroltable(b);
    }
    @RequestMapping("deleteBiglogLogisticscontroltable")
    public int deleteBiglogLogisticscontroltable(Short id){
        System.out.println("删除");
        return service.deleteBiglogLogisticscontroltable(id);
    }
}
