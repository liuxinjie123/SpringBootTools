package com.crazy.dream.controller.restful.common;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.dao.common.UploadFileDao;
import com.crazy.dream.mapper.UploadFileMapper;
import com.crazy.dream.service.common.GenerateCodeService;
import com.crazy.dream.service.common.UploadFileService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UploadFileService uploadFileService;
    @Autowired
    private GenerateCodeService generateCodeService;

    @PostMapping(value = "/upload/file")
    public Result uploadFile(MultipartFile file) {
        try {
            String filePathStr = rootFilePath + UUID.randomUUID() + File.separator;
            File filePath = new File(filePathStr);
            if (!filePath.exists()) filePath.mkdirs();
            String newFileName = file.getOriginalFilename();
            String newFileFullName = filePathStr + newFileName;
            FileUtils.writeByteArrayToFile(new File(newFileFullName), file.getBytes());
            UploadFileDao uploadFile = new UploadFileDao(generateCodeService.generateCode("FILE", "文件"), newFileName, file.getOriginalFilename(), getUserCode(), newFileFullName);
            Result res = uploadFileService.addUploadFileRecord(uploadFile);
            if (res.returnCode.equals(Constants.RETURN_OK)) {
                return Result.setCodeMsg(Constants.RETURN_OK, Constants.UPLOAD_SUCCESS).setData(res.data);
            } else {
                return Result.setCodeMsg(Constants.RETURN_ERROR, Constants.UPLOAD_ERROR);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return Result.setCodeMsg(Constants.RETURN_ERROR, Constants.UPLOAD_ERROR);
        }
    }

}
