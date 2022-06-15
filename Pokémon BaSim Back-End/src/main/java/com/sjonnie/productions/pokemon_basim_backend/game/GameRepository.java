package com.sjonnie.productions.pokemon_basim_backend.game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query("SELECT a FROM Game a WHERE a.player2Id IS NULL")
    List<Game> findJoinableGame();
}
