package org.willxu.helloconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class HelloConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloConsulApplication.class, args);
    }

    @GetMapping("/hello")
    public String helloConsul() {
        return "Hello,consul!";
    }

}
