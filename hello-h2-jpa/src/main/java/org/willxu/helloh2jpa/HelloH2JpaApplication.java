package org.willxu.helloh2jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloH2JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloH2JpaApplication.class, args);
    }

}
