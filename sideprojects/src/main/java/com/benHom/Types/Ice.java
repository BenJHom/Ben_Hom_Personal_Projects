package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Ice implements Type{

    private String name = "Ice";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Ice(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Fire");
        weakness.add("Fighting");
        weakness.add("Rock");
        weakness.add("Steel");
    }

    private void setResistance(){
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

