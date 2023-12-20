create table usuarios(

    id bigint not null auto_increment,
    firstName varchar(100) not null,
    lastName varchar(100) not null,
    email varchar(100) not null unique,
    password varchar(100) not null unique,
    dateofbirth varchar(100) not null,

    primary key(id)

);