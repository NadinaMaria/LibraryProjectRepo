-- Create a keyspace
CREATE KEYSPACE IF NOT EXISTS library WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : '1' };

-- Create a table
CREATE TABLE IF NOT EXISTS library.users (
    userid int PRIMARY KEY,
    firstName VARCHAR,
    lastName VARCHAR,
    username VARCHAR,
    password VARCHAR
);

-- Insert some data
INSERT INTO library.users
(userid, firstName, lastName, username, password)
VALUES ('9878', 'John', 'Robinson', 'john1', 'blabla' );
INSERT INTO library.users
(userid, firstName, lastName, username, password)
VALUES ('9876', 'Ryan', 'Anderson', 'ryan1', 'blabla' );
INSERT INTO library.users
(userid, firstName, lastName, username, password)
VALUES ('9874', 'Ellen', 'Scott', 'ellen1', 'blabla' );
INSERT INTO library.users
(userid, firstName, lastName, username, password)
VALUES ('9873', 'Michelle', 'Obama', 'michelle1', 'blabla' );
INSERT INTO library.users
(userid, firstName, lastName, username, password)
VALUES ('9872', 'Sophie', 'Adam', 'sophie1', 'blabla' );