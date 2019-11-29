package com.hlp.services;

import com.hlp.model.SorOutbounddetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorOutbounddetailsService {
    public int insertSorOutbounddetailsLx(SorOutbounddetails sorOutbounddetails);

    public int updateSorOutbounddetailsLx(SorOutbounddetails sorOutbounddetails);

    public List<SorOutbounddetails> FiillSorOutbounddetailsByid(String packageid);

    public int deleteSorOutbounddetailsLx(String packageid);
}
