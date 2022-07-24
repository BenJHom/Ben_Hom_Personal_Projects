package com.benHom.Redundancy;

import com.benHom.Moves.Move;
import com.benHom.Types.Rock;

public class Rockslide extends Move {

    public Rockslide(){
        super("Rockslide", new Rock(), 75, 85, 8, 30, true, false);
    }
}