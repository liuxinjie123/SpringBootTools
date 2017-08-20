package com.crazy.dream.service.impl;

import com.crazy.dream.service.SystemService;

//@Service
public class WindowsServiceImpl implements SystemService {
    @Override
    public String showListCmd() {
        return "dir";
    }

    @Override
    public String getCurrentSystemName() {
        return "Windows";
    }


}
