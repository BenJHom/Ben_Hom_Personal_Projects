package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Rock implements Type{

    private String name = "Rock";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Rock(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Water");
        weakness.add("Grass");
        weakness.add("Fighting");
        weakness.add("Ground");
        weakness.add("Steel");
    }

    private void setResistance(){
        resistance.add("Normal");
        resistance.add("Fire");
        resistance.add("Poison");
        resistance.add("Flying");
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

