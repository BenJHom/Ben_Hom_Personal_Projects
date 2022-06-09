package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Steel implements Type{

    private String name = "Steel";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Steel(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Fire());
        weakness.add(new Fighting());
        weakness.add(new Ground());
    }

    private void setResistance(){
        resistance.add(new Normal());
        resistance.add(new Rock());
        resistance.add(new Grass());
        resistance.add(new Ice());
        resistance.add(new Flying());
        resistance.add(new Bug());
        resistance.add(new Psychic());
        resistance.add(new Dragon());
        resistance.add(new Steel());
        resistance.add(new Fairy());
    }

    private void setImmunity(){
        immunity.add(new Poison());
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

