package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Psychic implements Type{

    private String name = "Psychic";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Psychic(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Bug");
        weakness.add("Ghost");
        weakness.add("Dark");
    }

    private void setResistance(){
        resistance.add("Psychic");
        resistance.add("Fighting");
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

