package com.sjonnie.productions.pokemon_basim_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final PokemonRepository repository;

    @Autowired
    public DatabaseLoader(PokemonRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        //this.repository.save(new Pokemon("Arceus", "God", 320, 100));
    }
}
