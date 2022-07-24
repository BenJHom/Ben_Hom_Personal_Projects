package com.benHom.Dao;
import com.benHom.Pokemon.Pokemon;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


public class PokemonInitializerDao {
JdbcTemplate jdbcTemplate = new JdbcTemplate();

public PokemonInitializerDao(DataSource database, JdbcTemplate jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;}


    public List<Pokemon> queryForPokemonFromDatabase(){
    String sqlForPokemonAndMoves = "select p.name, p.type_id_one as type_one, p.type_id_two type_two, hp, attack, defense, special_attack, special_defense, speed,\n" +
            "m1.name as move1, m2.name as move2, m3.name as move3, m4.name as move4,\n" +
            "short_description, sound from pokemon as p\n" +
            "join move as m1 on m1.move_id = p.move_id_one\n" +
            "join move as m2 on m2.move_id = p.move_id_two\n" +
            "join move as m3 on m3.move_id = p.move_id_three\n" +
            "join move as m4 on m4.move_id = p.move_id_four;";

    try{
        SqlRowSet pokeQuery = jdbcTemplate.queryForRowSet(sqlForPokemonAndMoves);
        while(pokeQuery.next()){
            mapRowToPokemon(pokeQuery);
        }
    }catch(Exception e){
        e.printStackTrace();
    }

    return new ArrayList<>();
    }

    private Pokemon mapRowToPokemon(SqlRowSet rowSet) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(rowSet.getString("name"));
        pokemon.setTypeOne(rowSet.getInt("type_one"));
        pokemon.setTypeTwo(rowSet.getInt("type_two"));
        pokemon.getMoves().add(rowSet.getInt("move1"));
        pokemon.getMoves().add(rowSet.getInt("move2"));
        pokemon.getMoves().add(rowSet.getInt("move3"));
        pokemon.getMoves().add(rowSet.getInt("move4"));
        pokemon.getStats()[0] = rowSet.getInt("hp");
        pokemon.getStats()[1] = rowSet.getInt("attack");
        pokemon.getStats()[2] = rowSet.getInt("defense");
        pokemon.getStats()[3] = rowSet.getInt("special_attack");
        pokemon.getStats()[4] = rowSet.getInt("special_defense");
        pokemon.getStats()[5] = rowSet.getInt("speed");
        return new Pokemon();
    }

}
