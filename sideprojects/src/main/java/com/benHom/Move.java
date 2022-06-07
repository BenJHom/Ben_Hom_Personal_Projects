package com.benHom;

public abstract class Move {

    private String name;
    private int power;
    private int accuracy;
    private int effectKey;

    public Move(String name, int power, int accuracy, int effectKey){
        this.name = name;
        this.power = power;
        this.accuracy = accuracy;
        this.effectKey = effectKey;
    }
}
