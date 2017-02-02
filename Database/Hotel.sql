create database Hotel
go
use Hotel

create table Payment
(
	PaymentID int identity primary key,
	PaymentTypeID int,
	ReceptionID int,
	PaymentAmount int,
	PaymentDate date default getdate(),
)

create table PaymentType
(
	PaymentTypeID int identity primary key,
	PaymentType varchar(20),
	PaymentTypeDesc varchar(200)
)

create table Reservation
(
	ReservationID int identity primary key,
	CustomerID int,
	ExpectedCheckinDate date,
	ExpectedCheckoutDate date,
	ExpectedRoom varchar(30),
	IsDeposit varchar(10),
	RoomTypeID int,
	ReservationStatus varchar(10)
)

create table Reception
(
	ReceptionID int identity primary key,
	CusGroupID int,
	Customer varchar(30),
	ReservationID int,
	RoomID int,
	CheckinDate date default getdate(),
	ExpectedCheckoutDate date,
	CheckOutDate date,
	_Services varchar(500),
	Foods varchar(500),
	Drinks varchar(500),
	ReceptionStatus varchar(10)
)

create table _Services
(
	ServiceID int identity primary key,
	ServiceName varchar(30),
	ServicePrice int,
	ServiceDesc varchar(200)
)

create table Food
(
	FoodID int identity primary key,
	FoodName varchar(30),
	FoodPrice int,
	FoodDesc varchar(200)
)

create table Drink
(
	DrinkID int identity primary key,
	DrinkName varchar(30),
	DrinkPrice int,
	DrinkDesc varchar(200)
)

create table Customer
(
	CustomerID int identity primary key,
	CusName varchar(30),
	GovernmentID varchar(20),
	CusAddress varchar(100),
	Phone varchar(15),
	Email varchar(30),
	LastVisited date,
	CCNumber varchar(20),
	CCExpiry date
)

create table Room
(
	RoomID int identity primary key,
	RoomNumber int,
	RoomTypeID int,
	RoomStatusID int,
	RoomDesc varchar(500)
)

create table RoomType
(
	RoomTypeID int identity primary key,
	RoomTypeName varchar(20),
	RoomTypeDesc varchar(200),
	RoomPrice int,
	NumBeds int
)

create table RoomStatus
(
	RoomStatusID int identity primary key,
	RoomStatusName varchar(20),
	RoomStatusDesc varchar(200)
)

create table Employee
(
	EmployeeID int identity primary key,
	EmployeeName varchar(30),
	Position varchar(20),
	DOB date,
	Contact varchar(20),
	JoinDate date
)

create table _Role
(
	RoleID int identity primary key,
	RoleName varchar(10),
	RoleDesc varchar(200)
)

create table _Account
(
	UserID int identity primary key,
	EmployeeID int,
	UserName varchar(20),
	_Password varchar(40),
	RoleID int,
)

alter table Payment
add constraint Pay_ReceptionID_FK foreign key (ReceptionID) references Reception (ReceptionID)

alter table Payment
add constraint Pay_PaymentTypeID_FK foreign key (PaymentTypeID) references PaymentType (PaymentTypeID)

alter table Reservation
add constraint Res_CustomerID_FK foreign key (CustomerID) references Customer (CustomerID)

alter table Reservation
add constraint Res_RoomTypeID_FK foreign key (RoomTypeID) references RoomType (RoomTypeID)

alter table Reception
add constraint RoMa_ReservationID_FK foreign key (ReservationID) references Reservation (ReservationID)

alter table Reception
add constraint RoMa_CusGroupID_FK foreign key (CusGroupID) references Customer (CustomerID)

alter table Reception
add constraint RoMa_RoomID_FK foreign key (RoomID) references Room (RoomID)

alter table Room
add constraint Ro_RoomTypeID_FK foreign key (RoomTypeID) references RoomType (RoomTypeID)

alter table Room
add constraint Ro_RoomStatusID_FK foreign key (RoomStatusID) references RoomStatus (RoomStatusID)

alter table _Account
add constraint Acc_RoleID_FK foreign key (RoleID) references _Role (RoleID)

alter table _Account
add constraint Acc_EmployeeID_FK foreign key (EmployeeID) references Employee (EmployeeID)

insert RoomType values ('Normal-1','Bed, Bathroom, TV, Phone',150,1),
('Normal-2','Bed, Bathroom, TV, Phone',150,2),
('VIP-1','Bed, Bathroom, TV-CAP, Phone, Refrigeration, Computer',300,1),
('VIP-2','Bed, Bathroom, TV-CAP, Phone, Refrigeration, Computer',300,2)
insert RoomStatus values ('available','Can reservation'),
('unavailable','Can not reservation'),
('reservation','Can not reservation')
insert PaymentType values ('Credit card', 'Payment by Credit Card'),
('Cash', 'Payment by Cash'), 
('Deposit','Deposit 30% compared with rental rate') 
insert _Role values ('Admin','Account as Admin'),('Staff','Account as Staff')
insert Customer values
('Jason Statham','345678111111','Shirebrook','0909091111','jason_statham@gmail.com','2014/09/01','552200000001','2020/10/10'),
('Dwayne Johnson','345678222222','Hayward','0909092222','dwayne@gmail.com','2014/09/01','552200000002','2020/10/10'),
('Vin Diesel','345678333333','New York','0909093333','vin_diesel@gmail.com','2014/09/01','552200000003','2020/10/10'),
('Michelle Rodriguez','345678444444','Texas','0909094444','michelle@gmail.com','2014/09/01','552200000004','2020/10/10'),
('Lucas Black','345678555555','Decatur','0909095555','lucas_black@gmail.com','2014/09/01','552200000005','2020/10/10'),
('Iggy Azalea','345678666666','Sydney','0909096666','iggy_azalea@gmail.com','2014/09/01','552200000006','2020/10/10'),
('Jordana Brewster','345678777777','Concord','0909097777','jordana@gmail.com','2014/09/01','552200000007','2020/10/10'),
('Ryan Tedder','345678888888','Oklahoma','0985111111','ryan_tedder@gmail.com','2014/09/01','552200000008','2025/04/25'),
('Zach Filkins','345678999999','Colorado','0985222222','zac_filkins@gmail.com','2014/09/05','552200000009','2025/04/25'),
('Eddie Fisher','345678000000','Colorado','0985333333','eddie_fisher@gmail.com','2014/09/05','552200000010','2025/04/25'),
('Brent Kutzle','345678111222','Colorado','0985555555','brent_kutzle@gmail.com','2014/09/05','552200000011','2025/04/25'),
('Justin Timberlake','345678111333','Tennessee','0985666666','justin_timberlake@gmail.com','2014/09/07','552200000012','2018/07/16'),
('Katy Perry','345678111444','California','0985777777','katy_perry@gmail.com','2014/09/04','552200000013','2019/11/21'),
('Lady Gaga','345678111555','Germanotta','0985888888','lady_gaga@gmail.com','2014/09/08','552200000014','2016/07/17'),
('Rihanna','345678111666','Barbados','0985999999','rihanna@gmail.com','2014/09/03','552200000015','2017/10/30'),
('Ariana Grande','345678111777','Boca Raton','0985000000','ariana@gmail.com','2014/09/01','552200000016','2020/10/10'),
('Adam Levine','345678111888','Los Angeles','0968111111','adam_levine@gmail.com','2014/09/08','552200000017','2016/08/20'),
('Jesse Carmichael','345678111999','California','0968222222','jesse_carmichael@gmail.com','2014/09/01','552200000018','2016/08/20'),
('Mickey Madden','345678111000','California','0968333333','mickey@gmail.com','2014/09/01','552200000019','2016/08/20'),
('James Valentine','345678222111','California','0968444444','james_valent@gmail.com','2014/09/08','552200000020','2016/08/20'),
('Matt Flynn','345678222444','California','0968555555','matt_flynn@gmail.com','2014/09/01','552200000021','2016/08/20'),
('PJ Morton','345678222666','California','0968666666','pj_morton@gmail.com','2014/09/01','552200000022','2016/08/20'),
('Adele','345678222888','Tottenham','0968777777','adele_grammy@gmail.com','2014/09/01','552200000023','2020/01/31'),
('Sam Smith','345678222000','Bishops Stortford','0968888888','sam_smith@gmail.com','2014/09/01','552200000024','2018/06/15'),
('Oliver Pettigrew','345678222333','British','0968999999','oliver_pettigrew@gmail.com','2014/08/20','552200000025','2025/12/31'),
('Mark Wahlberg','345678222555','Boston','0968000000','mark_wahlberg@gmail.com','2014/09/05','552200000026','2018/09/05'),
('Josh Duhamel','345678222777','Minot','0969999999','josh_duhamel','2014/09/05','552200000027','2018/09/05')

insert Employee values
('Josh Smith','CEO','1974/01/01','0909111111','1997/05/25'),
('Mary Hilton','CFO','1979/02/09','0909222222','1999/11/08'),
('Henry Scott','HRM','1982/11/25','0909333333','2001/01/23'),
('Ronney Mac Ryan','CMO','1986/06/17','0909444444','2005/09/11'),
('Janne Joshi','Reception','1991/09/07','0966111111','2009/11/04'),
('Jack Reddy','Reception','1984/11/26','0966222222','2006/06/15'),
('Adina Kamath','Reception','1988/03/24','0966333333','2013/03/07'),
('Brittany Karnik','Reception','1987/07/07','0966444444','2011/12/04'),
('Madison Joglekar','Reception','1988/09/24','0966555555','2012/03/28'),
('Samantha Karande','Reception','1999/09/09','0966666666','2009/11/09'),
('Ashley Kamboh','Reception','1986/11/23','0966777777','2009/03/19'),
('Lauren Shaha','Reception','1990/05/21','0966888888','2010/06/09'),
('Thomas Doshi','Security Guard','1988/06/11','0967111111','2011/12/01'),
('William','Security Guard','1985/11/09','0967222222','2009/09/14'),
('James Shetty','Security Guard','1988/04/25','0967333333','2009/11/06'),
('Luke Coner','Security Guard','1987/12/21','0967444444','2013/06/28'),
('Matthew Dubey','chef','1982/07/19','0968111111','1998/11/06'),
('Nicholas Nair','chef','1989/01/01','0968222222','2004/05/19'),
('Luke Kale','chef','1986/12/21','0968333333','2011/07/25'),
('Michael Rupnar','inspector','1987/05/11','0969111111','2012/02/01'),
('Nathan Patnaik','inspector','1990/09/03','0969222222','2010/06/08'),
('Nicole Mohite','Staff','1990/05/11','0969111111','2011/11/01'),
('Haley Patnaik','Staff','1991/11/07','0969222222','2012/02/25'),
('Sofia Masand','Staff','1987/02/18','0969333333','2008/01/31'),
('Sara Mahakali','Staff','1989/12/07','0969444444','2009/07/18')
insert _Account values (1,'admin','admin',1),
(2,'staff','staff',2)

insert Room values (101,2,1,'floor 1'),
(102,1,1,'floor 1'),
(103,1,1,'floor 1'),
(104,1,1,'floor 1'),
(105,1,1,'floor 1'),
(106,1,1,'floor 1'),
(107,1,1,'floor 1'),
(108,1,1,'floor 1'),
(109,1,1,'floor 1'),
(110,1,1,'floor 1'),
(201,2,1,'floor 2'),
(202,2,1,'floor 2'),
(203,2,1,'floor 2'),
(204,2,1,'floor 2'),
(205,2,1,'floor 2'),
(206,2,1,'floor 2'),
(207,2,1,'floor 2'),
(208,2,1,'floor 2'),
(209,2,1,'floor 2'),
(210,2,1,'floor 2'),
(301,3,1,'floor 3'),
(302,3,1,'floor 3'),
(303,3,1,'floor 3'),
(304,3,1,'floor 3'),
(305,3,1,'floor 3'),
(306,3,1,'floor 3'),
(307,3,1,'floor 3'),
(308,3,1,'floor 3'),
(309,3,1,'floor 3'),
(310,3,1,'floor 3'),
(401,3,1,'floor 4'),
(402,3,1,'floor 4'),
(403,3,1,'floor 4'),
(404,3,1,'floor 4'),
(405,3,1,'floor 4'),
(406,4,1,'floor 4'),
(407,4,1,'floor 4'),
(408,4,1,'floor 4'),
(409,4,1,'floor 4'),
(410,4,1,'floor 4'),
(501,4,1,'floor 5'),
(502,4,1,'floor 5'),
(503,4,1,'floor 5'),
(504,4,1,'floor 5'),
(505,4,1,'floor 5'),
(506,4,1,'floor 5'),
(507,4,1,'floor 5'),
(508,4,1,'floor 5'),
(509,4,1,'floor 5'),
(510,4,1,'floor 5')
insert Reservation values 
(1,'2014-08-14','2014-08-22', '1','true',1,'false'),
(2,'2014-08-15','2014-08-23', '4 5','false',1,'false'),
(3,'2014-08-16','2014-08-24', '11 12','true',2,'false'),
(4,'2014-12-17','2014-12-25', '13 ','false',2,'true'),
(5,'2014-12-18','2014-12-26', '21','true',3,'true'),
(6,'2014-12-19','2014-12-22', '24 25','false',3,'true'),
(7,'2014-09-05','2014-09-20', '31','true',3,'false'),
(8,'2014-09-10','2014-09-15', '36 37','false',4,'false'),
(9,'2014-09-07','2014-09-21', '43 44','true',4,'false'),
(10,'2014-12-23','2015-01-01', '45','false',4,'true')
insert Reception values 
(2,'1 2 3 4 5',2,4,default,'2014-08-15','2014-08-23', '1 3', '3 4 5','1 2','false'),
(2,'6 7 8 9',2,5,default,'2014-08-15','2014-08-23', '1 3', '3 4 5','1 2','false'),
(3,'10 11 12',3,11,default,'2014-08-16','2014-08-24', '1 3', '3 4 5','1 2','false'),
(3,'14 15',3,12,default,'2014-08-16','2014-08-24', '1 3', '3 4 5','1 2','false'),
(16,'16',1,13,default,'2014-09-01','2014-09-30', '1 3', '3 4 5','1 2','true'),
(17,'18 19',1,14,default,'2014-09-01','2014-09-30', '1 4', '1 2 5','2 3','true'),
(18,'20',7,15,default,'2014-09-05','2014-09-20', '1 3 4 5', '3 4 5','1 2','true'),
(19,'21 22',8,16,default,'2014-09-10','2014-09-15', '1 4', '1 2 5','2 3','true'),
(20,'23',9,17,default,'2014-09-07','2014-09-21', '1 3', '3 4 5','1 2','true'),
(21,'24 25',9,18,default,'2014-09-07','2014-09-21', '1 4', '1 2 5','2 3','true')
insert Payment values (1,1, 2001, default),
(2,2, 3003, default),
(2,3, 5002, default),
(1,4,6005, default)
insert _Services values ('Massage',100,'Help you feeling well'),
('GYM',300,'Give you a nice body'),
('Cleaning',200,'Help your room be clear'),
('Swimming',300,'Feeling the purified water combine with you'),
('Entertainment',170,'For you and your kid')
insert Food values ('Rice',10,'Fred Rice, Soup'),
('Noodle',20,'Noodle'),
('Chicken',30,'Kentucky Fred Chicken, Soup'),
('Duck',30,'Roasted Duck Beijing'),
('Pig',50,'Roasted Milk Pig')
insert Drink values ('Coke',2,'Cocacola'),
('Beer',2,'Tiger, Saigon, 333, Zorok'),
('Alcohol',2,'Wine, Whiskey, Cherry, Vodka, Vermouth'),
('Aquafina',1,'Purified')

select * from _Account
select * from _Services
select * from _Role
select * from Customer
select * from Drink
select * from Food
select * from Payment
select * from PaymentType
select * from Reception
select * from Reservation
select * from Room
select * from RoomStatus
select * from RoomType
