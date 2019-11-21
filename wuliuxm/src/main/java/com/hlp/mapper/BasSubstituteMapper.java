package com.hlp.mapper;

import com.hlp.model.BasSubstitute;

public interface BasSubstituteMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasSubstitute record);

    int insertSelective(BasSubstitute record);

    BasSubstitute selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasSubstitute record);

    int updateByPrimaryKey(BasSubstitute record);
}