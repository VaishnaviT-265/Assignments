/-- Create database assignment 
create database assignment;
use assignment;

/--  ****** CRUD operations ********
/-- Create table customer & add data validation
create table customer ( 
	id integer primary key auto_increment,
    first_Name varchar(40) NOT NULL,
    last_Name varchar(40) NOT NULL,
    phone varchar(15) unique,
    email varchar(40) not null unique,
    address text
);

/-- Insert data 
insert into customer values(1,'Vaishnavi','Teke', '9175930316','vaishnavisteke@gmail.com', 'Pune');
insert into customer values(2,'Vrushali', 'Patil', '7038218671','vrushali123@gmail.com', 'Mumbai');
insert into customer values(3, 'Divya', 'Rathod', '9047832591','divyarathod253@gmail.com','Pune');

/-- Read data 
select * from customer;

/-- Update data
update customer set phone ="9824751986" where id = 3;

/-- Delete data
delete from customer where id = 2;

/-- create index
create index customer_id on customer(id);

select * from customer where id = 1;
drop table customer;
drop database assignment;