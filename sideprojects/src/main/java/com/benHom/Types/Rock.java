package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Rock implements Type{

    private String name = "Rock";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Rock(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Water());
        weakness.add(new Grass());
        weakness.add(new Fighting());
        weakness.add(new Ground());
        weakness.add(new Steel());
    }

    private void setResistance(){
        resistance.add(new Normal());
        resistance.add(new Fire());
        resistance.add(new Poison());
        resistance.add(new Flying());
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

