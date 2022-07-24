package com.benHom.Redundancy;

import com.benHom.Battle;
import com.benHom.Moves.*;
import com.benHom.Pokemon.Pokemon;
import com.benHom.Types.None;
import com.benHom.Types.Water;

import java.util.ArrayList;

public class Blastoise extends Pokemon {

    public Blastoise(Battle battle){
        super("Blastoise", new Water(), new None(), new int[]{362, 181, 236, 207, 339, 192, 100, 1}, new ArrayList<Move>(), "Its shell is impenetrable against attacks", "Pffsshh!", battle);
        this.addMovesToPokemon(new Protect(), new IceBeam(), new Surf(), new Thunderbolt());
    }


}