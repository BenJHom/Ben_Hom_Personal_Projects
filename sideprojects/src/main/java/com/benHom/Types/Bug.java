package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Bug implements Type{

    private String name = "Bug";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Bug(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Fire");
        weakness.add("Flying");
        weakness.add("Rock");
    }

    private void setResistance(){
        resistance.add("Grass");
        resistance.add("Fighting");
        resistance.add("Ground");
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
