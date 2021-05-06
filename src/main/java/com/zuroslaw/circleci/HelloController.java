package com.zuroslaw.circleci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{message}")
    private Mono<String> hello(@PathVariable String message) {
        return Mono.just("Hello World " + message);
    }
}