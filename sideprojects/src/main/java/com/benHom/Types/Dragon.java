package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Dragon implements Type{

    private String name = "Dragon";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Dragon(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Dragon());
        weakness.add(new Fairy());
        weakness.add(new Ice());
    }

    private void setResistance(){
        resistance.add(new Water());
        resistance.add(new Grass());
        resistance.add(new Fire());
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
