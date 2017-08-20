package com.crazy.dream.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BaseDao implements Serializable {
    private int id;
    private String code;
    private String name;
    private LocalDateTime createTime;
    private String createUserCode;
    private LocalDateTime lastUpdateTime;
    private String lastUpdateUserCode;

    public BaseDao (int id) {
        this.id = id;
    }
}
