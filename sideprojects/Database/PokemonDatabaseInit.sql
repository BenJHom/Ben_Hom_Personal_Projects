Begin transaction;

create table type(
	type_id serial,
	name varchar(10) not null,
	weaknesses varchar (100) not null,
	resistances varchar (100) not null,
	immunities varchar (100) not null,
	
	constraint PK_type primary key (type_id)
);

create table stats(
	stats_id serial,
	hp int not null,
	attack int not null,
	defense int not null,
	special_attack int not null,
	special_defense int not null,
	speed int not null,
	
	constraint PK_stats primary key (stats_id)
);

create table effect(
	effect_id serial,
	name varchar(20) not null,
	description varchar (100) not null,
	
	constraint PK_effect primary key (effect_id)
);

create table move(
	move_id serial,
	type_id int not null,
	power int not null,
	accuracy int not null,
	effect_id int not null,
	effect_chance int not null,
	physical_attack boolean not null,
	status_move boolean not null,
	
	constraint PK_move primary key (move_id),
	constraint FK_move_type foreign key (type_id) references type (type_id),
	constraint FK_effect_id foreign key (effect_id) references effect (effect_id)
);

Create table pokemon (
	pokemon_id serial,
	name varchar(20) not null,
	type_id_one int not null,
	type_id_two int not null,
	stats_id int not null,
	move_id_one int not null,
	move_id_two int not null,
	move_id_three int not null,
	move_id_four int not null,
	short_description varchar(100) null,
	sound varchar (30) null,
	
	constraint PK_pokemon primary key (pokemon_id),
	constraint FK_pokemon_type_one foreign key (type_id_one) references type (type_id),
	constraint FK_pokemon_type_two foreign key (type_id_two) references type (type_id),
	constraint FK_pokemon_stats foreign key (stats_id) references stats(stats_id),
	constraint FK_pokemon_move_one foreign key (move_id_one) references move (move_id),
	constraint FK_pokemon_move_two foreign key (move_id_two) references move (move_id),
	constraint FK_pokemon_move_three foreign key (move_id_three) references move (move_id),
	constraint FK_pokemon_move_four foreign key (move_id_four) references move (move_id)
);

rollback;

commit;