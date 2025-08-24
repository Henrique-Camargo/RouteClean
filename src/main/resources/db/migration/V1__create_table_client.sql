CREATE TABLE client(
    id serial PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    cep VARCHAR(500) NOT NULL,
    frete INTEGER
)