package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Flying implements Type{

    private String name = "Flying";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Flying(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Electric");
        weakness.add("Ice");
        weakness.add("Rock");
    }

    private void setResistance(){
        resistance.add("Grass");
        resistance.add("Bug");
        resistance.add("Fighting");
    }

    private void setImmunity(){
        immunity.add("Ground");
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

