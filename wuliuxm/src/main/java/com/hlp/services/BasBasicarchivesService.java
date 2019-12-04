package com.hlp.services;

import com.hlp.model.BasBasicarchives;

import java.util.List;

public interface BasBasicarchivesService {

    public List<BasBasicarchives>selectBasBasicarchive();

    public int deleteBasBasicarchivesIdts(Short id);
    //添加
    public int insertBasBasicarchivesIdts(BasBasicarchives basBasicarchives);
    //修改
    public int updateBasBasicarchivesIdts(BasBasicarchives basBasicarchives);

}
