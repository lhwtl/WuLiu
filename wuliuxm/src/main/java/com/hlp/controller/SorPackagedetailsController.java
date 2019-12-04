package com.hlp.controller;

import com.hlp.model.PacPackaging;
import com.hlp.model.SorPackage;
import com.hlp.model.SorPackagedetails;
import com.hlp.services.SorPackageService;
import com.hlp.services.SorPackagedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SorPackagedetailsController {
    @Autowired
    private SorPackagedetailsService sorPackagedetailsService;
    @Autowired
    private SorPackageService sorPackageService;


    /*新增和包包新增和包详情*/
    @RequestMapping("insertSorPackagedetailsLx")
    public SorPackage insertSorPackagedetailsLx( SorPackage sorPackage,SorPackagedetails sorPackagedetails, int cctvid, String
            cargotype1, String cargotype2, String cargotype3, int cargocount, int weight, int volume
            , String direction, String storagedate, int PS,int empids){
   /*     System.out.println("XXOO");
        System.out.println(sorPackagedetails);
        System.out.println("下面的值");
        System.out.println("ID:"+cctvid);
        System.out.println("cargotype1:"+cargotype1);
        System.out.println("cargotype2:"+cargotype2);
        System.out.println("cargotype3:"+cargotype3);
        System.out.println("cargocount:"+cargocount);
        System.out.println("weight:"+weight);
        System.out.println("volume:"+volume);
        System.out.println("weight:"+direction);
        System.out.println("volume:"+storagedate);
        System.out.println("PS:"+PS);*/
                /*cctvid:this.cctvid,  编号
                cargotype1:this.cargotype1,品名
                cargotype2:this.cargotype2,提示
                cargotype3:this.cargotype3,配载
                direction:this.direction,到达地
                cargocount:this.cargocount,件数
                storagedate:this.storagedate,到达时限 string
                weight:this.weight,
                volume:this.volume,
                PS:this.,票数*/
        //sorPackagedetailsService.insertSorPackagedetailsLx(sorPackagedetails);
        System.out.println("空值"+sorPackagedetails);
        Date date=new Date();
        int rs=(int) date.getTime();
        System.out.println(-rs);
        sorPackagedetails.setId(cctvid);/*制动*/
        if(cargotype1.equals("食物类型")){
            sorPackagedetails.setWarename((short)1);/*  商品名      */}
        if(cargotype1.equals("家具类型")){
            sorPackagedetails.setWarename((short)2);/*  商品名      */}
        if(cargotype1.equals("玩具类型")){
            sorPackagedetails.setWarename((short)3);/*  商品名      */}
        if(cargotype1.equals("电器类型")){
            sorPackagedetails.setWarename((short)0);/*  商品名      */}
        /*sorPackagedetails.setWarename(1);  商品名      去前台获取当前登入的id*/
        sorPackagedetails.setDestination(direction);/*到达地*/
        sorPackagedetails.setTicket((short)PS);/*票数*/
        sorPackagedetails.setActualcargoint((short)cargocount);/*实际件数*/
        sorPackagedetails.setCargoint((short)cargocount);/*件数*/
        sorPackagedetails.setWeight((short)weight);/*重量*/
        sorPackagedetails.setVolume((short)volume);/*体积*/
        sorPackagedetails.setService((short)empids);
        sorPackagedetails.setImportanthints(cargotype2);/*提示*/
        sorPackagedetails.setAsk(cargotype3);
        sorPackagedetails.setInputtype(""+-rs);
        System.out.println("");
        System.out.println("到你了:"+sorPackagedetails);
        sorPackage.setId(-rs);/*id当前时间生成*/
        sorPackage.setPackageperson((short)empids);/*去前台获取当前登入的id*/
        sorPackage.setSealint("FQ"+rs);/*封签号*/
        sorPackage.setDestination(direction);/*到达地*/
        sorPackage.setReckondes("预计三天后到达");/*预计*/
        sorPackage.setTimelimit(new Date());/*送达时间*/
        sorPackage.setTicketsum((short)PS);/*票*/
        sorPackage.setCargosum((short)cargocount);/*件数*/
        sorPackage.setWeightsum((short)weight);/*重量*/
        sorPackage.setVolumesum((short)volume);/*体积*/
        sorPackage.setState((short)1);/*状态*/
        if(cargotype3.equals("优先运输")){
            sorPackage.setAsk((short)1);/*  配载      */}
        if(cargotype3.equals("钱到位就走")){
            sorPackage.setAsk((short)2);/*  配载      */}
        if(cargotype3.equals("货满及走")){
            sorPackage.setAsk((short)3);/*  配载      */}
        if(cargotype3.equals("满货及走")){
            sorPackage.setAsk((short)0);/*  配载      */}
        System.out.println("到你了:"+sorPackage);

        sorPackagedetailsService.insertSorPackagedetailsLx(sorPackagedetails);
        sorPackageService.insertSorPackageLX(sorPackage);


        /*新增的id查*/
        SorPackage sorPackages = sorPackageService.FillSorPackageByidLX(-rs);
        return sorPackages;
    }



    /*根据id查出对应的详情*/
    @RequestMapping("FillSorPackagedetailsOneByidLx")
    public SorPackage FillSorPackagedetailsOneByidLx(int id){
        SorPackagedetails sorPackagedetails = sorPackagedetailsService.FillSorPackagedetailsOneByidLx(id);
        String inputtype = sorPackagedetails.getInputtype();
        int i = Integer.parseInt(inputtype);
        SorPackage sorPackage = sorPackageService.FillSorPackageByidLX(i);
        return sorPackage;
    }
    /*判断id有没有加入合包*/
    @RequestMapping("FillSorPackagedetailsOneByidLxssss")
    public String FillSorPackagedetailsOneByidLxssss(int id){
        SorPackagedetails sorPackagedetails = sorPackagedetailsService.FillSorPackagedetailsOneByidLx(id);
        if(sorPackagedetails!=null) {
            return "ok";
        }
        return "此数据已在和包当中";
    }
    /*判断合包号是否正确*/
    @RequestMapping("FillSorPackageByidLXs")
    public String FillSorPackageByidLXs(int id){
        SorPackage sorPackage = sorPackageService.FillSorPackageByidLX(id);
        if(sorPackage!=null) {
            return "ok";
        }
        return "此数据已在和包当中";
    }

    /*新增详情 修改对应和包  数值*/
    @RequestMapping("updateSorPackage")
    public SorPackage updateSorPackage(
            SorPackage sorPackage,SorPackagedetails sorPackagedetails, int cctvid, String
            cargotype1, String cargotype2, String cargotype3, int cargocount, int weight, int volume
            , String direction, String storagedate, int PS, String hbid
    ){



        sorPackagedetails.setId(cctvid);
        if(cargotype1.equals("食物类型")){
            sorPackagedetails.setWarename((short)1);/*  商品名      */}
        if(cargotype1.equals("家具类型")){
            sorPackagedetails.setWarename((short)2);/*  商品名      */}
        if(cargotype1.equals("玩具类型")){
            sorPackagedetails.setWarename((short)3);/*  商品名      */}
        if(cargotype1.equals("电器类型")){
            sorPackagedetails.setWarename((short)0);/*  商品名      */}
        /*sorPackagedetails.setWarename(1);  商品名      去前台获取当前登入的id*/
        sorPackagedetails.setDestination(direction);/*到达地*/
        sorPackagedetails.setTicket((short)PS);/*票数*/
        sorPackagedetails.setActualcargoint((short)cargocount);/*实际件数*/
        sorPackagedetails.setCargoint((short)cargocount);/*件数*/
        sorPackagedetails.setWeight((short)weight);/*重量*/
        sorPackagedetails.setVolume((short)volume);/*体积*/
        sorPackagedetails.setService((short)1);
        sorPackagedetails.setImportanthints(cargotype2);/*提示*/
        sorPackagedetails.setAsk(cargotype3);
        sorPackagedetails.setInputtype(hbid);/*拿到合包的z账号*/
        sorPackagedetails.setInputtype(hbid);
        SorPackage sorPackage1 = sorPackageService.FillSorPackageByidLX(Integer.parseInt(hbid));/*根据id查对应的合包*/
        sorPackagedetailsService.insertSorPackagedetailsLx(sorPackagedetails);/*新增明细*/
        sorPackage1.setTicketsum((short)(sorPackage1.getTicketsum()+sorPackagedetails.getTicket()));
        sorPackage1.setCargosum((short)(sorPackage1.getCargosum()+sorPackagedetails.getCargoint()));
        sorPackage1.setWeightsum((short)(sorPackage1.getWeightsum()+sorPackagedetails.getWeight()));
        sorPackage1.setVolumesum((short)(sorPackage1.getVolumesum()+sorPackagedetails.getVolume()));
        sorPackageService.updateSorPackage(sorPackage1);/*修改合包信息*/
        SorPackage sorPackage2 = sorPackageService.FillSorPackageByidLX(Integer.parseInt(hbid));/*查询最新合包 返回前台页面显示*/
        System.out.println(sorPackage);
        System.out.println(sorPackage1);
        System.out.println(sorPackage2);
        return sorPackage2;
    }

    @RequestMapping("FillSorPackagedetailsManyByidLx")
    public List<SorPackagedetails> FillSorPackagedetailsManyByidLx(String id){
        List<SorPackagedetails> sorPackagedetails = sorPackagedetailsService.FillSorPackagedetailsManyByidLx(id);
        return sorPackagedetails;
    }


}
