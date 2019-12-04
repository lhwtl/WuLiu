package com.hlp.controller;

import com.hlp.mapper.IaeExtractMapper;
import com.hlp.model.*;
import com.hlp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IaeDepartureConterller {

    @Autowired
    private IaeDepartureService iaeDepartureService;
    @Autowired
    private IaeExtractService iaeExtractService;
    @Autowired
    private IaeArrivalService iaeArrivalService;
    @Autowired
    private IaeLineresourceService iaeLineresourceService;
    @Autowired
    private IaeTimeinputService iaeTimeinputService;

    /*出港配载*/
    @RequestMapping("FillIaeDepartureLX")
    public List<IaeDeparture> FillIaeDepartureLX(){
        List<IaeDeparture> iaeDepartures = iaeDepartureService.FillIaeDepartureLX();
        System.out.println(iaeDepartures);
        return iaeDepartures;
    }
    /*提货管理*/
    @RequestMapping("FillIaeExtractLX")
    public List<IaeExtract> FillIaeExtractLX(){
        List<IaeExtract> iaeExtracts = iaeExtractService.FillIaeExtractLX();
        System.out.println(iaeExtracts);
        return iaeExtracts;
    }
    /*进港分单*/
    @RequestMapping("FillIaeArrivalLX")
    public List<IaeArrival> FillIaeArrivalLX(){
        List<IaeArrival> iaeArrivals = iaeArrivalService.FillIaeArrivalLX();
        System.out.println(iaeArrivals);
        return iaeArrivals;
    }
    /*出港配载查询*/
    @RequestMapping("FillIaeLineresourceLX")
    public List<IaeLineresource> FillIaeLineresourceLX(){
        List<IaeLineresource> iaeLineresources = iaeLineresourceService.FillIaeLineresourceLX();
        System.out.println(iaeLineresources);
        return iaeLineresources;
    }
    /*到达时间录入*/
    @RequestMapping("FillIaeTimeinputLX")
    public List<IaeTimeinput> FillIaeTimeinputLX(){
        List<IaeTimeinput> iaeTimeinputs = iaeTimeinputService.FillIaeTimeinputLX();
        System.out.println(iaeTimeinputs);
        return iaeTimeinputs;
    }



}
