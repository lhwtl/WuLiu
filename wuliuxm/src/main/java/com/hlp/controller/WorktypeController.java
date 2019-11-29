package com.hlp.controller;

import com.hlp.model.Worktype;
import com.hlp.services.WorkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorktypeController {
   @Autowired
    private WorkTypeService workTypeService;
    //查询所有的返回类型
    @RequestMapping("selectWorktypeAllHlp")
    public List<Worktype> selectWorktypeAllHlp(){
        List<Worktype> list=workTypeService.selectWorktypeAllHlp();
        return list;
    }

}
