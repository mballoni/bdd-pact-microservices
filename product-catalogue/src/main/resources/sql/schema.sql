DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS category;
CREATE TABLE category (id BIGINT GENERATED BY DEFAULT AS IDENTITY (START WITH 1), name VARCHAR(255), PRIMARY KEY (id));
CREATE TABLE product (id BIGINT GENERATED BY DEFAULT AS IDENTITY (START WITH 1), name VARCHAR(255), manufacturer VARCHAR(255), category_id BIGINT, PRIMARY KEY (id));
ALTER TABLE product ADD CONSTRAINT fk_product_category FOREIGN KEY (category_id) REFERENCES category;
