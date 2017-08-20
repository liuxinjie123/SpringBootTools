package com.crazy.dream.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserDTO implements Serializable {
    private String code;
    private String name;
    private String phone;
}
