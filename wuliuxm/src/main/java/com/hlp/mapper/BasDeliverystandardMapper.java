package com.hlp.mapper;

import com.hlp.model.BasDeliverystandard;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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
    //添加
    @Insert("insert into Bas_Deliverystandard values(Bas_Deliverystandard_id.nextval,#{name},#{minweight},#{maxweight},#{operatorid},#{operationunitid},#{operationtime},#{cancel}) ")
    public int insertBasDeliverystandardts(BasDeliverystandard bd);
    //删除
    @RequestMapping("delete from BAS_DELIVERYSTANDARD where id=#{id}")
    public int deleteBasDeliverystandardts(short id);
}