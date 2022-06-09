package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Ice implements Type{

    private String name = "Ice";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Ice(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Fire());
        weakness.add(new Fighting());
        weakness.add(new Rock());
        weakness.add(new Steel());
    }

    private void setResistance(){
        resistance.add(new Ice());
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

