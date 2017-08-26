package com.crazy.dream.controller.restful.test;

import com.crazy.dream.controller.restful.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@RequestMapping("/server")
@Controller
public class SseController extends BaseController {

    @GetMapping(value = "/sse")
    public String ssePage() {
        return "sse";
    }

    @GetMapping(value = "/push", produces = "text/event-stream; charset=UTF-8")
    @ResponseBody
    public String serverPushTest() {
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data: Testing, " + r.nextInt() + "\n\n";
    }

}
