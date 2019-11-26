package com.hlp.controller;

import com.hlp.model.DisPropagandatask;
import com.hlp.services.DisPropagandataskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisPropagandataskController {
    @Autowired
    private DisPropagandataskService disPropagandataskService;
    @RequestMapping("selectDisPropagandataskHlp")
    public Map<String,Object> selectDisPropagandataskHlp(int pages, int rows,String outline){
        Map<String,Object> map=new HashMap<>();
       List<DisPropagandatask> list= disPropagandataskService.selectDisPropagandataskHlp(pages, rows,outline);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

       for (DisPropagandatask disPropagandatask : list) {
          String time= sdf.format(disPropagandatask.getFailuretime());
          disPropagandatask.setFailuretimes(time);
          String time1=sdf.format(disPropagandatask.getReleasetime());
          disPropagandatask.setReleasetimes(time1);
           System.out.println(disPropagandatask);

       }
      int max= disPropagandataskService.selectDisPropagandataskMaxHlp();
      map.put("total",max);
      map.put("rows",list);
    return map;
    }

}
