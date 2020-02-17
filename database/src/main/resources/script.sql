CREATE DATABASE guestbook;

CREATE SCHEMA guestbook_storage;

SET SEARCH_PATH = guestbook_storage;

CREATE TABLE guestbook (
    id   SERIAL PRIMARY KEY,
    name CHARACTER VARYING(64),
    text CHARACTER VARYING(512)
);

INSERT INTO guestbook (name, text)
VALUES ('Name1', 'Test message 1'),
       ('Name2', 'Test message 2'),
       ('Name3', 'Test message 3');
