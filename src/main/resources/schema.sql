CREATE TABLE IF NOT EXISTS game(
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    type VARCHAR(100) NOT NULL
);