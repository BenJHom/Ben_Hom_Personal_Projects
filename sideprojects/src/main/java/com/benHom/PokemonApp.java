package com.benHom;

import com.benHom.Pokemon.Blastoise;
import com.benHom.Pokemon.Machamp;

public class PokemonApp {
    public static void main(String[] args) {
        //Initialize a battle and all the pokemon you want to make available in this format
        Battle battle = new Battle();
        Machamp Machamp = new Machamp(battle);
        Blastoise Blastoise = new Blastoise(battle);

        //Start the battle once you have added the pokemon you want
        battle.startBattle();
    }
}
