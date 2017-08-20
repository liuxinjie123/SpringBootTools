package com.crazy.dream.controller;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/check")
@RestController
public class CheckController {
    @Autowired
    private ListService listService;

    @GetMapping("/system/list")
    public Result getCurrentServerSystem() {
        return Result.setCode(Constants.RETURN_OK).setData(listService.showListCmd());
    }
}
