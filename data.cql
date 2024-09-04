-- Create a keyspace
CREATE KEYSPACE IF NOT EXISTS library WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

-- Create a table
CREATE TABLE IF NOT EXISTS library.users (
    id INT PRIMARY KEY,
    username text,
    password text,
    roleID INT
);

CREATE TABLE IF NOT EXISTS library.role (
    id INT PRIMARY KEY,
    name text
);

INSERT INTO library.role
(id, name)
VALUES (1, 'ADMIN');
INSERT INTO library.role
(id, name)
VALUES (2, 'USER');


-- Insert some data
INSERT INTO library.users
(id, username, password, roleID)
VALUES (999, 'JohnRobinson', 'john1', 1);
INSERT INTO library.users
(id, username, password, roleID)
VALUES (888, 'RyanAnderson', 'ryan1', 1);
INSERT INTO library.users
(id, username, password, roleID)
VALUES (777, 'BritAnderson', 'ryan1', 1);


CREATE TABLE IF NOT EXISTS library.books (
    id INT PRIMARY KEY,
    title text
);

INSERT INTO library.books
(id, title)
VALUES (100, 'Dune');
INSERT INTO library.books
(id, title)
VALUES (101, 'Prisoners');
INSERT INTO library.books
(id, title)
VALUES (102, 'Changes');
