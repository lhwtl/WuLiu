package com.hlp.controller;

import com.hlp.model.BasShuttlebus;
import com.hlp.services.BasShuttlebusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BasShuttlebusController  {
    @Autowired
    private BasShuttlebusService basShuttlebusService;
    @RequestMapping("select_BasShuttlebus")
    public List<BasShuttlebus> select_BasShuttlebus(){
        List<BasShuttlebus> list=basShuttlebusService.selectBasShuttlebus();
  /*      for (BasShuttlebus bb:list){
            SimpleDateFormat sdf = new SimpleDateFormat();
            String format = sdf.format(bb.getOperationtime());
            bb.setTime(format);
            System.out.println(bb.getId());
        }*/
        return list;
    }

    @RequestMapping("delete_BasShuttlebus")
    public int delete_BasShuttlebus(Short id) {
        System.out.println("删除");
        return basShuttlebusService.deleteBasShuttlebusts(id);
    }
        @RequestMapping("selectBasShuttlebusHLP")
    public Map<String,Object> selectBasShuttlebusHLP(int pages,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BasShuttlebus> list=basShuttlebusService.selectBasShuttlebusHLP(pages, rows);
        int max=basShuttlebusService.selectBasShuttlebusByMax();
        map.put("total",max);
        map.put("rows",list);
        return map;
    }
    @RequestMapping("insert_BasShuttlebus")
    public int insert_BasShuttlebus(BasShuttlebus basShuttlebus){
        System.out.println("添加");
        basShuttlebus.setOperationtime(new Date());
        System.out.println("id:"+basShuttlebus.getId());
        System.out.println("Linetype:"+basShuttlebus.getLinetype());
        System.out.println("Lineid:"+basShuttlebus);

        return basShuttlebusService.insertBasShuttlebusts(basShuttlebus);
    }
    @RequestMapping("update_BasShuttlebus")
    public int update_BasShuttlebus(BasShuttlebus basShuttlebus){
        System.out.println("修改");
        System.out.println(basShuttlebus);
        return basShuttlebusService.updateBasShuttlebus(basShuttlebus);
    }
}
