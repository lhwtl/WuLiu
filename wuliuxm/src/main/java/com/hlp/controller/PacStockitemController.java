package com.hlp.controller;

import com.hlp.model.PacStockitem;
import com.hlp.services.PacStockitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacStockitemController {
    @Autowired
    private PacStockitemService service;

    public List<PacStockitem> selectPacStockitem(){

        return  service.selectPacStockitem();
    }
}
