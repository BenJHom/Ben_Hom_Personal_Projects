package com.benHom.Dao;
import com.benHom.Moves.Move;
import com.benHom.Pokemon.Pokemon;
import com.benHom.Types.Type;
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
    List<Pokemon> fromDatabase = new ArrayList<>();

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
            fromDatabase.add(mapRowToPokemon(pokeQuery));
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return fromDatabase;
    }


    public List<Move> queryForAvailableMoves(){
    List<Move> fromDatabase = new ArrayList<>();

    String moveQuery = "SELECT * FROM move;";

    try{
        SqlRowSet moveRowSet = jdbcTemplate.queryForRowSet(moveQuery);
        while(moveRowSet.next()){
            fromDatabase.add(mapRowToMove(moveRowSet));
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    return fromDatabase;
    }


    public List<Type> queryForAvailableTypes(){
    List<Type> fromDatabase = new ArrayList<>();

    String typeQuery = "SELECT * FROM type;";

    try{
        SqlRowSet typeRowSet = jdbcTemplate.queryForRowSet(typeQuery);
        while(typeRowSet.next()){
            fromDatabase.add(mapRowToType(typeRowSet));
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    return fromDatabase;
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

    private Move mapRowToMove(SqlRowSet rowSet){
        Move move = new Move();

        move.setName(rowSet.getString("name"));
        move.setType(rowSet.getInt("type_id"));
        move.setPower(rowSet.getInt("power"));
        move.setAccuracy(rowSet.getInt("accuracy"));
        move.setPhysical(rowSet.getBoolean("physical_attack"));
        move.setStatus(rowSet.getBoolean("status_move"));
        move.setEffectKey(rowSet.getInt("effect_id"));
        move.setEffectChance(rowSet.getInt("effect_chance"));

        return move;
    }

    private Type mapRowToType(SqlRowSet rowSet) {
        Type type = new Type();
        String weaknesses = rowSet.getString("weaknesses");
        String resistances = rowSet.getString("resistances");
        String immunities = rowSet.getString("immunities");

        String[] weaknessArray = weaknesses.split(",");
        String[] resistanceArray = resistances.split(",");
        String[] immunityArray = immunities.split(",");

        for (int i = 0; i < weaknessArray.length; i++) {
            int id = Integer.parseInt(weaknessArray[i]);
            type.getWeaknesses().add(id);
        }

        for (int i = 0; i < resistanceArray.length; i++) {
            int id = Integer.parseInt(resistanceArray[i]);
            type.getResistances().add(id);
        }
        for (int i = 0; i < immunityArray.length; i++) {
            int id = Integer.parseInt(immunityArray[i]);
            type.getImmunities().add(id);
        }

        type.setName("name");

        return type;
    }
}
