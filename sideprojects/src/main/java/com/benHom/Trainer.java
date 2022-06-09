package com.benHom;

import com.benHom.Pokemon.Pokemon;

import java.io.FileWriter;
import java.util.Scanner;

public class Trainer {

    private Pokemon[] pokemon = new Pokemon[6];
    private String name;
    private Pokemon activePokemon;
    private Scanner userInput = new Scanner(System.in);

    public Trainer(String name){
        this.name = name;
    }


    //**********GETTERS AND SETTERS**************
    public Pokemon[] getPokemon() {
        return pokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPokemon() {
        this.pokemon = pokemon;
    }

    public Pokemon getActivePokemon() {
        return activePokemon;
    }

    public void setActivePokemon(Pokemon activePokemon) {
        this.activePokemon = activePokemon;
    }
}
