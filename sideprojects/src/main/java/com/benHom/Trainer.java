package com.benHom;

public abstract class Trainer {

    private Pokemon[] pokemon;
    private String name;

    public Trainer(Pokemon[] pokemon, String name){
        this.pokemon = pokemon;
        this.name = name;
    }
}
