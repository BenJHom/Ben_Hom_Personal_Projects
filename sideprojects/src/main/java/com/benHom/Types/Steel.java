package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Steel implements Type{

    private String name = "Steel";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Steel(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Fire");
        weakness.add("Fighting");
        weakness.add("Ground");
    }

    private void setResistance(){
        resistance.add("Normal");
        resistance.add("Rock");
        resistance.add("Grass");
        resistance.add("Ice");
        resistance.add("Flying");
        resistance.add("Bug");
        resistance.add("Psychic");
        resistance.add("Dragon");
        resistance.add("Steel");
        resistance.add("Fairy");
    }

    private void setImmunity(){
        immunity.add("Poison");
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

