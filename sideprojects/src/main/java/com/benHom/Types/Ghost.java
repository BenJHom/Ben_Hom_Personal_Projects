package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Ghost implements Type{

    private String name = "Ghost";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Ghost(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Ghost");
        weakness.add("Dark");
    }

    private void setResistance(){
        resistance.add("Bug");
        resistance.add("Poison");
    }

    private void setImmunity(){
        immunity.add("Normal");
        immunity.add("Fighting");
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

