package com.crazy.dream.controller.restful.test;

import com.crazy.dream.ApplicationRun;
import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.dto.user.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/json/test")
@RestController("restful.test.jsonTestController")
public class JsonTestController {
    private static final Logger logger = LoggerFactory.getLogger(JsonTestController.class);

    @GetMapping(value = "/path", produces = "application/json; charset=UTF-8")
    public Result jsonTestIndex(HttpServletRequest request) {
        logger.info(" -------------------- json test url method ------------------- ");
        String url = "url:" + request.getRequestURL() + " can access.";
        return Result.setCode(Constants.RETURN_OK).setData(url);
    }

    @GetMapping(value = "/path/{str}", produces = "application/json; charset=UTF-8")
    public Result pathVariableTest(@PathVariable("str") String str, HttpServletRequest request) {
        String url = "url:" + request.getRequestURL() + " can access, str:" + str;
        return Result.setCode(Constants.RETURN_OK).setData(url);
    }

    @PostMapping(value = "/obj", produces = "application/json; charset=UTF-8")
    public Result objVariableTest(@RequestBody UserDTO user, HttpServletRequest request) {
        String url = "url:" + request.getRequestURL() + ", user:" + user.toString();
        return Result.setCode(Constants.RETURN_OK).setData(url);
    }


}
