package com.hlp.services.Impl;

import com.hlp.mapper.DisWorkordersignMapper;
import com.hlp.model.DisWorkordersign;
import com.hlp.services.DisWorkordersignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DisWorkordersignServiceImpl implements DisWorkordersignService {
    @Autowired
    private DisWorkordersignMapper disWorkordersignMapper;
    @Override
    public List<DisWorkordersign> selectDisWorkordersignHlp(int pages,int rows,String worksheetno,String recipient){
        return disWorkordersignMapper.selectDisWorkordersignHlp(pages,rows,worksheetno,recipient);
    }

    @Override
    public int selectDisWorkordersignMaxHlp() {
        return disWorkordersignMapper.selectDisWorkordersignMaxHlp();
    }

    @Override
    public List<DisWorkordersign> selectDisWorkordersignQSslrHlp(int pages, int rows,String worksheetno){
        return disWorkordersignMapper.selectDisWorkordersignQSslrHlp(pages, rows,worksheetno);
    }
}
