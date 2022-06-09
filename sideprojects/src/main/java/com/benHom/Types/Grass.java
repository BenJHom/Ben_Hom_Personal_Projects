package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Grass implements Type{

    private String name = "Grass";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Grass(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Fire());
        weakness.add(new Flying());
        weakness.add(new Bug());
        weakness.add(new Poison());
        weakness.add(new Ice());
    }

    private void setResistance(){
        resistance.add(new Grass());
        resistance.add(new Ground());
        resistance.add(new Water());
        resistance.add(new Electric());
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
