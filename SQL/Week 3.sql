/*
Create a table Employee with attributes: Employee number, Employee Name, Salary, Age, Department number
Create a table Department with attributes: Department number, anme and location 
Change and Search for specific values within the Table
*/

-- Create and view the schema for the Employee table
create table Employee
(
    Employee_No   varchar(16),
    Employee_Name varchar(64),
    Salary        number(16),
    Age           number(8),
    Department_No varchar(8)
);
desc Employee;

-- Insert values in the Employee table 
insert into Employee
values (1, 'John Doe', 20000, 29, 101);
insert into Employee
values (2, 'John Doe', 25000, 30, 102);
insert into Employee
values (3, 'Lorem Ipsum', 30000, 32, 103);
insert into Employee
values (4, 'Don John', 32000, 39, 104);
insert into Employee
values (5, 'Iorem Lipsum', 23987, 33, 104);
-- In the next two entities, the salaries are 0 and NULL respectively. Note that 0 != NULL. We will work on these later
insert into Employee
values (6, 'Fname Lname', 0, 39, 104);
insert into Employee
values (7, 'Lname Fname', NULL, 99, 104);
select *
from Employee;

-- Design snd view the Department schema
create table Department
(
    Department_No       varchar(20),
    Department_Name     varchar(20),
    Department_Location number(10) -- The department location is designated by a number
);
desc Department;

-- Let us say we want to assign department names as Strings instead of numbers
alter table Department modify Department_Location varchar (10); -- Modify the attribute from number to varchar
desc Department;

-- Assign values to the department table
insert into Department
values ('101', 'R&D', 'BLS');
insert into Department
values ('121', 'ACCOUNT', 'BBSR');
insert into Department
values ('112', 'HR', 'CTC');

-- To check null values
select *
from Employee
where Salary is NULL;

-- To change a parameter 
update Employee
set Employee_Name='John Tron'
where Employee_No = 4;
select *
from Employee;
update Employee
set Salary=9999
where Age = 39;
select *
from Employee;

-- EXECUTE ORDER 66 (Delete the Employee table)
Delete
from Employee;

-- After deletion, we will see that the entities of the entity set "Employee" has been removed. But the schema is still intact
select *
from Employee; -- no data found
desc Employee;              -- Schema intact
 
-- Mathematical operations on the values of Salary
Select Min(Salary)
from Employee; -- Minimum of all salaries in the table. It will show 0 amd not NULL for the 7 employee, as NULL means the absence of a value, whereas 0 implies no salary, but is still considered as a value
Select Sum(Salary)
from Employee; -- Returns the sum of all values in the salary column
Select Avg(Salary)
from Employee;
-- Returns the average of the total salary in the table. Sum(Salary)/Count(Employee_No) from Employee

-- Select am entity with a specific Name
/*
_ denotes a single character
% denotes a group of characters 
We can use these two keywords to explain any varchar e.g.,
__ is a varchar with 2 characters
__% is a varchar with atleast 2 characters and so on...
*/

Select *
from Employee
where Employee_Name like 'J%'; -- Employee name that starts with J
Select *
from Employee
where Employee_Name like '%n'; -- Employee name that ends with n
Select *
from Employee
where Employee_Name like '%i%'; -- Employee name that has i somewhere inside it
Select *
from Employee
where Employee_Name like '_o%'; -- Employee name that has o in the second position
Select *
from Employee
where Employee_Name like 'J_%'; -- Employee name that starts with J and is atleast 2 characters in length
Select *
from Employee
where Employee_Name like 'L%m'; -- Employee name that starts with L and ends with m
