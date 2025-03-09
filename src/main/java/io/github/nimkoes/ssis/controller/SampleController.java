package io.github.nimkoes.ssis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/test-filter-before-forward")
    public String beforeForward() {
        return "forward:/test-filter-after";
    }

    @GetMapping("/test-filter-before-redirect")
    public String beforeRedirect() {
        return "redirect:/test-filter-after";
    }

    @GetMapping("/test-filter-after")
    @ResponseBody
    public String after() {
        return "hello security!";
    }
}
