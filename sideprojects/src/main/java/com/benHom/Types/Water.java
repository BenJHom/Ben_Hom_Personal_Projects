package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Water implements Type{

    private String name = "Water";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Water(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Grass());
        weakness.add(new Electric());
    }

    private void setResistance(){
        resistance.add(new Water());
        resistance.add(new Fire());
        resistance.add(new Ice());
        resistance.add(new Steel());
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
