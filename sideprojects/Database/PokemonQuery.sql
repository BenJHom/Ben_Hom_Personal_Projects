--SELECT INDIVIDUAL POKEMON WITH MOVES
select p.name, p.type_id_one as type_one, p.type_id_two type_two, hp, attack, defense, special_attack, special_defense, speed,
m1.name as move1, m2.name as move2, m3.name as move3, m4.name as move4,
short_description, sound from pokemon as p
join move as m1 on m1.move_id = p.move_id_one
join move as m2 on m2.move_id = p.move_id_two
join move as m3 on m3.move_id = p.move_id_three
join move as m4 on m4.move_id = p.move_id_four;

select * from move;

select * from pokemon;