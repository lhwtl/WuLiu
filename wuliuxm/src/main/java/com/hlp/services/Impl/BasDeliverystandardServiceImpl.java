package com.hlp.services.Impl;

import com.hlp.mapper.BasDeliverystandardMapper;
import com.hlp.mapper.BasShuttlebusMapper;
import com.hlp.model.BasDeliverystandard;
import com.hlp.services.BasDeliverystandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//收派标准表
@Service
public class BasDeliverystandardServiceImpl implements BasDeliverystandardService {
    @Autowired
    private BasDeliverystandardMapper basDeliverystandardMapper;

    @Override
    public List<BasDeliverystandard> selectBasDeliverystandardts() {
        return basDeliverystandardMapper.selectBasDeliverystandard();
    }

    @Override
    public int insertBasDeliverystandardts(BasDeliverystandard bd) {
        return basDeliverystandardMapper.insertBasDeliverystandardts(bd);
    }

    @Override
    public int deleteBasDeliverystandardts(short id) {
        return basDeliverystandardMapper.deleteBasDeliverystandardts(id);
    }
}
