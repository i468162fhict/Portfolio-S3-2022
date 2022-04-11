package com.sjonnie.productions.pokemon_basim_backend.game;

import com.sjonnie.productions.pokemon_basim_backend.player.Player;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class Game {
    private @Id @GeneratedValue long Id;
    private double Timer;
    private Player Player1;
    private Player Player2;
    private boolean P1Turn;

    public Game(){}
    public Game(double Timer, Player Player1, Player Player2, boolean P1Turn){
        this.Id = Id;
        this.Timer = Timer;
        this.Player1 = Player1;
        this.Player2 = Player2;
        this.P1Turn = P1Turn;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return Objects.equals(Id, game.Id) &&
                Objects.equals(Timer, game.Timer) &&
                Objects.equals(Player1, game.Player1) &&
                Objects.equals(Player2, game.Player2) &&
                Objects.equals(P1Turn, game.P1Turn);
    }
    @Override
    public int hashCode(){ return Objects.hash(Id, Timer, Player1, Player2, P1Turn); }

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
    public Player getPlayer1(){ return Player1; }
    public void setPlayer1(Player Player1){
        this.Player1 = Player1;
    }
    public Player getPlayer2() { return Player2; }
    public void setPlayer2(Player Player2){
        this.Player2 = Player2;
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
                ", Player1=" + Player1 + '\'' +
                ", Player2=" + Player2 + '\'' +
                ", P1Turn=" + P1Turn + '\'' +
                '}';
    }
}
