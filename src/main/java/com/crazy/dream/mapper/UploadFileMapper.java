package com.crazy.dream.mapper;

import com.crazy.dream.dao.common.UploadFileDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface UploadFileMapper {

    @Insert("insert into a_upload_file_by_user (code, name, orig_file_name, user_code, file_path, create_time) " +
            "values(#{code}, #{name}, #{origFileName}, #{userCode}, #{filePath}, now())")
    @Options(useGeneratedKeys=true)
    int addUploadFileRecord(UploadFileDao file);
}
