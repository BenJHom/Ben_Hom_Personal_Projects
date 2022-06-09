package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Normal implements Type{

    private String name = "Normal";
    private List<Type> weakness = new ArrayList<>();
    private List<Type> resistance = new ArrayList<>();
    private List<Type> immunity = new ArrayList<>();

    public Normal(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add(new Fighting());
    }

    private void setResistance(){
    }

    private void setImmunity(){
        immunity.add(new Ghost());
    }

    public String getName(){
        return name;
    }

    public List<Type> getWeakness(){
        return weakness;
    }

    public List<Type> getResistance() {
        return resistance;
    }

    public List<Type> getImmunity() {
        return immunity;
    }
}
