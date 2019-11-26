package com.hlp.mapper;

import com.hlp.model.RetReturnlist;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RetReturnlistMapper {

    @Select("select * from ret_returnlist where worksheetno=#{worksheetno}")
    public RetReturnlist selectRetReturnlistByWorkSheetNo(String worksheetno);
//申请返货
    @Select("select b.* from(select t.*,rownum rn from ret_returnlist t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.worksheetno like '%'||#{worksheetno}||'%'")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "worksheetno",column = "worksheetno",id = true),
            @Result(property = "returnunit",column = "returnunit",id = true),
            @Result(property = "disWorkordersign",column = "worksheetno",one=@One(select = "com.hlp.mapper.DisWorkordersignMapper.selectDisWorkordersignByworksheetno")),
            @Result(property = "syUnits",column = "returnunit",one=@One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsByProcessingUnit")),
    })
    public List<RetReturnlist> selectRetReturnlistHlp(int pages, int rows,String worksheetno);


    //申请返货最大值
    @Select("select count(*) from ret_returnlist")
    public int selectRetReturnlistMaxHlp();
    //生成返货单

    @Select("select b.* from(select t.*,rownum rn from ret_returnlist t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.worksheetno like '%'||#{worksheetno}||'%'")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "worksheetno",column = "worksheetno"),
            @Result(property = "returnunit",column = "returnunit"),
            @Result(property = "disWorkordersign",column = "worksheetno",one=@One(select = "com.hlp.mapper.DisWorkordersignMapper.selectDisWorkordersignByworksheetno")),
            @Result(property = "syUnits",column = "returnunit",one=@One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsByProcessingUnit")),
            @Result(property = "iaeLineresource",column = "worksheetno",one=@One(select = "com.hlp.mapper.IaeLineresourceMapper.selectIaeLineresourceById"))
    })
    public List<RetReturnlist> selectRetReturnlistScfhdHlp(int pages, int rows,String worksheetno);

}
