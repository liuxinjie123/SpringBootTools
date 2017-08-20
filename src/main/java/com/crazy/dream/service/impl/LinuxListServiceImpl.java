package com.crazy.dream.service.impl;

import com.crazy.dream.service.ListService;
import org.springframework.stereotype.Service;

//@Service
public class LinuxListServiceImpl implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
