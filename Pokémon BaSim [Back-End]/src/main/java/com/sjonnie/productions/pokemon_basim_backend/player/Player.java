package com.sjonnie.productions.pokemon_basim_backend.player;

import com.sjonnie.productions.pokemon_basim_backend.pokemon.Pokemon;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class Player {
    private @Id @GeneratedValue long Id;
    private String Name;
    private boolean P1;
    private Pokemon[] Pokemons;

    private Player(){}
    private Player(String Name, boolean P1, Pokemon[] Pokemons){
        this.Name = Name;
        this.P1 = P1;
        this.Pokemons = Pokemons;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return Objects.equals(Id, player.Id) &&
                Objects.equals(Name, player.Name) &&
                Objects.equals(P1, player.P1) &&
                Objects.equals(Pokemons, player.Pokemons);
    }
    @Override
    public int hashCode(){
        return Objects.hash(Id, Name, P1, Pokemons);
    }

    public long getId(){
        return Id;
    }
    public void setId(long Id){
        this.Id = Id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public boolean getP1(){
        return P1;
    }
    public void setP1(boolean P1){
        this.P1 = P1;
    }
    public Pokemon[] getPokemons(){
        return Pokemons;
    }
    public void setPokemons(Pokemon[] pokemons) {
        Pokemons = pokemons;
    }

    @Override
    public String toString(){
        return "Player{" +
                "Id=" + Id +
                ", Name=" + Name + '\'' +
                ", P1=" + P1 + '\'' +
                ", Pokemons=" + Pokemons + '\'' +
                '}';
    }
}
