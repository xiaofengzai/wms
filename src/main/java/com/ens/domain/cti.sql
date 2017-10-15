create table SYS_USER(
id int(11) primary key not null auto_increment,
username varchar(30) not null,
password varchar(40) not null
);

create table SYS_ROLE(
id int(11) primary key not null auto_increment,
name varchar(30) not null
);

create table SYS_ROLE_USER(
user_id int(11) not null ,
role_id int(11) not null
);

create table Sys_permission(
id int(11) primary key not null auto_increment,
name varchar(30) not null,
descritpion VARCHAR(50) not null,
url VARCHAR(30) not null,
pid int(11)
);


create table Sys_permission_role(
id int(11) primary key not null auto_increment,
permission_id int(11) not null ,
role_id int(11) not null
);









insert into SYS_USER (id,username, password) values (1,'admin', 'admin');
insert into SYS_USER (id,username, password) values (2,'abel', 'abel');

insert into SYS_ROLE(id,name) values(1,'ROLE_ADMIN');
insert into SYS_ROLE(id,name) values(2,'ROLE_USER');

insert into SYS_ROLE_USER(user_id,role_id) values(1,1);
insert into SYS_ROLE_USER(user_id,role_id) values(2,2);

BEGIN;
INSERT INTO `Sys_permission` VALUES ('1', 'ROLE_HOME', 'home', '/', null), ('2', 'ROLE_ADMIN', 'ABel', '/admin', null);
COMMIT;

BEGIN;
INSERT INTO `Sys_permission_role` VALUES ('1', '1', '1'), ('2', '1', '2'), ('3', '2', '1');
COMMIT;