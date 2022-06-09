package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Poison implements Type{

    private String name = "Poison";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Poison(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Ground());
        weakness.add(new Psychic());
    }

    private void setResistance(){
        resistance.add(new Grass());
        resistance.add(new Fighting());
        resistance.add(new Poison());
        resistance.add(new Bug());
        resistance.add(new Fairy());
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

