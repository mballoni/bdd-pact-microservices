DROP TABLE IF EXISTS offer;
CREATE TABLE offer (ID BIGINT GENERATED BY DEFAULT AS IDENTITY (START WITH 1), product_id BIGINT, shop_id BIGINT, shop_name VARCHAR(255), price INT, PRIMARY KEY (id));
