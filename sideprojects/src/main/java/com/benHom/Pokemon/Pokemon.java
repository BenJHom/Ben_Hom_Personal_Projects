package com.benHom.Pokemon;
import com.benHom.Battle;
import com.benHom.Moves.Move;
import com.benHom.Types.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class Pokemon {
    private String name;
    private Type typeOne;
    private Type typeTwo;
    //[hp, atk, def, spatk, spdef, spd, acc, crit]
    private int[] stats;
    //Multipliers for all stats except crit chance
    private int[] statMultipliers = {1, 1, 1, 1, 1, 1, 1};
    private List<Move> moves;
    private int statusKey = 0;
    private boolean fainted = false;
    private String shortDescription;
    private String sound;

    public Pokemon (String name, Type typeOne, Type typeTwo, int[] stats, List moves, String shortDescription, String sound, Battle battle){
        this.name = name;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.stats = stats;
        this.moves = moves;
        this.shortDescription = shortDescription;
        this.sound = sound;
        battle.addAvailablePokemon(this);
    }

    public void addMovesToPokemon(Move move1, Move move2, Move move3, Move move4){
        moves.add(move1);
        moves.add(move2);
        moves.add(move3);
        moves.add(move4);
    }


    //*****GETTERS AND SETTERS******
    public int[] getStatMultipliers() {
        return statMultipliers;
    }

    public void setStatMultipliers(int[] statMultipliers) {
        this.statMultipliers = statMultipliers;
    }

    public int getStatusKey() {
        return statusKey;
    }

    public void setStatusKey(int statusKey) {
        this.statusKey = statusKey;
    }

    public boolean isFainted() {
        return fainted;
    }

    public void setFainted(boolean fainted) {
        this.fainted = fainted;
    }

    //**********GETTERS FOR DISPLAY ONLY**********

    public String getName() {
        return name;
    }

    public Type getTypeOne() {
        return typeOne;
    }

    public Type getTypeTwo() {
        return typeTwo;
    }

    public int[] getStats() {
        return stats;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getSound() {
        return sound;
    }
}
