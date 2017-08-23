package com.crazy.dream.dao.common;

import com.crazy.dream.dao.BaseDao;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenerateCodeDao extends BaseDao {
    private String type;

    public GenerateCodeDao(String type, String name) {
        super(name);
        this.type = type;
    }
}
