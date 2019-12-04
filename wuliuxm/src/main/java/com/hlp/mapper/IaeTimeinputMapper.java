package com.hlp.mapper;

import com.hlp.model.IaeTimeinput;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IaeTimeinputMapper {

    @Select("select * from Iae_Timeinput")
    public List<IaeTimeinput> FillIaeTimeinputLX();
}
