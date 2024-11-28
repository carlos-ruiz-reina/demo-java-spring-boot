INSERT INTO BRAND (ID, NAME) VALUES (1, 'ZARA');
INSERT INTO PRICELIST (ID, NAME) VALUES (1, 'TARIFA1');
INSERT INTO PRICELIST (ID, NAME) VALUES (2, 'TARIFA2');
INSERT INTO PRICELIST (ID, NAME) VALUES (3, 'TARIFA3');
INSERT INTO PRICELIST (ID, NAME) VALUES (4, 'TARIFA4');
INSERT INTO PRODUCT (ID, NAME) VALUES (35455, 'PRODUCTO35455');
INSERT INTO CURRENCY (ID, CODE, NAME) VALUES (1, 'EUR', 'Euro');
INSERT INTO PRICE (ID, BRANDID, START_DATE, END_DATE, PRICELISTID, PRODUCTID, PRIORITY, PRICE, CURRENCYID) VALUES (1, 1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 1);
INSERT INTO PRICE (ID, BRANDID, START_DATE, END_DATE, PRICELISTID, PRODUCTID, PRIORITY, PRICE, CURRENCYID) VALUES (2, 1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 1);
INSERT INTO PRICE (ID, BRANDID, START_DATE, END_DATE, PRICELISTID, PRODUCTID, PRIORITY, PRICE, CURRENCYID) VALUES (3, 1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 1);
INSERT INTO PRICE (ID, BRANDID, START_DATE, END_DATE, PRICELISTID, PRODUCTID, PRIORITY, PRICE, CURRENCYID) VALUES (4, 1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 1);