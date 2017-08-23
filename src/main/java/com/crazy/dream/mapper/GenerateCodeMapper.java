package com.crazy.dream.mapper;

import com.crazy.dream.dao.common.GenerateCodeDao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface GenerateCodeMapper {

    @Insert("insert into a_generate_code (type, name, create_time) " +
            "values(#{type}, #{name}, now())")
    @Options(useGeneratedKeys=true)
    int generateCode(GenerateCodeDao generateCodeDao);
}
