package com.crazy.dream.dao.user;

import com.crazy.dream.dao.BaseDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVisitLogDao extends BaseDao {
    private String url;
    private String method;
    private String userCode;
    private String userName;
    private String userPhone;
    private String userAgent;
    private String userIp;
    private String requestType;
    private String useTime;
    private LocalDateTime createTime;

    public String getUrl() {
        if (url.length() > 100) url = url.substring(0, 100);
        return url;
    }

    public UserVisitLogDao(String url, String method, String userCode, String userName, String userPhone, String userAgent, String userIp, String requestType, String useTime) {
        this.url = url;
        this.method = method;
        this.userCode = userCode;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAgent = userAgent;
        this.userIp = userIp;
        this.requestType = requestType;
        this.useTime = useTime;
    }

}
