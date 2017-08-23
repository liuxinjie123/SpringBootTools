package com.crazy.dream.controller.restful.common;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.service.common.GenerateCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import java.util.concurrent.ExecutionException;

@RequestMapping("/generate/code")
@RestController
public class GenerateCodeController {
    @Autowired
    private GenerateCodeService generateCodeService;

    @GetMapping(produces = "application/json; charset=UTF-8")
    public Result generateCode(@RequestParam(required = true, value = "type") String type,
                               @RequestParam(required = false, value = "name", defaultValue = "") String name) throws ExecutionException, InterruptedException {
        if (StringUtils.isEmpty(name)) name = type;
        return Result.setCode(Constants.RETURN_OK).setData(generateCodeService.generateCode(type, name).get());
    }

    @GetMapping(value = "/test/limit", produces = "application/json; charset=UTF-8")
    public Result generateCodeTestLimit() {
        String type = "ORDER";
        String name = "测试订单";
        for (int i=0; i<1000000000; i++) {
            generateCodeService.generateCode(type, name);
        }
        return Result.setCodeMsg(Constants.RETURN_OK, "测试完成");
    }


}
