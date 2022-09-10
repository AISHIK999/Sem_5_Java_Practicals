/*
Create a table named student with columns being roll, enrollment, branch, section. phone, marks
Then alter some parameters
*/

-- Create the schema
create table Student
(
    roll       int,
    enrollment int,
    branch     varchar(32),
    section    varchar(8),
    phone      int,
    marks      int
);

-- View the schema
desc Student;

-- Insert values into the table
-- Do not use double quotes for varchar
insert into Student
values (1, 12020009022001, 'CSE', 'A', 9876543210, 100);
insert into Student
values (2, 12020009022002, 'ECE', 'B', 1234567890, 99);
insert into Student
values (3, 12020009022003, 'ME', 'C', 1122334455, 98);

-- View the table
select *
from Student;

-- Create a new table called "Freshers" by using all data from  "Student" table
create table Freshers as
select *
from Student;

-- View the Freshers table
select *
from Freshers;

-- Create a new table called "Toppers" by using the "Branch" and "Marks" attributes from Student table
create table Toppers as
select branch, marks
from Student;

-- View the Toppers table
select *
from Toppers;

-- Change parameters of the branch attribute from the student table
alter table Student modify branch varchar (16);
-- branch can now store 16 characters

-- View the Student schema to verify if the change took place
desc Student;
