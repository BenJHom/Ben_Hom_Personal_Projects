package com.benHom.Pokemon;
import com.benHom.Battle;
import com.benHom.Moves.Move;
import com.benHom.Types.Type;

import java.util.List;


public class Pokemon {
    private String name;
    //TYPES
    private int typeOne;
    private int typeTwo;
    //MOVES
    private List<Integer> moves;
    //STATS
    private int[] stats = new int[6];
    //Multipliers for basic 6 stats
    private float[] statMultipliers = {1, 1, 1, 1, 1, 1};
    //Other modifiers
    private float accuracyModifier = 1;
    private int critModifier = 1;
    private int statusKey = 0;
    private boolean fainted = false;
    //Superficials
    private String shortDescription;
    private String sound;

    public Pokemon(){

    }


//    public void addMovesToPokemon(Move move1, Move move2, Move move3, Move move4){
//        moves.add(move1);
//        moves.add(move2);
//        moves.add(move3);
//        moves.add(move4);
//    }


    public float[] getStatMultipliers() {
        return statMultipliers;
    }

    public void setStatMultipliers(float[] statMultipliers) {
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

    public String getName() {
        return name;
    }

    public int getTypeOne() {
        return typeOne;
    }

    public int getTypeTwo() {
        return typeTwo;
    }

    //public String getTypesString() {return typeOne.getName() + (typeTwo.getName().equals("none")?"":" " + typeTwo.getName()) + " Type";}

    public List<Integer> getMoves() {
        return moves;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getSound() {
        return sound;
    }

    public int[] getStats() {
        return stats;
    }

    public void setStats(int[] stats) {
        this.stats = stats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOne(int typeOne) {
        this.typeOne = typeOne;
    }

    public void setTypeTwo(int typeTwo) {
        this.typeTwo = typeTwo;
    }

//    public void setMoves(List<Integer> moves) {
//        this.moves = moves;
//    }

    public float getAccuracyModifier() {
        return accuracyModifier;
    }

    public void setAccuracyModifier(float accuracyModifier) {
        this.accuracyModifier = accuracyModifier;
    }

    public int getCritModifier() {
        return critModifier;
    }

    public void setCritModifier(int critModifier) {
        this.critModifier = critModifier;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
