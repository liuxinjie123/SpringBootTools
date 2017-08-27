package com.crazy.dream.controller.restful.test;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.config.properties.MyPropertySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/test")
@RestController("restful.test.testController")
public class TestController {
    @Value("${my.name}")
    private String name;
    @Autowired
    private MyPropertySettings myPropertySettings;

    @GetMapping(value = "/url", produces = "application/json; charset=UTF-8")
    public Result testUrl(HttpServletRequest request) {
        String url = "url:" + request.getRequestURL() + " can access.";
        return Result.setCode(Constants.RETURN_OK).setData(url);
    }

    @GetMapping(value = "/value", produces = "application/json; charset=UTF-8")
    public Result testPropertySource() {
        return Result.setCode(Constants.RETURN_OK).setData(name);
    }

    @GetMapping(value = "/config/property", produces = "application/json; charset=UTF-8")
    public Result testConfigProperty() {
        return Result.setCode(Constants.RETURN_OK).setData(myPropertySettings.getName());
    }
}
