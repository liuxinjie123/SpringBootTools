package com.crazy.dream.service;

import org.springframework.scheduling.annotation.Async;

import java.io.IOException;

public interface FileService {
    /**
     * 读取文件内容
     */
    public String readFile() throws IOException;
}
