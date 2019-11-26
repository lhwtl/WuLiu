package com.hlp.services.Impl;

import com.hlp.mapper.DisPropagandataskMapper;
import com.hlp.model.DisPropagandatask;
import com.hlp.services.DisPropagandataskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisPropagandataskServiceImpl implements DisPropagandataskService {
    @Autowired
    private DisPropagandataskMapper disPropagandataskMapper;

    @Override
    public List<DisPropagandatask> selectDisPropagandataskHlp(int pages,int rows,String outline) {
        return disPropagandataskMapper.selectDisPropagandataskHlp(pages, rows,outline);
    }

    @Override
    public int selectDisPropagandataskMaxHlp() {
        return disPropagandataskMapper.selectDisPropagandataskMaxHlp();
    }
}
