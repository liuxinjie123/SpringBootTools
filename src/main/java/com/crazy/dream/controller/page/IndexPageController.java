package com.crazy.dream.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("page.indexPageController")
public class IndexPageController {

    @GetMapping(value = {"", "/index"})
    public String indexPage() {
        return "index";
    }
}
