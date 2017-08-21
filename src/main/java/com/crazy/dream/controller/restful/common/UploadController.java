package com.crazy.dream.controller.restful.common;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController extends BaseController {
    @Value("${filePath}")
    private String rootFilePath;

    @PostMapping(value = "/upload/file")
    public Result uploadFile(MultipartFile file) {
        try {
            String filePathStr = rootFilePath + UUID.randomUUID() + File.separator;
            File filePath = new File(filePathStr);
            if (!filePath.exists()) filePath.mkdirs();
            FileUtils.writeByteArrayToFile(new File(filePathStr + file.getOriginalFilename()), file.getBytes());
            return Result.setCodeMsg(Constants.RETURN_OK, Constants.UPLOAD_SUCCESS);
        } catch (IOException e) {
            e.printStackTrace();
            return Result.setCodeMsg(Constants.RETURN_ERROR, Constants.UPLOAD_ERROR);
        }
    }

}
