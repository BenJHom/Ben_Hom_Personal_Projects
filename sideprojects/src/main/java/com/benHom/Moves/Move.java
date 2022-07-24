package com.benHom.Moves;

import com.benHom.Types.Type;

public class Move {

    private String name;
    private Type type;
    private int power;
    private int accuracy;
    private int effectKey;
    private int effectChance;
    private boolean isPhysical;
    private boolean isStatus;

    public Move(String name, Type type, int power, int accuracy, int effectKey, int effectChance, boolean isPhysical, boolean isStatus){
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.effectKey = effectKey;
        this.effectChance = effectChance;
        this.isPhysical = isPhysical;
        this.isStatus = isStatus;
    }

    //GETTERS FOR DISPLAY
    public String getName() {
        return name;
    }

    //GETTERS FOR BATTLE
    public Type getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getEffectKey() {
        return effectKey;
    }

    public int getEffectChance() {
        return effectChance;
    }

    public boolean isPhysical() {
        return isPhysical;
    }

    public boolean isStatus() { return isStatus;}
}
