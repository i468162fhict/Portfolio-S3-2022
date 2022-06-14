package com.sjonnie.productions.pokemon_basim_backend.Pokemon;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.sjonnie.productions.pokemon_basim_backend.pokemon.PokemonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class PokemonTests {
    @MockBean
    private PokemonRepository pokemonRepository;

    @Test
    void testGetPokemons(){
        assertNotNull(pokemonRepository);
    }
}
