DROP DATABASE truyenTranh
go
CREATE DATABASE truyenTranh
GO
USE truyenTranh
GO
CREATE TABLE tacGia(
	id INT IDENTITY(1,1) PRIMARY KEY,
	name NVARCHAR(50) NOT NULL,
	email NVARCHAR(200) NOT NULL
)
go
CREATE TABLE users(
	id INT IDENTITY(1,1) PRIMARY KEY,
	username NVARCHAR(50) UNIQUE NOT NULL,
	passwords NVARCHAR(50) NOT NULL,
	roles BIT NOT NULL DEFAULT 0,
)
go
CREATE TABLE theLoai(
	id INT IDENTITY(1,1) PRIMARY KEY,
	name NVARCHAR(100) NOT NULL,	
)
ALTER TABLE dbo.theLoai 
ADD UNIQUE(name)
go
CREATE TABLE truyenTranh(
	id INT IDENTITY(1,1) PRIMARY KEY,
	tacGia_id INT NOT NULL,
	name NVARCHAR(200) NOT NULL,
	trangThai bit NOT NULL, -- 0 : hoan thanh 1: dang cap nhat
	hinh NVARCHAR(100),
	gioiThieu nvarchar(200),
	CONSTRAINT fk_tg_truyen FOREIGN KEY(tacGia_id) REFERENCES dbo.tacGia(id)
)
go
CREATE TABLE lichSu(
	id INT IDENTITY(1,1) PRIMARY KEY,
	truyen_id INT NOT NULL,
	FOREIGN KEY(truyen_id) REFERENCES dbo.truyenTranh(id)
)

go
CREATE TABLE chuong(
	id INT IDENTITY(1,1) PRIMARY KEY,
	truyen_id INT NOT NULL,
	filePDF TEXT NOT NULL,
	name NVARCHAR(200) NOT NULL,
	FOREIGN KEY(truyen_id) REFERENCES dbo.truyenTranh(id)
)
go
CREATE TABLE chiTietTruyen(
	id INT IDENTITY(1,1) PRIMARY KEY,
	truyen_id INT NOT NULL,
	theLoai_id INT NOT NULL,
	FOREIGN KEY(truyen_id) REFERENCES dbo.truyenTranh(id),
	FOREIGN KEY(theLoai_id) REFERENCES dbo.theLoai(id)
)
go
CREATE TABLE theoDoi(
	id INT IDENTITY(1,1) PRIMARY KEY,
	users_id INT NOT NULL,
	truyen_id INT NOT NULL,
	FOREIGN KEY(truyen_id) REFERENCES dbo.truyenTranh(id),
	FOREIGN KEY(users_id) REFERENCES dbo.users(id)
)
go
CREATE TABLE binhLuan(
	id INT IDENTITY(1,1) PRIMARY KEY,
	users_id INT NOT NULL,
	truyen_id INT NOT NULL,
	FOREIGN KEY(truyen_id) REFERENCES dbo.truyenTranh(id),
	FOREIGN KEY(users_id) REFERENCES dbo.users(id)
)
CREATE TABLE views(
	id INT IDENTITY(1,1) PRIMARY KEY,
	truyen_id INT NOT NULL,
	countviews INT NOT NULL,
	FOREIGN KEY(truyen_id) REFERENCES dbo.truyenTranh(id)
)
INSERT INTO users
VALUES('NV001','12345',1),
	('NV002','12345',1),
	('abc123','12345',0)
	ALTER TABLE dbo.chuong
	ALTER COLUMN filePDF NTEXT NOT NULL
