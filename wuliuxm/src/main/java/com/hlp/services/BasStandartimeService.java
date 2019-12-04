package com.hlp.services;

import com.hlp.model.BasStandartime;

import java.util.List;

public interface BasStandartimeService {

    public List<BasStandartime> selectBasStandartime();
    public int deleteBasStandartimets(Short id);
    //添加
    public int insertBasStandartimets(BasStandartime basStandartime);
    //修改
    public int updateBasStandartimets(BasStandartime basStandartime);
}
