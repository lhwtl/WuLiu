package com.hlp.services;

import com.hlp.model.DisWorkordersign;

import java.util.List;

public interface DisWorkordersignService {
    //签收录入
    public List<DisWorkordersign> selectDisWorkordersignHlp(int pages, int rows, String worksheetno, String recipient);
    //签收录入最大值
    public int selectDisWorkordersignMaxHlp();

    //取消签收确认
    public List<DisWorkordersign> selectDisWorkordersignQSslrHlp(int pages, int rows,String worksheetno);
   //添加签收录入
    public int addDisWorkordersignHlp(DisWorkordersign disWorkordersign);
    //修改签收录入
    public int updateDisWorkordersignHlp(DisWorkordersign disWorkordersign);
}
