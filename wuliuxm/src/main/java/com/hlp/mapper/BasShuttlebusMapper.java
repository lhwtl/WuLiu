package com.hlp.mapper;

import com.hlp.model.BasShuttlebus;

public interface BasShuttlebusMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasShuttlebus record);

    int insertSelective(BasShuttlebus record);

    BasShuttlebus selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasShuttlebus record);

    int updateByPrimaryKey(BasShuttlebus record);
}