package io.github.nimkoes.ssis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
