package com.hlp.mapper;

import com.hlp.model.DisWorkordersign;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DisWorkordersignMapper {

    //签收录入
    @Select("select b.* from(select t.*,rownum rn from dis_workordersign t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.worksheetno like '%'||#{worksheetno}||'%' and b.recipient like '%'||#{recipient}||'%'")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "inputpersonid",column = "inputpersonid"),
            @Result(property = "inputid",column = "inputid"),
            @Result(property = "workordertype",column = "workordertype"),
            @Result(property = "signtype",column = "signtype"),
            @Result(property = "syEmp",column = "inputpersonid",one=@One(select = "com.hlp.mapper.SyEmpMapper.selectSysEmpByPickerInfo")),
            @Result(property = "syUnits",column = "inputid",one=@One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsByProcessingUnit")),
            @Result(property = "worktype",column = "workordertype",one=@One(select = "com.hlp.mapper.WorkTypeMapper.selectWorktypeHlp")),
            @Result(property = "qsType",column = "signtype",one=@One(select = "com.hlp.mapper.QsTypeMapper.selectQsTypeByIdHlp"))
    })
    public List<DisWorkordersign> selectDisWorkordersignHlp(int pages, int rows, String worksheetno, String recipient);

    //查询签收录入中的最大值
    @Select("select count(*) from dis_workordersign")
    public int selectDisWorkordersignMaxHlp();

    //取消确认申请查询
    //

    @Select("select b.* from(select t.*,rownum rn from dis_workordersign t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.worksheetno like '%'||#{worksheetno}||'%'")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "inputpersonid",column = "inputpersonid"),
            @Result(property = "inputid",column = "inputid"),
            @Result(property = "workordertype",column = "workordertype"),
            @Result(property = "signtype",column = "signtype"),
            @Result(property = "worksheetno",column = "worksheetno"),
            @Result(property = "syEmp",column = "inputpersonid",one=@One(select = "com.hlp.mapper.SyEmpMapper.selectSysEmpByPickerInfo")),
            @Result(property = "syUnits",column = "inputid",one=@One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsByProcessingUnit")),
            @Result(property = "worktype",column = "workordertype",one=@One(select = "com.hlp.mapper.WorkTypeMapper.selectWorktypeHlp")),
            @Result(property = "qsType",column = "signtype",one=@One(select = "com.hlp.mapper.QsTypeMapper.selectQsTypeByIdHlp")),
            @Result(property = "retReturnlist",column = "worksheetno",one=@One(select = "com.hlp.mapper.RetReturnlistMapper.selectRetReturnlistByWorkSheetNo"))
    })
    public List<DisWorkordersign> selectDisWorkordersignQSslrHlp(int pages, int rows,String worksheetno);

    //申请返货
    @Select("select * from dis_workordersign where worksheetno=#{worksheetno}")
    public DisWorkordersign selectDisWorkordersignByworksheetno(String worksheetno);

}
