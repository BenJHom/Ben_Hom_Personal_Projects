package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Type{

    private String name = "Dragon";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Dragon(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Dragon");
        weakness.add("Fairy");
        weakness.add("Ice");
    }

    private void setResistance(){
        resistance.add("Water");
        resistance.add("Grass");
        resistance.add("Fire");
        resistance.add("Electric");
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
