package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Dark implements Type{

    private String name = "Dark";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Dark(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Fighting());
        weakness.add(new Bug());
        weakness.add(new Fairy());
    }

    private void setResistance(){
        resistance.add(new Ghost());
        resistance.add(new Dark());
    }

    private void setImmunity(){
        immunity.add(new Psychic());
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

