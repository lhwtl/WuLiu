package com.hlp.mapper;

import com.hlp.model.IaeExtract;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IaeExtractMapper {

    @Select("select * from Iae_Extract")
    public List<IaeExtract> FillIaeExtractLX();

}
