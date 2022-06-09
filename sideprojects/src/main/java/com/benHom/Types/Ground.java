package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Ground implements Type{

    private String name = "Ground";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Ground(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Water());
        weakness.add(new Grass());
        weakness.add(new Ice());
    }

    private void setResistance(){
        resistance.add(new Poison());
        resistance.add(new Rock());
    }

    private void setImmunity(){
        immunity.add(new Electric());
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

