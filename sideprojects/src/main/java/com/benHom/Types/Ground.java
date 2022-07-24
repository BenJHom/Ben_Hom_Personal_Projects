package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Ground implements Type{

    private String name = "Ground";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Ground(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Water");
        weakness.add("Grass");
        weakness.add("Ice");
    }

    private void setResistance(){
        resistance.add("Poison");
        resistance.add("Rock");
    }

    private void setImmunity(){
        immunity.add("Electric");
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

