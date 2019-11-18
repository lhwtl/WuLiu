package com.hlp.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.hlp.mapper.SyMenusMapper;
import com.hlp.model.SyMenus;
import com.hlp.services.SyMenusService;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Sequencer;
import javax.xml.ws.Action;
import java.sql.SQLOutput;
import java.util.List;

@RestController
public class SyMenusController {
    @Autowired
    private SyMenusService syMenusService;

    /*测试权限查询全部分页    初始化分页*/
    @RequestMapping("FillAllSyMenusPag")
    public List<SyMenus> FillAllSyMenusPag(String column,int pag,int size){

        System.out.println(column+"out"+pag+"xxx"+size);
        List<SyMenus> syMenus = syMenusService.FillAllSyMenusPage(column,pag,size);
       System.out.println(syMenus);
        for (SyMenus syMenu : syMenus) {
            System.out.println(syMenu);
        }
        return syMenus;
    }
    /*最大值*/
    @RequestMapping("MaxSyMenus")
    public int MaxSyMenus(){
        int i = syMenusService.MaxSyMenus();
        System.out.println("最大值:"+i);
        return i;
    }
    /*max3  根据查询的名字查最大值*/
    @RequestMapping("MaxMenusLikeNameLX")
    public int MaxMenusLikeNameLX(String column){
        int i = syMenusService.MaxMenusLikeNameLX(column);
        System.out.println("max3:"+i);
        return  i;
    }


    /*测试    权限根据id查询   */
    @RequestMapping("FillAllSyMenusByid")
    public  List<SyMenus> FillAllSyMenusByid(){
        List<SyMenus> syMenus = syMenusService.FillAllSyMenusByid(1);
        for (SyMenus syMenu : syMenus) {
            System.out.println(syMenu);
        }
        return syMenus;
    }
    /*一级栏目 下拉框用 */
    @RequestMapping("FillAllOneColumnSyMenus")
    public List<SyMenus> FillAllOneColumnSyMenus(){
        List<SyMenus> syMenus = syMenusService.FillAllOneColumnSyMenus("-1");
        return syMenus;
    }

    /* 测试    模糊查  */
    @RequestMapping("FillAllLikeTextSyMenus")
    public  List<SyMenus> FillAllLikeTextSyMenus(){
        List<SyMenus> syMenus = syMenusService.FillAllLikeTextSyMenus("");
        for (SyMenus syMenu : syMenus) {
            System.out.println(syMenu.getText());
        }
        return syMenus;
    }
    /*修改*/
    @RequestMapping("updateSyMenus")
    public int updateSyMenus(SyMenus syMenus){
        System.out.println("cba:"+syMenus);
        /*根据传过来的id编号查一遍parentid 的值 替换当前parentid的值   此时parentid的值是一级栏目或者是二级栏目*/
        SyMenus syMenus1 = syMenusService.FillSyMenusByIdLx(syMenus.getId());
        syMenus.setParentid(syMenus1.getParentid());
        System.out.println("cba:"+syMenus);
        int i = syMenusService.updateSyMenusLx(syMenus);
        System.out.println("修改"+i);


        return 1;

    }
    /*新增*/
    @RequestMapping("insertSyMenus")
    public SyMenus insertSyMenus(SyMenus syMenus){
        System.out.println("abc:"+syMenus);
        int i = syMenusService.insertSyMenusLX(syMenus);
        System.out.println("新增:"+i);
        return syMenus;
    }
    /*删除*/
    @RequestMapping("deleteSyMenus")
    public int deleteSyMenus(int id){
        System.out.println(id);
        int i = syMenusService.deleteSyMenusByidLx(id);
        System.out.println("删除:"+i);
        return id;
    }

    /*下拉查询替换*/
    @RequestMapping("FillSyMenusByidLX")
    public  List<SyMenus> FillSyMenusByidLX(int column,int pag,int size){
        System.out.println(pag+"tip"+size);
        String pid=String.valueOf(column);
        List<SyMenus> syMenus = syMenusService.FillSyMenusByidLX(column,pid,pag,size);
        System.out.println("AVC："+syMenus);
        return syMenus;
    }
   /*max2*/
    @RequestMapping("MaxTwoMenusByidLX")
    public  int MaxTwoMenusByidLX(int column,int pag,int size){
        System.out.println("pyhsajd");
        String pid=String.valueOf(column);
        System.out.println(pid+"xxxxx"+column+"xxtop");
        System.out.println(pid+"aa");
        int i = syMenusService.MaxTwoMenusByidLX(column,pid);
        System.out.println("max2:"+i);
        return i;
    }
}
