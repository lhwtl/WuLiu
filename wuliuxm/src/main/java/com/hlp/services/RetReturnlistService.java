package com.hlp.services;

import com.hlp.model.RetReturnlist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RetReturnlistService {
    public RetReturnlist selectRetReturnlistByWorkSheetNo(String worksheetno);
    //申请返货
    public List<RetReturnlist> selectRetReturnlistHlp(int pages, int rows,String worksheetno);
    //申请返货最大值
    public int selectRetReturnlistMaxHlp();
    //生成返货单
    public List<RetReturnlist> selectRetReturnlistScfhdHlp(int pages, int rows,String worksheetno);
    //删除
    public void deleteRetReturnlistByIdHlp(int id);
}
