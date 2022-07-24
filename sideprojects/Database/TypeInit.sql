insert into type (name, weaknesses, resistances, immunities)
values ('bug', '7,8,16', '6,10,11', ''),
('dark', '1,5,6','2,9','15'),
('dragon','3,5,12','4,7,10,18',''),
('electric','11','4,8',''),
('fairy','14,17','1,2,6','3'),
('fighting','5,8,15','1,2,16',''),
('fire','11,16,18','2,7,10,12',''),
('flying','4,12,16','1,6,10','11'),
('ghost','2,9','1,14','6,13'),
('grass','1,7,8,12,14','4,10,11,18',''),
('ground','10,12,18','14,16','4'),
('ice','6,7,16,17','12',''),
('normal','6','','9'),
('poison','11,15','1,5,6,10,14',''),
('psychic','1,2,9','6,15',''),
('rock','6,10,11,17,18','7,8,13,14',''),
('steel','6,7,11','1,3,5,8,10,12,13,15,16,17','14'),
('water','4,10','7,12,17,18','');

select * from type;