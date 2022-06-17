package com.sjonnie.productions.pokemon_basim_backend;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.sjonnie.productions.pokemon_basim_backend.pokemon.PokemonRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
public class PokemonTests {
    @Mock
    private PokemonRepository pokemonRepository;

    @Test
    void getPokemons(){
        assertNotNull(pokemonRepository);
        assertNotNull(this.pokemonRepository.findAll());
    }
}
