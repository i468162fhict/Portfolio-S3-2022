package com.sjonnie.productions.pokemon_basim_backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity @Table(name="Pokemons")
public class Pokemon {
    private @Id @GeneratedValue long Id;
    private String Name;
    private String Description;
    private int Hp;
    private int Str;

    public Pokemon(){}

    public Pokemon(String name, String description, int hp, int str){
        Name = name;
        Description = description;
        Hp = hp;
        Str = str;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Pokemon pokemon = (Pokemon) obj;
        return Objects.equals(Id, pokemon.Id) &&
                Objects.equals(Name, pokemon.Name) &&
                Objects.equals(Description, pokemon.Description) &&
                Objects.equals(Hp, pokemon.Hp) &&
                Objects.equals(Str, pokemon.Str);
    }
    @Override
    public int hashCode(){ return Objects.hash(Id, Name, Description, Hp, Str); }

    public Long getId() {
        return Id;
    }
    public void setId(long id){
        Id = id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    public String getDescription(){
        return Description;
    }
    public void setDescription(String description){
        Description = description;
    }
    public int getHp(){
        return Hp;
    }
    public void setHp(int hp){
        Hp = hp;
    }
    public int getStr(){
        return Str;
    }
    public void setStr(int str){
        Str = str;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "Id=" + Id +
                ", Name=" + Name + '\'' +
                ", Description=" + Description + '\'' +
                ", Hp=" + Hp + '\'' +
                ", Str=" + Str + '\'' +
                '}';
    }
}
