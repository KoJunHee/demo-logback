package me.jko.demologback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        log.trace("this is TRACE Level");
        log.debug("this is DEBUG Level");
        log.info("this is INFO Level");
        log.warn("this is WARN Level");
        log.error("this is ERROR Level");
    }
}
