package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Water implements Type{

    private String name = "Water";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Water(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Grass");
        weakness.add("Electric");
    }

    private void setResistance(){
        resistance.add("Water");
        resistance.add("Fire");
        resistance.add("Ice");
        resistance.add("Steel");
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
