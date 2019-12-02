create table student (
	s_id int PRIMARY KEY AUTO_INCREMENT,
	s_name varchar(20) NOT NULL,
	s_class varchar(20)
);

create table club (
	c_id int PRIMARY KEY AUTO_INCREMENT,
    c_name varchar(40) NOT NULL
);

create table club_registry (
	reg_id int PRIMARY KEY AUTO_INCREMENT,
    s_id int,
    c_id int,
    FOREIGN KEY (s_id) REFERENCES student(s_id),
    FOREIGN KEY (c_id) REFERENCES club(c_id)
);