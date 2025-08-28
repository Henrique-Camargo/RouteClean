CREATE TABLE orders(
    id serial PRIMARY KEY,
    client_id BIGINT NOT NULL,
    entrega VARCHAR(50) NOT NULL,
    pagamento VARCHAR(50) NOT NULL,
    CONSTRAINT fk_orders_client FOREIGN KEY (client_id) REFERENCES client(id)

)