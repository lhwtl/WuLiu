package com.hlp.controller;

import com.hlp.model.SyEmp;
import com.hlp.model.SyUnits;
import com.hlp.services.SyEmpService;
import com.hlp.services.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SyUnitsController {
    @Autowired
    private SyUnitsService syUnitsService;
    @Autowired
    private SyEmpService syEmpService;

/*name条件分页查询全部*/
    @RequestMapping("FillAllSyUnitsLx")
    public List<SyUnits> FillAllSyUnitsLx(String name,int pag,int size){
        System.out.println("AAA"+name+"BBB"+pag+"CCC:"+size);
        List<SyUnits> syUnits = syUnitsService.FillAllSyUnitsLx(name,pag,size);
        for (SyUnits syUnit : syUnits) {
            System.out.println(syUnit);
        }
        System.out.println("公司:"+syUnits);
        return syUnits;
    }
    /*name条件最大max*/
    @RequestMapping("MaxSyUnitsLx")
    public int MaxSyUnitsLx(String name){
        System.out.println("值："+name);
        int i = syUnitsService.MaxSyUnitsLx(name+"");
        System.out.println(i);
        return  i;
    }
    /*新增*/
    @RequestMapping("insertSyUnitsLx")
    public int insertSyUnitsLx(SyUnits syUnits,String toemp){
        System.out.println("    "+toemp);
        SyEmp syEmp = syEmpService.FillAllSyEmpEmpToLx(toemp);
        System.out.println(syEmp.getId()+"topempno");
        syUnits.setOperatorid(syEmp.getId());
        syUnits.setOperationtime(new Date());
        System.out.println("新增值:"+syUnits);
        int i = syUnitsService.insertSyUnitsLx(syUnits);
        System.out.println("新增:"+i);
        return  i;
    }
    /*修改*/
    @RequestMapping("updateSyUnitsLx")
    public int updateSyUnitsLx(SyUnits syUnits,int empid){
        System.out.println(empid+" ");
        syUnits.setOperatorid((short) empid);
        syUnits.setOperationtime(new Date());
        System.out.println("修改值:"+syUnits);
        int i = syUnitsService.updateSyUnitsLx(syUnits);
        System.out.println("修改:"+i);
        return  i;
    }
    /*删除*/
    @RequestMapping("deleteSyUnitsLx")
    public int deleteSyUnitsLx(int id){
        System.out.println("修改值:"+id);
        int i = syUnitsService.deleteSyUnitsLx(id);
        System.out.println("修改:"+i);
        return  i;
    }

    //查询所有单位
    @RequestMapping("selectSyUnitsHlp")
    public List<SyUnits> selectSyUnitsHlp(){
        List<SyUnits> list=syUnitsService.selectSyUnitsHlp();
        return list;
    }


    /*id查询*/
    @RequestMapping("FillSyUnitsByidLx")
    public SyUnits FillSyUnitsByidLx(int unid){
        SyUnits syUnits = syUnitsService.FillSyUnitsByidLx(unid);
        System.out.println(" 公司 :"+syUnits);
        return syUnits;
    }


}
