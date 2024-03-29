package com.hlp.services.Impl;

import com.hlp.mapper.BasSubstituteMapper;
import com.hlp.model.BasSubstitute;
import com.hlp.services.BasSubstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasSubstituteServiceImpl implements BasSubstituteService {
    @Autowired
    private BasSubstituteMapper basSubstituteMapper;
    @Override
    public List<BasSubstitute> selectBasSubstitute() {
        return basSubstituteMapper.selectBasSubstitute();
    }

    @Override
    public int deleteBasSubstitutets(short id) {
        return basSubstituteMapper.deleteBasSubstitutets(id);
    }

    @Override
    public int insertBasSubstitutets(BasSubstitute basSubstitute) {
        return basSubstituteMapper.insertBasSubstitutets(basSubstitute);
    }

    @Override
    public int updateBasSubstitutets(BasSubstitute basSubstitute) {
        return basSubstituteMapper.updateBasSubstitutets(basSubstitute);
    }
}
