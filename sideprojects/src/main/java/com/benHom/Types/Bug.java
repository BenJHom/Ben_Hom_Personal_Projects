package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Bug implements Type{

    private String name = "Bug";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Bug(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Fire());
        weakness.add(new Flying());
        weakness.add(new Rock());
    }

    private void setResistance(){
        resistance.add(new Grass());
        resistance.add(new Fighting());
        resistance.add(new Ground());
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
