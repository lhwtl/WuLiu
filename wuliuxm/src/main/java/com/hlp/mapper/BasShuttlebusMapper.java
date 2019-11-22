package com.hlp.mapper;

import com.hlp.model.BasDeliverystandard;
import com.hlp.model.BasShuttlebus;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasShuttlebusMapper {

@Select("select * from Bas_Shuttlebus")
@Results({
        @Result(property = "id",column = "id",id=true),
        @Result(property = "operatorid",column = "operatorid"),
        @Result(property = "operationunitid",column = "operationunitid"),
        @Result(property = "syEmp", column = "operatorid", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectSyEmpIdts")),
        @Result(property = "syUnits", column = "operationunitid", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
})
public List<BasShuttlebus> selectBasShuttlebus();

    int deleteByPrimaryKey(Short id);

    int insert(BasShuttlebus record);

    int insertSelective(BasShuttlebus record);

    BasShuttlebus selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasShuttlebus record);

    int updateByPrimaryKey(BasShuttlebus record);

    //收派标准表
    @Service
    interface BasDeliverystandardMapper {

        //查询收派标准表
        @Select("select * from BAS_DELIVERYSTANDARD")
        @Results({
                @Result(property = "id",column = "id",id=true),
                @Result(property = "operatorid",column = "operatorid"),
                @Result(property = "operationunitid",column = "operationunitid"),
                @Result(property = "syEmps", column = "operatorid", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectByPrimaryKey")),
                @Result(property = "syUnitss", column = "operationunitid", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectByPrimaryKey"))
        })
        public List<BasDeliverystandard> selectBasDeliverystandard();

        int deleteByPrimaryKey(Short id);

        int insert(BasDeliverystandard record);

        int insertSelective(BasDeliverystandard record);

        BasDeliverystandard selectByPrimaryKey(Short id);

        int updateByPrimaryKeySelective(BasDeliverystandard record);

        int updateByPrimaryKey(BasDeliverystandard record);
    }
}