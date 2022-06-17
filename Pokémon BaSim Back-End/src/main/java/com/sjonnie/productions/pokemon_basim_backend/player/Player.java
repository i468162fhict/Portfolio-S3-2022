package com.sjonnie.productions.pokemon_basim_backend.player;

import com.sjonnie.productions.pokemon_basim_backend.pokemon.Pokemon;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

public class Player {
    private @Id @GeneratedValue long id;
    private String name;
    private boolean p1;
    private Pokemon[] pokemons;

    private Player(){}
    private Player(String name, boolean p1, Pokemon[] pokemons){
        this.name = name;
        this.p1 = p1;
        this.pokemons = pokemons;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return Objects.equals(id, player.id) &&
                Objects.equals(name, player.name) &&
                Objects.equals(p1, player.p1) &&
                Arrays.equals(pokemons, player.pokemons);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id, name, p1, Arrays.hashCode(pokemons));
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getP1(){
        return p1;
    }
    public void setP1(boolean p1){
        this.p1 = p1;
    }
    public Pokemon[] getPokemons(){
        return pokemons;
    }
    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString(){
        return "Player{" +
                "id=" + id +
                ", name=" + name + '\'' +
                ", p1=" + p1 + '\'' +
                ", pokemons=" + Arrays.toString(pokemons) + '\'' +
                '}';
    }
}
