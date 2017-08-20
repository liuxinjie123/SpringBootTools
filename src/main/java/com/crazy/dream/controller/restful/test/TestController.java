package com.crazy.dream.controller.restful.test;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/test")
@RestController("restful.test.testController")
public class TestController {

    @GetMapping(value = "/url", produces = "text/plain; charset=UTF-8")
    public Result testUrl(HttpServletRequest request) {
        String url = "url:" + request.getRequestURL() + " can access.";
        return Result.setCode(Constants.RETURN_OK).setData(url);
    }
}
