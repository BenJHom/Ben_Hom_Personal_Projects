package com.benHom.Redundancy;

import com.benHom.Moves.Move;
import com.benHom.Types.Water;

public class Surf extends Move {
    public Surf() {
        super("Surf", new Water(), 90, 100, 0, 0, false, false);
    }
}
