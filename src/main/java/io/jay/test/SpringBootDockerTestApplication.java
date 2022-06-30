package io.jay.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringBootDockerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerTestApplication.class, args);
    }

}

@RestController
class HealthController {

    @GetMapping("/health")
    public Mono<String> health() {
        return Mono.just("ok");
    }
}