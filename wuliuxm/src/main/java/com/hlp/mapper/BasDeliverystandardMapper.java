package com.hlp.mapper;

import com.hlp.model.BasDeliverystandard;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
//收派标准表
@Service
public interface BasDeliverystandardMapper {

    //查询收派标准表
    @Select("select * from BAS_DELIVERYSTANDARD")
    @Results({
            @Result(property = "syEmps", column = "id", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectByPrimaryKey")),
            @Result(property = "syUnitss", column = "id", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectByPrimaryKey"))
    })
    public List<BasDeliverystandard> selectBasDeliverystandard();

    int deleteByPrimaryKey(Short id);

    int insert(BasDeliverystandard record);

    int insertSelective(BasDeliverystandard record);

    BasDeliverystandard selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasDeliverystandard record);

    int updateByPrimaryKey(BasDeliverystandard record);
}