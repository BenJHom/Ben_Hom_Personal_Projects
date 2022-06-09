package com.benHom.Pokemon;

import com.benHom.Battle;
import com.benHom.Moves.*;
import com.benHom.Types.Fighting;
import com.benHom.Types.None;
import com.benHom.Types.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machamp extends Pokemon{

    private final String name = "Machamp";
    private final Type typeOne = new Fighting();
    private final Type typeTwo = new None();
    private final int[] stats = {384, 394, 196, 149, 207, 146, 100, 1};
    private List<Move> machampMoves = new ArrayList<>();
    private int statusKey = 0;
    private final String shortDescription = "Machamp hurls punches with its four arms at an overwhelming rate to subdue opponents";
    private final String sound = "Chaa!";

    public Machamp(Battle battle){
        super("Machamp", new Fighting(), new None(), new int[]{383, 394, 196, 149, 207, 146, 100, 1}, new ArrayList<Move>(), "Machamp hurls punches with its four arms at overwhelming speed to subdue its opponents", "Chaa!", battle);
        this.addMovesToPokemon(new Rockslide(), new Bulletpunch(), new Knockoff(), new CloseCombat());
    }


}
