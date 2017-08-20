package com.crazy.dream.service.impl;

import com.crazy.dream.service.FileService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    ResourceLoader resourceLoader;
    @Value("${filePath}")
    private String rootFilePath;

    @Override
    public String readFile() throws IOException {
        String filePath = rootFilePath + "Hello.txt";
        Resource resource = resourceLoader.getResource(filePath);
        return IOUtils.toString(resource.getInputStream());
    }
}
