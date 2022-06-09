package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Fire implements Type{

    private String name = "Fire";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Fire(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Water());
        weakness.add(new Ground());
        weakness.add(new Rock());
    }

    private void setResistance(){
        resistance.add(new Fire());
        resistance.add(new Grass());
        resistance.add(new Dark());
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
