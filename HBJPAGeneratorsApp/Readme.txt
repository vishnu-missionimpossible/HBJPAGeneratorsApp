#GeneratorApp

Generators in hibernate
===================
MySQL => primary key value where the generation of these values are made
automatic.
While creating a table, we can inform hibernate to create a columns with primary
key value using @Id.
It is also possible to set the values to these primary key columns using Generators
in hibernate.
There are 3 types of generators in hibernate
a. Hibernate supplied generators
b. JPA generators
c. Custom generators


Hibernate supplied generators
=========================
a. assigned
b. increment
c. identity
d. sequence
e. hilo
f. seqhilo
g. native
h. foreign
i. select
j. uuid
h. guid

assigned
=======
If we use this algorithm then explicitly we need to specify the primary key
value to the table.
assigned => org.hibernate.id.Assigned

It works with all databases as we need to give the primary key value.
@Id
@Column(name = "eid")
@GenericGenerator(name="gen1",strategy = "assigned")
@GeneratedValue(generator = "gen1")
private Integer empId;

increment
=========
It uses max(value) + 1 to generate the primary key value which is of int type
Works with all Database.
If dbTable is empty it will generate 1 as the identity value.
increment => org.hibernate.id.IncrementGenerator
@Id
@Column(name = "eid")
@GenericGenerator(name="gen1",strategy = "increment")
@GeneratedValue(generator = "gen1")
private Integer empId;