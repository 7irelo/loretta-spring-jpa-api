package com.lorettabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.lorettabank")
@EntityScan("com.lorettabank.model")
@EnableJpaRepositories(basePackages = "com.lorettabank.repository")
public class LorettabankApplication {

    public static void main(String[] args) {
        SpringApplication.run(LorettabankApplication.class, args);
    }
}
