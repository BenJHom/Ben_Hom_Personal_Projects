package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Fighting implements Type{

    private String name = "Fighting";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Fighting(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Psychic());
        weakness.add(new Flying());
        weakness.add(new Fairy());
    }

    private void setResistance(){
        resistance.add(new Bug());
        resistance.add(new Rock());
        resistance.add(new Dark());
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
