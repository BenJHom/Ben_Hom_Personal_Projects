package com.benHom;


import com.benHom.Dao.PokemonInitializerDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class PokemonApp {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //Initialize a battle and all the pokemon you want to make available in this format
        PokemonInitializerDao pokemonInitializerDao = new PokemonInitializerDao( , jdbcTemplate);
        Battle battle = new Battle();
        battle.addAvailablePokemon(pokemonInitializerDao.queryForPokemonFromDatabase());

        //Start the battle once you have added the pokemon you want
        battle.startBattle();
    }

}
