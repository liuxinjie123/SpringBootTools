package com.crazy.dream.controller.restful;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/check")
@RestController
public class CheckController {
    @Autowired
    private SystemService systemService;

    @GetMapping("/system/list")
    public Result getCurrentServerSystemListCmd() {
        return Result.setCode(Constants.RETURN_OK).setData(systemService.showListCmd());
    }

    @GetMapping("/system/name")
    public Result getCurrentServerSystemName() {
        return Result.setCode(Constants.RETURN_OK).setData(systemService.getCurrentSystemName());
    }
}
