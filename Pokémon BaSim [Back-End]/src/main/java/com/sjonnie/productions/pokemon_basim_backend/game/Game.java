package com.sjonnie.productions.pokemon_basim_backend.game;

import com.sjonnie.productions.pokemon_basim_backend.player.Player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity @Table(name="Games")
public class Game {
    private @Id @GeneratedValue long Id;
    private double Timer;
    private String Player1Id;
    private String Player2Id;
    private boolean P1Turn;

    public Game(){}
    public Game(String Player1Id){
        this.Player1Id = Player1Id;
    }
    public Game(double Timer, String Player1Id, String Player2Id, boolean P1Turn){
        this.Id = Id;
        this.Timer = Timer;
        this.Player1Id = Player1Id;
        this.Player2Id = Player2Id;
        this.P1Turn = P1Turn;
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return Objects.equals(Id, game.Id) &&
                Objects.equals(Timer, game.Timer) &&
                Objects.equals(Player1Id, game.Player1Id) &&
                Objects.equals(Player2Id, game.Player2Id) &&
                Objects.equals(P1Turn, game.P1Turn);
    }
    @Override
    public int hashCode(){ return Objects.hash(Id, Timer, Player1Id, Player2Id, P1Turn); }

    public long getId() {
        return Id;
    }
    public void setId(long Id){
        this.Id = Id;
    }
    public double getTimer(){
        return Timer;
    }
    public void setTimer(double Timer){
        this.Timer = Timer;
    }
    public String getPlayer1Id(){ return Player1Id; }
    public void setPlayer1Id(String Player1Id){
        this.Player1Id = Player1Id;
    }
    public String getPlayer2Id() { return Player2Id; }
    public void setPlayer2Id(String Player2Id){
        this.Player2Id = Player2Id;
    }
    public boolean getP1Turn(){ return P1Turn; }
    public void setP1Turn(boolean P1Turn){
        this.P1Turn = P1Turn;
    }

    @Override
    public String toString(){
        return "Game{" +
                "Id=" + Id +
                ", Timer=" + Timer + '\'' +
                ", Player1Id=" + Player1Id + '\'' +
                ", Player2Id=" + Player2Id + '\'' +
                ", P1Turn=" + P1Turn + '\'' +
                '}';
    }
}
