package com.benHom.Types;

import java.util.ArrayList;
import java.util.List;

public class Dark implements Type{

    private String name = "Dark";
    private List<String> weakness = new ArrayList<>();
    private List<String> resistance = new ArrayList<>();
    private List<String> immunity = new ArrayList<>();

    public Dark(){
        setWeakness();
        setResistance();
        setImmunity();
    }

    private void setWeakness(){
        weakness.add("Fighting");
        weakness.add("Bug");
        weakness.add("Fairy");
    }

    private void setResistance(){
        resistance.add("Ghost");
        resistance.add("Dark");
    }

    private void setImmunity(){
        immunity.add("Psychic");
    }

    public String getName(){
        return name;
    }

    public List<String> getWeakness(){
        return weakness;
    }

    @Override
    public List<String> getResistance() {
        return resistance;
    }

    @Override
    public List<String> getImmunity() {
        return immunity;
    }
}

