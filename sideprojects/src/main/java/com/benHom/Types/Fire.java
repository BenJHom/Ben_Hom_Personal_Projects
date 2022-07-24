package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Fire implements Type{

    private String name = "Fire";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Fire(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Water");
        weakness.add("Ground");
        weakness.add("Rock");
    }

    private void setResistance(){
        resistance.add("Fire");
        resistance.add("Grass");
        resistance.add("Dark");
        resistance.add("Ice");
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
