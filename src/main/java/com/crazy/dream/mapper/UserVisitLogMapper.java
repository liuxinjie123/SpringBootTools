package com.crazy.dream.mapper;

import com.crazy.dream.dao.user.UserVisitLogDao;
import org.apache.ibatis.annotations.Insert;

public interface UserVisitLogMapper {

    @Insert("<script>" +
            "insert into a_visit_log (url, method, " +
            "<if test='userCode!=null and userId!=\"\"'> user_code, </if>" +
            "<if test='userName!=null and userName!=\"\"'> user_name, </if>" +
            "<if test='userPhone!=null and userPhone!=\"\"'> user_phone, </if>" +
            "user_agent, user_ip, request_type, use_time, create_time)" +
            "values(#{url}, #{method}," +
            "<if test='userCode!=null and userId!=\"\"'> #{userCode}, </if>" +
            "<if test='userName!=null and userName!=\"\"'> #{userName}, </if>" +
            "<if test='userPhone!=null and userPhone!=\"\"'> #{userPhone}, </if>" +
            "#{userAgent}, #{userIp}, #{requestType}, #{useTime}, now())" +
            "</script>")
    void save(UserVisitLogDao userVisitLogDao);
}
