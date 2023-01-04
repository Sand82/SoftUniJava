package com.example.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventsApplication.class, args);
    }

}
