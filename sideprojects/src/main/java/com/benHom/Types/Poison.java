package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Poison implements Type{

    private String name = "Poison";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Poison(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Ground");
        weakness.add("Psychic");
    }

    private void setResistance(){
        resistance.add("Grass");
        resistance.add("Fighting");
        resistance.add("Poison");
        resistance.add("Bug");
        resistance.add("Fairy");
    }

    private void setImmunity(){
    }

    public String getName(){
        return name;
    }

    public List<String> getWeakness(){
        return weakness;
    }

    @Override
    public List<String> getResistance() {
        return resistance;
    }

    @Override
    public List<String> getImmunity() {
        return immunity;
    }
}

