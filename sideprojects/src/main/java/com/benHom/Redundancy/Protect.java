package com.benHom.Redundancy;

import com.benHom.Moves.Move;
import com.benHom.Types.None;

public class Protect extends Move {

    public Protect(){
        super("Protect", new None(), 0, 100, 10, 100, false, true);
    }
}
