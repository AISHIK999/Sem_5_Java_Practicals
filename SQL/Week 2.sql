/*
Create two tables named Student and Department
Add the columns: enrollment, roll, name in Student and Department Name, Year in the Department table
Add the number of subjects as an attribute in the Department table
Print the names, count the number of entries and use "and", "or" operations
*/

-- Create Student table and view schema
create table Student
(
    Enrollment int,
    Roll       int,
    Name       varchar(64)
);
desc Student;

-- Create Department table and view schema
create table Department
(
    Department_Name varchar(16),
    Study_Year      varchar(8)
);
desc Department;

-- Insert data in the Student table
insert into Student
values (12020009022100, 1, 'John Doe');
insert into Student
values (12020009022002, 2, 'Dohn Joe');
insert into Student
values (12020009022003, 3, 'Lorem Ipsum');

-- Insert the 'Number of Subjects' attrtibute in the Department table and view the new schema
alter table Department
    add Subject_No int;
desc Department;

-- Insert data in the Department table
insert into Department
values ('CSE', '1st', 6);
insert into Department
values ('ECE', '2nd', 4);
insert into Department
values ('EEE', '2nd', 7);

-- View both the tables
select *
from Student;
select *
from Department;

-- Use the count and order functions
select Department_Name, Subject_No
from Department; -- Select the attributes "Department_Name" and "Subject_No" from the Department table
select Department_Name
from Department
where Subject_No > 5; -- Selct the attribute "Department_Name" where the nunber of subjects is more than 5
select count(Department_Name)
from Department; -- Return the numbers of Department Name instances in the Department table
select count(Distinct Study_Year)
from Department; -- Return the numbers of unique values of Department Name instances in the Department table
select *
from Student
order by Roll desc;
-- Return the Student table in an ordered fashion of descending Roll number

-- Use and/or operations
select Enrollment, Roll
from Student
where Roll > 1
  and Enrollment >= 12020009022002; -- Return the enrollment and roll numbers of entities of the Student database that falls within "both" the specific parameters
select Enrollment, Roll
from Student
where Roll > 1
   or Enrollment < 12020009022003; -- Return the enrollment and roll numbers of entities of the Student database that falls within "one of" the specific parameters
