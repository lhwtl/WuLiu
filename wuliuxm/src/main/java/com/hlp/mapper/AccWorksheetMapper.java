package com.hlp.mapper;

import com.hlp.model.AccWorksheet;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface AccWorksheetMapper {
    //根据工作单号查询
    @Select("select * from Acc_Worksheet where worksheetno=#{worksheetno}")
    public AccWorksheet selectAccWorksheetts(String worksheetno);


}
