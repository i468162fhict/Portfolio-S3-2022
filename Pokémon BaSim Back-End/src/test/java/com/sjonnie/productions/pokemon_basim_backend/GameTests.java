package com.sjonnie.productions.pokemon_basim_backend;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.sjonnie.productions.pokemon_basim_backend.controllers.GameController;
import com.sjonnie.productions.pokemon_basim_backend.game.Game;
import com.sjonnie.productions.pokemon_basim_backend.game.GameRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@ActiveProfiles("test")
@SpringBootTest
public class GameTests {
    @Mock
    private GameRepository gameRepository;
    @InjectMocks
    private GameController gameController;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void CreateGame() throws Exception {
        String jSessionId = "3a64adc78f2dae266c99767c6686bc0d";
        Game game1 = new Game(jSessionId);
        Mockito.when(gameController.createNewGame(jSessionId));

        List<Game> games = gameRepository.findAll();

        assertThat(games).hasSameClassAs(game1);
    }
}
