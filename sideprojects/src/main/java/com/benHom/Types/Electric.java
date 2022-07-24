package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Electric implements Type{

    private String name = "Electric";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Electric(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Ground");
    }

    private void setResistance(){
        resistance.add("Electric");
        resistance.add("Flying");
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
