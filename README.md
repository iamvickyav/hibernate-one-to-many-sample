# hibernate-one-to-many-sample

Sample project to demonstrate Hibernate One to Many relationship

We have three tables with two contains about students, clubs present in a college & a  seperate club registry table which maintains record of student enrollment to each club. There is a high chance that one student enrolls to more than one club. 

Here the student & club tables are kind of parent tables & club_registry has reference to both of them

```
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
```

Here is how this one to many relationship is mainatained in entity object


```
@Entity
@Table(name = "student")
class Student {

    ....

    @OneToMany(mappedBy="student")
    Set<ClubRegistry> clubs
}
```

```
@Entity
@Table(name = "club_registry")
class ClubRegistry {

    ....  

    @ManyToOne
    @JoinColumn(name="s_id")
    Student student
}
```
## Explanation

### Representing OneToMany relationship

`Student` class has `Set<ClubRegistry>` with annotation `@OneToMany(mappedBy="student")` to represent OneToMany relationship with `ClubRegistry` class

### Representing ManyToOne relationship

On the other hand, `ClubRegistry` class contains a reference to Student class with annotation  `@ManyToOne` & `@JoinColumn(name="s_id")`. 

**Note**: The Student object name in ClubRegistry & the mappedBy value in OneToMany annotation in Student class should match
