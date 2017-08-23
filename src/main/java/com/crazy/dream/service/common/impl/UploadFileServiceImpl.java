package com.crazy.dream.service.common.impl;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.dao.common.UploadFileDao;
import com.crazy.dream.mapper.UploadFileMapper;
import com.crazy.dream.service.common.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadFileServiceImpl implements UploadFileService {
    @Autowired
    private UploadFileMapper uploadFileMapper;

    @Override
    public Result addUploadFileRecord(UploadFileDao uploadFile) {
        if (uploadFileMapper.addUploadFileRecord(uploadFile) == 1) {
            return Result.setCode(Constants.RETURN_OK).setData(uploadFile);
        } else {
            return Result.setCode(Constants.RETURN_ERROR);
        }
    }
}
