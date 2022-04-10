package io.codejournal.maven.jacoco.dumpdemo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@RestController
class SayHelloController {

    @GetMapping("/say-hello")
    public String sayHello(@RequestParam(required = false) final String name) {
        return "Hello " + Optional.ofNullable(name).orElse("") + "\n";
    }
}
