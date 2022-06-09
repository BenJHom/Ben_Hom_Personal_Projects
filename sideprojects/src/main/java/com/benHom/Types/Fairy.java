package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Fairy implements Type{

    private String name = "Fairy";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Fairy(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Poison());
        weakness.add(new Steel());
    }

    private void setResistance(){
        resistance.add(new Bug());
        resistance.add(new Fighting());
        resistance.add(new Dark());
    }

    private void setImmunity(){
        immunity.add(new Dragon());
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
