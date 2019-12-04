package com.hlp.services;

import com.hlp.model.IaeLineresource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IaeLineresourceService {

    public List<IaeLineresource> FillIaeLineresourceLX();
}
