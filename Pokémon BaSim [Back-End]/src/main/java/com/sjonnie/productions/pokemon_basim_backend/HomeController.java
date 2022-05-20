package com.sjonnie.productions.pokemon_basim_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class HomeController {
    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("pokemons")
    public List<Pokemon> getPokemons() {
        return (List<Pokemon>) this.pokemonRepository.findAll();
    }
}
