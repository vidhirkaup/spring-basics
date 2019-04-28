-- CREATE TABLE person
-- (
--     id         integer      not null,
--     name       varchar(255) not null,
--     location   varchar(255),
--     birth_date timestamp,
--     primary key (id)
-- );

INSERT INTO person (id, name, location, birth_date) VALUES ( 10001, 'Alice', 'New York', sysdate );
INSERT INTO person (id, name, location, birth_date) VALUES ( 10002, 'Betty', 'Chicago', sysdate );
INSERT INTO person (id, name, location, birth_date) VALUES ( 10003, 'Charlie', 'Dallas', sysdate );
INSERT INTO person (id, name, location, birth_date) VALUES ( 10004, 'David', 'California', sysdate );
INSERT INTO person (id, name, location, birth_date) VALUES ( 10005, 'Edward', 'California', sysdate );
INSERT INTO person (id, name, location, birth_date) VALUES ( 10006, 'Edward', 'New Mexico', sysdate );

CREATE TABLE book(
    id integer not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);