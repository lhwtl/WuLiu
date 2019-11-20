package com.hlp.mapper;

import com.hlp.model.BasBasicarchives;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasBasicarchivesMapper {

    @Select("select * from Bas_Basicarchives")
    @Results({
            @Result(property = "syEmp", column = "id", one =@One(select = "com.hlp.mapper.SyEmpMapper.selectByPrimaryKey")),
           @Result(property =  "syUnits",column = "id",one = @One(select ="com.hlp.mapper.SyUnitsMapper.selectByPrimaryKey"))
    })

    public List<BasBasicarchives>selectBasBasicarchive();

    int deleteByPrimaryKey(Short id);

    int insert(BasBasicarchives record);

    int insertSelective(BasBasicarchives record);

    BasBasicarchives selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasBasicarchives record);

    int updateByPrimaryKey(BasBasicarchives record);
}