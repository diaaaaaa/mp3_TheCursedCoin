package com.example.mp3_TheCursedCoin.mp1;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

    @Bean
    ApplicationRunner startMyApplication(JackSparrow jackSparrow) {
        return args -> {
            System.out.println(jackSparrow.findCursedCoin());
        };
    }
}
