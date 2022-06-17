package com.sjonnie.productions.pokemon_basim_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
public class PokemonBasimBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonBasimBackEndApplication.class, args);
    }

}
