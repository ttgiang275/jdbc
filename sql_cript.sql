CREATE DATABASE demo;
USE demo;


CREATE TABLE student (
    sid INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(50),
    marks INT,
);

INSERT INTO student (name, marks)  
VALUES  
('John Doe', 85),  
('Jane Smith', 92),  
('Alice Johnson', 78),  
('Bob Williams', 88);