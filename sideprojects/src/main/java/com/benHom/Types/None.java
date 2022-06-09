package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class None implements Type{

    private String name = "None";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

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

    public List<Type> getWeakness(){
        return weakness;
    }

    @Override
    public List<Type> getResistance() {
        return resistance;
    }

    @Override
    public List<Type> getImmunity() {
        return immunity;
    }
}

