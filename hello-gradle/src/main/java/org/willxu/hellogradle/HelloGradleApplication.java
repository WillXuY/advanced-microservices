package org.willxu.hellogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloGradleApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloGradleApplication.class, args);
    }

    @GetMapping("/hello")
    public String helloGradle() {
        return "Hello,gradle!";
    }
}
