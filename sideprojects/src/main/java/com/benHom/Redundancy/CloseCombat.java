package com.benHom.Redundancy;

import com.benHom.Moves.Move;
import com.benHom.Types.Fighting;

public class CloseCombat extends Move {
    public CloseCombat(){
        super("Close Combat", new Fighting(), 120, 100, 18, 100, true, false);
    }
}
