package org.leroymerlin.barcodescannerprototype.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping(value = "/post")
    public String helloPost(@RequestBody String name) {
        return "Hello " + name + "!";
    }

}
