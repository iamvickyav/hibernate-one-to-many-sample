insert into club (c_id, c_name) values (1, 'English Club');
insert into club (c_id, c_name) values (2, 'Kalam Science Club');
insert into club (c_id, c_name) values (3, 'Football Club');
insert into club (c_id, c_name) values (4, 'PV Sindhu Badminton Club');

insert into student (s_id, s_name, s_class) values (1, 'Vicky', 'CSE');
insert into student (s_id, s_name, s_class) values (2, 'Keerthu', 'ECE');
insert into student (s_id, s_name, s_class) values (3, 'Vijay', 'CSE');
insert into student (s_id, s_name, s_class) values (4, 'Anu', 'ECE');

insert into club_registry (reg_id, s_id, c_id) values (1, 1, 1);
insert into club_registry (reg_id, s_id, c_id) values (2, 1, 2);
insert into club_registry (reg_id, s_id, c_id) values (3, 2, 1);
insert into club_registry (reg_id, s_id, c_id) values (4, 2, 2);
insert into club_registry (reg_id, s_id, c_id) values (5, 2, 3);
insert into club_registry (reg_id, s_id, c_id) values (6, 2, 4);
insert into club_registry (reg_id, s_id, c_id) values (7, 4, 1);