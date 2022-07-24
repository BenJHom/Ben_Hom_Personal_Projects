package com.benHom.Redundancy;

import com.benHom.Moves.Move;
import com.benHom.Types.Electric;

public class Thunderbolt extends Move {

    public Thunderbolt(){
        super("Thunderbolt", new Electric(), 90, 100, 2, 10, false, false);
    }
}
