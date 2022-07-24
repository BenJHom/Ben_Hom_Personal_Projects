package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Fairy implements Type{

    private String name = "Fairy";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Fairy(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Poison");
        weakness.add("Steel");
    }

    private void setResistance(){
        resistance.add("Bug");
        resistance.add("Fighting");
        resistance.add("Dark");
    }

    private void setImmunity(){
        immunity.add("Dragon");
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
