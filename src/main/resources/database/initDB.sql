CREATE TABLE IF NOT EXISTS users
(
    username VARCHAR(200) NOT NULL,
    email VARCHAR(254),
    password VARCHAR(254),
    location VARCHAR(254),
    balance BIGINT NOT NULL
);