package com.hlp.services;

import com.hlp.model.BasSubstitute;

import java.util.List;

public interface BasSubstituteService {
    public List<BasSubstitute> selectBasSubstitute();
    public int deleteBasSubstitutets(short id);
    //添加
    public int insertBasSubstitutets(BasSubstitute basSubstitute);
    //修改
    public int updateBasSubstitutets(BasSubstitute basSubstitute);


}
