package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Fighting implements Type{

    private String name = "Fighting";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Fighting(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Psychic");
        weakness.add("Flying");
        weakness.add("Fairy");
    }

    private void setResistance(){
        resistance.add("Bug");
        resistance.add("Rock");
        resistance.add("Dark");
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
