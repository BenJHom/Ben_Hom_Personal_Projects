package com.benHom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class Pokemon {
    private String name;
    private Map type;
    //[hp, atk, def, spatk, spdef, spd, acc, crit]
    private int[] stats;
    private List moves;
    private String shortDescription;

    public Pokemon (String name, Map type, int[] stats, List moves, String shortDescription){
        this.name = name;
        this.type = type;
        this.stats = stats;
        this.moves = moves;
        this.shortDescription = shortDescription;
    }
}
