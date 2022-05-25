package com.sjonnie.productions.pokemon_basim_backend.controllers;

import com.sjonnie.productions.pokemon_basim_backend.game.Game;
import com.sjonnie.productions.pokemon_basim_backend.game.GameRepository;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Convert;
import java.io.Console;
import java.util.List;
import java.util.Objects;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = IController.API)
public class GameController {
    @Autowired
    private GameRepository gameRepository;

    @GetMapping("newgame")
    public ResponseEntity<String> createNewGame(String jSessionId){
        if(checkForAvailableGames(jSessionId) && !alreadyInGame(jSessionId)){
            if(joinGame(jSessionId)) return ResponseEntity.ok("Joined a game!");
            return ResponseEntity.ok("Failed to join a game!");
        } else {
            if(!alreadyInGame(jSessionId)) {
                if (createGame(jSessionId)) {
                    return ResponseEntity.ok("Created a game!");
                } else return ResponseEntity.ok("Couldn't create or join a game");
            } else return ResponseEntity.ok("Already in a game!");
        }
    }

    private boolean checkForAvailableGames(String jSessionId){
        Game gameFound = null;
        try {
            gameFound = gameRepository.findJoinableGame().get(0);
        } catch (Exception ex) {  }
        return (gameFound != null && gameFound.getId() != 0
                && gameFound.getPlayer1Id() != null
                && !Objects.equals(gameFound.getPlayer1Id(), jSessionId)
                && gameFound.getPlayer2Id() == null);
    }

    //TODO Make Player join a game.
    private boolean joinGame(String jSessionId){
        try {
            Game game = gameRepository.findJoinableGame().get(0);
            game.setPlayer2Id(jSessionId);
            gameRepository.save(game);
        } catch (Exception ex) {  }
        return alreadyInGame(jSessionId);
    }

    //TODO Make Player be able to leave game
    private boolean leaveGame() {
        throw new NotYetImplementedException();
    }

    private boolean createGame(String jSessionId){
        Game newGame = gameRepository.save(new Game(jSessionId));
        return newGame.getId() != 0 && newGame.getPlayer1Id() != null
                && Objects.equals(newGame.getPlayer1Id(), jSessionId);
    }

    //TODO Delete game on empty
    private boolean deleteGame(){
        throw new NotYetImplementedException();
    }

    private boolean alreadyInGame(String jSessionId){
        List<Game> games = gameRepository.findAll();
        return games.stream().anyMatch(game -> Objects.equals(game.getPlayer1Id(), jSessionId))
                || games.stream().anyMatch(game -> Objects.equals(game.getPlayer2Id(), jSessionId));
    }
}
