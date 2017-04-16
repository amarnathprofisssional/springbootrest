port:3306

mysql database main credentials: root/root

create database::

CREATE DATABASE TEST;

use the database::
use test;

create a new user::
CREATE USER 'amar'@'localhost' IDENTIFIED BY 'password';

grant all privilages to user::
GRANT ALL PRIVILEGES ON * . * TO 'amar'@'localhost';

to get list of tables
SHOW TABLES;

create table userlist(username varchar(20),password varchar(20),userid varchar(40));


insert into userlist values ('sai','pass123','2345');
insert into userlist values ('raj','pass234','2346');
insert into userlist values ('prakash','pass345','2347');

select * from userlist;

remove data from table userlist::

delete from userlist;
