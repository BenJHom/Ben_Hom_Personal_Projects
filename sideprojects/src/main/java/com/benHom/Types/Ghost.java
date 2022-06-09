package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Ghost implements Type{

    private String name = "Ghost";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Ghost(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Ghost());
        weakness.add(new Dark());
    }

    private void setResistance(){
        resistance.add(new Bug());
        resistance.add(new Poison());
    }

    private void setImmunity(){
        immunity.add(new Normal());
        immunity.add(new Fighting());
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

