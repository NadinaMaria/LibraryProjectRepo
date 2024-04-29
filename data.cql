-- Create a keyspace
CREATE KEYSPACE IF NOT EXISTS library WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

-- Create a table
CREATE TABLE IF NOT EXISTS library.users (
    id INT PRIMARY KEY,
    username text,
    password text
);

-- Insert some data
INSERT INTO library.users
(id, username, password)
VALUES (999, 'JohnRobinson', 'john1');
INSERT INTO library.users
(id, username, password)
VALUES (888, 'RyanAnderson', 'ryan1');
INSERT INTO library.users
(id, username, password)
VALUES (777, 'BritAnderson', 'ryan1');


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
