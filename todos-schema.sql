CREATE DATABASE TodoDB;
GRANT ALL PRIVILEGES ON TodoDB.* TO todouser;
USE TodoDB;
CREATE TABLE todos (
   id INT AUTO_INCREMENT PRIMARY KEY,
   description TEXT NOT NULL,
   completed BOOLEAN NOT NULL DEFAULT FALSE,
   due_date DATE,
   priority INT NOT NULL DEFAULT 0
);