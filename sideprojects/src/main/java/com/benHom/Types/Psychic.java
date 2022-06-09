package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Psychic implements Type{

    private String name = "Psychic";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Psychic(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Bug());
        weakness.add(new Ghost());
        weakness.add(new Dark());
    }

    private void setResistance(){
        resistance.add(new Psychic());
        resistance.add(new Fighting());
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

