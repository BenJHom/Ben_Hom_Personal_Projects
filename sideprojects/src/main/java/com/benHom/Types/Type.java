package com.benHom.Types;

import java.util.List;

public interface Type {

    List<Type> getWeakness();

    List<Type> getResistance();

    List<Type> getImmunity();

    String getName();
}
