package com.hlp.services.Impl;

import com.hlp.mapper.BasStandartimeMapper;
import com.hlp.model.BasStandartime;
import com.hlp.services.BasStandartimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasStandartimeServiceImpl implements BasStandartimeService {
    @Autowired
    private BasStandartimeMapper basStandartimeMapper;
    @Override
    public List<BasStandartime> selectBasStandartime() {
        return basStandartimeMapper.selectBasStandartime();
    }

    @Override
    public int deleteBasStandartimets(Short id) {
        return basStandartimeMapper.deleteBasStandartimets(id);
    }
}
