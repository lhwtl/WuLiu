package com.hlp.services.Impl;

import com.hlp.mapper.SorStorageMapper;
import com.hlp.model.SorStorage;
import com.hlp.services.SorStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorStorageServiceImpl implements SorStorageService {
    @Autowired
    private SorStorageMapper stm;

    @Override
    public List<SorStorage> FillAllSorStorageLx() {
        return stm.FillAllSorStorageLx();
    }

    @Override
    public int insertSorStorageLx(SorStorage sorStorage) {
        return stm.insertSorStorageLx(sorStorage);
    }

    @Override
    public int deleteSorStorageLx(int id) {
        return stm.deleteSorStorageLx(id);
    }

    @Override
    public int updateSorStorageLx(SorStorage sorStorage) {
        return stm.updateSorStorageLx(sorStorage);
    }

    @Override
    public List<SorStorage> FillSorStorageByidLX(int id) {
        return stm.FillSorStorageByidLX(id);
    }
}
