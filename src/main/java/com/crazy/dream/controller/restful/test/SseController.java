package com.crazy.dream.controller.restful.test;

import com.crazy.dream.common.constants.Constants;
import com.crazy.dream.common.result.Result;
import com.crazy.dream.controller.restful.common.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequestMapping("/server")
@RestController
public class SseController extends BaseController {

    @GetMapping(value = "/push", produces = "application/json; charset=UTF-8")
    public Result serverPushTest() {
        Random r = new Random();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Result.setCode(Constants.RETURN_OK).setData(r.toString());
    }

}
