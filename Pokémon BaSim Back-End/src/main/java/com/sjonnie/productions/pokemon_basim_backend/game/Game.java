package com.sjonnie.productions.pokemon_basim_backend.game;

import com.sjonnie.productions.pokemon_basim_backend.player.Player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity @Table(name="Games")
public class Game {
    private @Id @GeneratedValue long id;
    private double timer;
    private String player1Id;
    private String player2Id;
    private boolean p1Turn;

    public Game(){}
    public Game(String player1Id){
        this.player1Id = player1Id;
    }
    public Game(long id, double timer, String player1Id, String player2Id, boolean p1Turn){
        this.id = id;
        this.timer = timer;
        this.player1Id = player1Id;
        this.player2Id = player2Id;
        this.p1Turn = p1Turn;
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return Objects.equals(id, game.id) &&
                Objects.equals(timer, game.timer) &&
                Objects.equals(player1Id, game.player1Id) &&
                Objects.equals(player2Id, game.player2Id) &&
                Objects.equals(p1Turn, game.p1Turn);
    }
    @Override
    public int hashCode(){ return Objects.hash(id, timer, player1Id, player2Id, p1Turn); }

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public double getTimer(){
        return timer;
    }
    public void setTimer(double timer){
        this.timer = timer;
    }
    public String getPlayer1Id(){ return player1Id; }
    public void setPlayer1Id(String player1Id){
        this.player1Id = player1Id;
    }
    public String getPlayer2Id() { return player2Id; }
    public void setPlayer2Id(String player2Id){
        this.player2Id = player2Id;
    }
    public boolean getP1Turn(){ return p1Turn; }
    public void setP1Turn(boolean p1Turn){
        this.p1Turn = p1Turn;
    }

    @Override
    public String toString(){
        return "Game{" +
                "id=" + id +
                ", timer=" + timer + '\'' +
                ", player1Id=" + player1Id + '\'' +
                ", player2Id=" + player2Id + '\'' +
                ", p1Turn=" + p1Turn + '\'' +
                '}';
    }
}
