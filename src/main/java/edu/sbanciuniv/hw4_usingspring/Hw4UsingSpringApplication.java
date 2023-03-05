package edu.sbanciuniv.hw4_usingspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"edu.sbanciuniv.hw4_usingspring.repository"})
public class Hw4UsingSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hw4UsingSpringApplication.class, args);
    }

}
