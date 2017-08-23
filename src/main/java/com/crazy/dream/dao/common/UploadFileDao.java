package com.crazy.dream.dao.common;

import com.crazy.dream.dao.BaseDao;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UploadFileDao extends BaseDao {
    private String origFileName;
    private String userCode;
    private String filePath;

    public UploadFileDao (String code, String name, String origFileName, String userCode, String filePath) {
        super(code, name);
        this.origFileName = origFileName;
        this.userCode = userCode;
        this.filePath = filePath;
    }
}
