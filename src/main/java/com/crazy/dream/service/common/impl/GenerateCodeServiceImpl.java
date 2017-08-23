package com.crazy.dream.service.common.impl;

import com.crazy.dream.dao.common.GenerateCodeDao;
import com.crazy.dream.mapper.GenerateCodeMapper;
import com.crazy.dream.service.common.GenerateCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

@Service
public class GenerateCodeServiceImpl implements GenerateCodeService {
    @Autowired
    private GenerateCodeMapper generateCodeMapper;

    @Override
    public String generateCode(String type, String name) {
        GenerateCodeDao codeDao = new GenerateCodeDao(type, name);
        generateCodeMapper.generateCode(codeDao);
        int id = codeDao.getId();
        String idStr = String.format("%08d", id);
        Random random = new Random();
        String code = type.toUpperCase() + LocalDate.now() + random.nextInt(10) + random.nextInt(10) + idStr;
        return code.replaceAll("-", "");
    }
}
