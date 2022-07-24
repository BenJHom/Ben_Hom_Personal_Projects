package com.benHom.Types;

import java.util.List;
import java.util.Map;

public class Type {

    String name;
    List<Integer> weaknesses;
    List<Integer> resistances;
    List<Integer> immunities;

    public Type(){

    }

    public List<Integer> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Integer> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<Integer> getResistances() {
        return resistances;
    }

    public void setResistances(List<Integer> resistances) {
        this.resistances = resistances;
    }

    public List<Integer> getImmunities() {
        return immunities;
    }

    public void setImmunities(List<Integer> immunities) {
        this.immunities = immunities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
