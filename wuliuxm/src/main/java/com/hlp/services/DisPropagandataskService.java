package com.hlp.services;

import com.hlp.model.DisPropagandatask;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisPropagandataskService {
    //查询宣传任务
    public List<DisPropagandatask> selectDisPropagandataskHlp(int pages,int rows,String outline);
   //宣传任务最大值
    public int selectDisPropagandataskMaxHlp();
}
