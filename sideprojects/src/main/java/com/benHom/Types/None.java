package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class None implements Type{

    private String name = "None";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public None(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
    }

    private void setResistance(){
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

