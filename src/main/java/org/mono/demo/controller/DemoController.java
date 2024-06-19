package org.mono.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // create a demo get API
    @GetMapping("/demo")
    public String getDemo() {
        return "Hello from Mono!";
    }

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
}
