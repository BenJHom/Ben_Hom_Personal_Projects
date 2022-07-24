--DELETE ALL FROM POKEMON TABLE BEFORE RUNNING THIS SCRIPT

insert into pokemon (name,type_id_one,type_id_two,hp,attack,defense,special_attack,special_defense,speed,move_id_one,move_id_two,move_id_three,move_id_four,short_description,sound)
values ('Machamp',6,19, 384, 394, 196, 149, 207, 146, 10, 12, 15, 16, 
	   'Machamp hurls punches with its four arms at an overwhelming rate to subdue opponents', 'Chaa!'),
	   ('Blastoise', 18, 19, 362, 181, 236, 207, 339, 192, 11, 13, 17, 18,
	   'Its shell is impenetrable against attacks', 'Pffsshh!');