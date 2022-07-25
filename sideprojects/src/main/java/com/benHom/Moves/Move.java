package com.benHom.Moves;

import com.benHom.Types.Type;

public class Move {

    private String name;
    private int type;
    private int power;
    private int accuracy;
    private int effectKey;
    private int effectChance;
    private boolean isPhysical;
    private boolean isStatus;

    public Move(){

    }

    //GETTERS FOR DISPLAY
    public String getName() {
        return name;
    }

    //GETTERS FOR BATTLE
    public int getType() {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setEffectKey(int effectKey) {
        this.effectKey = effectKey;
    }

    public void setEffectChance(int effectChance) {
        this.effectChance = effectChance;
    }

    public void setPhysical(boolean physical) {
        isPhysical = physical;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }
}
