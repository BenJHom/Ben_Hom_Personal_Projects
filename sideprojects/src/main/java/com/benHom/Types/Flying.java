package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Flying implements Type{

    private String name = "Flying";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Flying(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Electric());
        weakness.add(new Ice());
        weakness.add(new Rock());
    }

    private void setResistance(){
        resistance.add(new Grass());
        resistance.add(new Bug());
        resistance.add(new Fighting());
    }

    private void setImmunity(){
        immunity.add(new Ground());
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

