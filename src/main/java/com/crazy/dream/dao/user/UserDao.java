package com.crazy.dream.dao.user;

import com.crazy.dream.dao.BaseDao;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserDao extends BaseDao implements Serializable {
    private String phone;
    private String username;
    private String password;
    private String description;
}
