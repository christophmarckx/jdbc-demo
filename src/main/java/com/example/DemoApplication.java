package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        try
        {
            SpringApplication.run(DemoApplication.class, args);
        }
        catch(Exception e){
            SpringApplication.run(DemoApplication.class, args);
        }


    }
}
