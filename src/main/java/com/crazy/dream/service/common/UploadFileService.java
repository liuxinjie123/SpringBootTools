package com.crazy.dream.service.common;

import com.crazy.dream.common.result.Result;
import com.crazy.dream.dao.common.UploadFileDao;

public interface UploadFileService {

    Result addUploadFileRecord(UploadFileDao uploadFile);
}
