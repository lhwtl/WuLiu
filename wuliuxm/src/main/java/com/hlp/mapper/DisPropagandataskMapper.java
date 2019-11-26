package com.hlp.mapper;

import com.hlp.model.DisPropagandatask;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisPropagandataskMapper {
    //查询宣传任务
    @Select("select b.* from(select t.*,rownum rn from dis_propagandatask t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.outline like '%'||#{outline}||'%'")
    public List<DisPropagandatask> selectDisPropagandataskHlp(int pages,int rows,String outline);


    //宣传任务最大值
    @Select("select count(*) from dis_propagandatask")
    public int selectDisPropagandataskMaxHlp();

}
