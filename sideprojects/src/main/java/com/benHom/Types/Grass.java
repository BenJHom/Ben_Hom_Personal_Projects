package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Grass implements Type{

    private String name = "Grass";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Grass(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Fire");
        weakness.add("Flying");
        weakness.add("Bug");
        weakness.add("Poison");
        weakness.add("Ice");
    }

    private void setResistance(){
        resistance.add("Grass");
        resistance.add("Ground");
        resistance.add("Water");
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
