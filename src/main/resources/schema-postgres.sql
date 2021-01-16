DROP TABLE IF EXISTS regions;
CREATE TABLE regions(id serial PRIMARY KEY, name VARCHAR(255), price integer);

DROP TABLE IF EXISTS products;
CREATE TABLE products(id serial PRIMARY Key, name VARCHAR(255), product_ids ....); // TODO : array