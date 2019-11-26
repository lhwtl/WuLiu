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
            @Result(property = "id",column = "id",id=true),
            @Result(property = "operatorid",column = "operatorid"),
            @Result(property = "operationunitid",column = "operationunitid"),
            @Result(property = "syEmps", column = "operatorid", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectSyEmpIdts")),
            @Result(property = "syUnitss", column = "operationunitid", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
    })
    public List<BasDeliverystandard> selectBasDeliverystandard();

    int deleteByPrimaryKey(Short id);

    int insert(BasDeliverystandard record);

    int insertSelective(BasDeliverystandard record);

    BasDeliverystandard selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasDeliverystandard record);

    int updateByPrimaryKey(BasDeliverystandard record);
}