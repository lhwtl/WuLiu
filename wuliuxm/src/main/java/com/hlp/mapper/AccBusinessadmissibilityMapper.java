package com.hlp.mapper;

import com.hlp.model.AccBusinessadmissibility;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AccBusinessadmissibilityMapper {
    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    @Select("select b.* from(select t.*,rownum rn from acc_businessadmissibility t )b where 1=1 and b.rn>(#{pages}-1)*#{size} and b.rn <=#{pages}*#{size} and b.telphone like '%'||#{telphone}||'%' and b.businessnoticeno like '%'||#{businessnoticeno}||'%'")

    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "businessnoticeno",column = "businessnoticeno"),
            @Result(property = "processingunit",column = "processingunit"),
            @Result(property = "pickerinfo",column = "pickerinfo"),
            @Result(property = "accWorkorder",column ="businessnoticeno",one=@One(select = "com.hlp.mapper.AccWorkorderMapper.selectAccWorkorderBybusinessnoticeno")),
            @Result(property = "syEmp",column = "pickerinfo",one=@One(select = "com.hlp.mapper.SyEmpMapper.selectSysEmpByPickerInfo")),
            @Result(property = "syUnits",column = "processingunit",one=@One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsByProcessingUnit"))

    })
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibility(int pages,int size,String telphone,String businessnoticeno);

    //查询查台转单||人工调度中需要的最大值
    @Select("select count(*) from acc_businessadmissibility")
    public int selectCountHlp();

    @Select("select b.* from(select t.*,rownum rn from acc_businessadmissibility t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.processingunit like '%'||#{processingunit}||'%' and b.businessnoticeno like '%'||#{businessnoticeno}||'%'")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "businessnoticeno",column = "businessnoticeno"),
            @Result(property = "processingunit",column = "processingunit"),
            @Result(property = "pickerinfo",column = "pickerinfo"),
            @Result(property = "id",column = "id"),
            @Result(property = "accWorkorder",column ="businessnoticeno",one=@One(select = "com.hlp.mapper.AccWorkorderMapper.selectAccWorkorderBybusinessnoticeno")),
            @Result(property = "syEmp",column = "pickerinfo",one=@One(select = "com.hlp.mapper.SyEmpMapper.selectSysEmpByPickerInfo")),
            @Result(property = "syUnits",column = "processingunit",one=@One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsByProcessingUnit")),
            @Result(property = "disDispatchhistory",column = "id",one=@One(select = "com.hlp.mapper.DisDispatchhistoryMapper.selectDisDispatchhistoryByidHlp"))

    })
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityRgdd(int pages,int rows,short processingunit,String businessnoticeno);

    @Select("select b.* from(select t.*,rownum rn from acc_businessadmissibility t )b where b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} ")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "businessnoticeno",column = "businessnoticeno"),
            @Result(property = "processingunit",column = "processingunit"),
            @Result(property = "pickerinfo",column = "pickerinfo"),
            @Result(property = "dispatchsequence",column = "dispatchsequence"),
            @Result(property = "accWorkorder",column ="businessnoticeno",one=@One(select = "com.hlp.mapper.AccWorkorderMapper.selectAccWorkorderBybusinessnoticeno")),
            @Result(property = "syEmp",column = "pickerinfo",one=@One(select = "com.hlp.mapper.SyEmpMapper.selectSysEmpByPickerInfo")),
            @Result(property = "syUnits",column = "processingunit",one=@One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsByProcessingUnit")),
            @Result(property = "disDispatchhistory",column = "dispatchsequence",one=@One(select = "com.hlp.mapper.DisDispatchhistoryMapper.selectDisDispatchhistoryByidHlp"))

    })
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityRgddfy(int pages,int rows);





}
