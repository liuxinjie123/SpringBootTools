package com.crazy.dream.config.interceptors;

import com.crazy.dream.dao.user.UserVisitLogDao;
import com.crazy.dream.mapper.UserVisitLogMapper;
import com.crazy.dream.utils.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserVisitInterceptorAdapter extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(UserVisitInterceptorAdapter.class);
    @Autowired
    private UserVisitLogMapper userVisitLogMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView view) {
        if (handler instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod) handler;
            long startTime = (Long) request.getAttribute("startTime");
            request.removeAttribute("startTime");
            long endTime = System.currentTimeMillis();
            long useTime = endTime - startTime;
            String url = request.getRequestURL().toString();
            String methodName = method.getMethod().getName();
            String userAgent = request.getHeader("user-agent");
            String userIp = WebUtils.getIpAddress(request);
            String requestType = request.getMethod();
            String useTimeStr = String.valueOf(useTime);
            UserVisitLogDao userVisitLogDao = new UserVisitLogDao( url, methodName, null, null, null, userAgent, userIp, requestType, useTimeStr);
            userVisitLogMapper.save(userVisitLogDao);
        }
    }
}
