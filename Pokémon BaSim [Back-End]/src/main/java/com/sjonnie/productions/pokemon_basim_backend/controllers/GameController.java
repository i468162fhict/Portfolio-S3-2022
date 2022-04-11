package com.sjonnie.productions.pokemon_basim_backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = GameController.RESOURCE_URL)
public class GameController {
    public static final String RESOURCE_URL = "/api/games";

    //TODO Make Player join a game.
    /*@GetMapping(value = "/join")
    public ResponseEntity<> joinGame() {
        return ResponseEntity.ok();
    }*/
}
