package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Normal implements Type{

    private String name = "Normal";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Normal(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Fighting");
    }

    private void setResistance(){
    }

    private void setImmunity(){
        immunity.add("Ghost");
    }

    public String getName(){
        return name;
    }

    public List<String> getWeakness(){
        return weakness;
    }

    public List<String> getResistance() {
        return resistance;
    }

    public List<String> getImmunity() {
        return immunity;
    }
}
