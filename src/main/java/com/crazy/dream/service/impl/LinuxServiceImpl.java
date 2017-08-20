package com.crazy.dream.service.impl;

import com.crazy.dream.service.SystemService;

//@Service
public class LinuxServiceImpl implements SystemService {
    @Override
    public String showListCmd() {
        return "ls";
    }

    @Override
    public String getCurrentSystemName() {
        return "Linux";
    }
}
