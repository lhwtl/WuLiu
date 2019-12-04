package com.hlp.services;

import com.hlp.model.SorCheckbound;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorCheckboundService {
    public List<SorCheckbound> FillSorCheckboundLx();
    public List<SorCheckbound> FillSorCheckboundByidLx(int id);
    public int deleteSorCheckbound(int id);
    public int insertSorCheckboundLx(SorCheckbound sorCheckbound);
    public int updateSorCheckboundLx(SorCheckbound sorCheckbound );
    public SorCheckbound FillKCSorCheckboundByidLx(int id);/*库存*/
}
