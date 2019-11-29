package com.hlp.services.Impl;

import com.hlp.mapper.RetReturnlistMapper;
import com.hlp.model.RetReturnlist;
import com.hlp.services.RetReturnlistService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetReturnlistServiceImpl implements RetReturnlistService {
    @Autowired
    private RetReturnlistMapper retReturnlistMapper;

    @Override
    public RetReturnlist selectRetReturnlistByWorkSheetNo(String worksheetno) {
        return retReturnlistMapper.selectRetReturnlistByWorkSheetNo(worksheetno);
    }

    @Override
    public List<RetReturnlist> selectRetReturnlistHlp(int pages, int rows,String worksheetno) {
        return retReturnlistMapper.selectRetReturnlistHlp(pages, rows,worksheetno);
    }

    @Override
    public int selectRetReturnlistMaxHlp() {
        return retReturnlistMapper.selectRetReturnlistMaxHlp();
    }

    @Override
    public List<RetReturnlist> selectRetReturnlistScfhdHlp(int pages, int rows,String worksheetno) {
        return retReturnlistMapper.selectRetReturnlistScfhdHlp(pages, rows,worksheetno);
    }

    @Override
    public void deleteRetReturnlistByIdHlp(int id) {
        retReturnlistMapper.deleteRetReturnlistByIdHlp(id);
    }
}
