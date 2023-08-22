create database zoo
use zoo

CREATE TABLE ANIMALS(
ANIMAL_ID INT identity(220104,1)PRIMARY KEY,
ANIMAL_NAME VARCHAR(50) NOT NULL,
SPECIES VARCHAR(50) NOT NULL,
GENDER VARCHAR(10) NOT NULL,
COUNTRY_OF_BIRTH VARCHAR(20) NOT NULL,
WEIGHT INT NOT NULL,
CELL_NO int  NULL FOREIGN KEY REFERENCES ENCLOSURE (CELL_NO),
)
insert into ANIMALS values('lion','Y','male','denmark',2,8)

SELECT *FROM ANIMALS

CREATE TABLE ENCLOSURE(
CELL_NO INT PRIMARY KEY,
EMPLOYEE_ID INT NULL,
TOTAL_ANIMAL INT NULL,
CELL_TYPE VARCHAR(20) NULL,
LOCATION VARCHAR(50)  NULL,
);

SELECT *FROM ENCLOSURE
INSERT INTO ENCLOSURE(CELL_NO,EMPLOYEE_ID,TOTAL_ANIMAL,CELL_TYPE,LOCATION)
VALUES(1204,12,5,'CYZ','ABC')
INSERT INTO ENCLOSURE(CELL_NO,EMPLOYEE_ID,TOTAL_ANIMAL,CELL_TYPE,LOCATION)
VALUES(1203,13,2,'ert','ABC')
DROP TABLE ANIMALS

DELETE FROM ANIMALS WHERE ANIMAL_ID=3;
SELECT  *FROM  ANIMALS  A   inner JOIN ENCLOSURE  E  ON  A.CELL_NO=E.CELL_NO

create  table emplo(
eid int identity(1,1) Primary Key,
username varchar(50),
password varchar(50)


)
insert into emplo values('mr.x','1234')

create table AnimF(

foodid int primary key,
species varchar(50),
quantity int,
food_name varchar(50),
feed_time time


)
Drop Table Vet

create table employe_info(


  emp_id int primary key,
  name varchar(50),
  address varchar(50),
  email  varchar(50),
  salary int,
  gender varchar(50),
  age int,
  hire_date date,
  joining_date date,

)
create table Animal_Medicine
(
  Med_Order_Id int identity(1,1) primary key,
  Animal_Id int foreign key references Animals(Animal_Id),
  Medicine_Brand varchar(50),
  Species_Med varchar(50),
  Med_Quantity int,
  Received_Date date
)
select * from Animal_Medicine
insert into Animal_Medicine values(1,'s','m',2,'2022-08-15')



create table Import
(
  Import_Id int identity(1,1) primary key,
  Animal_Id int foreign key references Animals(Animal_Id),
  Animal_Name varchar(50),
  Entry_ varchar(50),
  Import_Cost money,
  Age_During_Import int
)
select * from Import
insert into Import values(1,'X','Y','12,000',4)

create table Expense
(
  Expense_Id int identity(1,1) primary key,
  Food_Type_Id int foreign key references AnimF(foodid),
  Med_Order_Id int foreign key references Animal_Medicine(Med_Order_Id),
  Cleaning_Cost decimal
)
select * from Expense
insert into Expense values(1,1,2000)

create table Vet
(
  Vet_Id int identity(1,1) primary key,
  Emplyoee_Id int foreign key references employe_info(emp_id),
  Vet_Name varchar(50),
  Head_Vet varchar(50),
  Speciality varchar(50),
  Veternity_Experience varchar(50)
)
select * from Vet
insert into Vet values(1,'P','J','N','Noob')
create table Employee
(
  Emplyoee_Id int identity(1,1) primary key,
  Employee_Name varchar(50),
  Hire_Date date,
  Employee_Address varchar(50),
  phone_Number int,
  Gender varchar(50);
  Salary int,
  Age int
)
select * from ANIMALS
select animals.animal_id,animals.animal_name,animals.species,Animal_Medicine.Medicine_Brand,Animal_Medicine.Species_Med,AnimF.food_name,AnimF.feed_time from ANIMALS
inner join Animal_Medicine on animals.animal_id=Animal_Medicine.animal_id 
inner join Expense on Animal_Medicine.Med_Order_Id=Expense.Med_Order_Id 
inner join AnimF on AnimF.foodid=Expense.Food_Type_Id

Select EMPLOYEE_ID,sum(TOTAL_ANIMAL ) as Total_Animal from ENCLOSURE group by EMPLOYEE_ID 

