CREATE TABLE IF NOT EXISTS users
(
    username VARCHAR(200) NOT NULL,
    balance BIGINT NOT NULL,
    email VARCHAR(254),
    password VARCHAR(254),
    location VARCHAR(254),
    finger_amount INT
);