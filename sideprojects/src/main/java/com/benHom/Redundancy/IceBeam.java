package com.benHom.Redundancy;

import com.benHom.Moves.Move;
import com.benHom.Types.Ice;

public class IceBeam extends Move {

    public IceBeam(){
        super("IceBeam", new Ice(), 90, 100, 5, 10, false, true);
    }
}
