/*
Create tables: Employee, Department, Department

*/
-- Create and view the Employee schema
create table Employee
(
    Employee_No   int NOT NULL,
    Employee_Name varchar(64),
    Salary        number(16),
    Age           number(8),
    Department_No varchar(8),
    Primary Key (Employee_No)
);
desc Employee;

-- Insert values in the Employe entity set
insert into Employee
values (1, 'Lorem Ipsum', 20000, 29, 101);
insert into Employee
values (2, 'John Doe', 25000, 30, 102);
insert into Employee
values (3, 'Iorem Lipsum', 30000, 32, 103);
insert into Employee
values (4, 'John Doe', 32000, 39, 104);
insert into Employee
values (5, 'Ram', 56000, 39, 104);
insert into Employee
values (6, 'Sita', 12999, 39, 104);
insert into Employee
values (7, 'Gita', 98989, 39, 104);
insert into Employee
values (8, 'Shyam', 12000, 39, 104);
select *
from Employee;

-- Create and view the Department schema
create table Department
(
    Department_No       varchar(16),
    Department_Name     varchar(32),
    Department_Location varchar(16)
);
desc Department;

-- Insert data into the Department entity set
insert into Department
values (101, 'RS', 'BLS');
insert into Department
values (102, 'ACCOUNT', 'BBSR');
insert into Department
values (103, 'HR', 'CTC');
select *
from Department;

-- Perfrom queries
select *
from Employee
where Department_No in (101, 102, 103);
select *
from Employee
where Age between 30 and 32;
select avg(Salary) As Salary_Average
from Employee
where Department_No = 101;
select Department_No as DNumber, avg(Salary) as Salary
from Employee
group by Department_No;

-- Create a table containinf information about each Department
Create table Department_Info
(
    Department_No       varchar(8),
    Manager_Employee_No number(16),
    Valuation           number(16),
    Primary Key (Department_No)
);
desc Department_Info;

-- Insert values in the department info table
insert into Department_Info
values (101, 1, 502472);
insert into Department_Info
values (102, 3, 6589748);
insert into Department_Info
values (103, 5, 57894568);
select *
from Department_Info;

-- Perfrom queries
select distinct Department.Department_Name,
                Department.Department_Location,
                Department_Info.Valuation,
                Department_Info.Manager_Employee_No
From Department
         Join Department_Info ON Department.Department_No = Department_Info.Department_No;

select distinct *
from Department
         join Department_Info on Department.Department_No = Department_Info.Department_No;
select distinct *
from Department
         Left Join Department_Info ON Department.Department_No = Department_Info.Department_No;
insert into Department_Info
values (105, 5, 111111);
select distinct *
from Department
         Join Department_Info ON Department.Department_No = Department_Info.Department_No;
select distinct *
from Department
         Right Join Department_Info ON Department.Department_No = Department_Info.Department_No;
select distinct *
from Department
         Full Outer Join Department_Info ON Department.Department_No = Department_Info.Department_No;
