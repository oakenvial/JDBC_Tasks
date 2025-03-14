INSERT INTO MY_NEW_APP.CUSTOMERS
(NAME, SURNAME, AGE, PHONE_NUMBER)
VALUES ('Anna', 'Petrova', 20, '+79991234455'),
       ('Olga', 'Ivanova', 38, '+79008765554'),
       ('Alexey', 'Kozlov', 78, NULL),
       ('Alexey', 'Alekseev', 10, NULL),
       ('ALEXEY', NULL, 99, NULL);

INSERT INTO MY_NEW_APP.ORDERS
(DATE, CUSTOMER_ID, PRODUCT_NAME, AMOUNT)
VALUES (NULL, 1, 'Phone', 1),
       (NULL, 1, 'TV', 1),
       (NULL, 2, 'Table', 1),
       (NULL, 3, 'Chair', 2),
       (NULL, 4, 'Lamp', 1),
       (NULL, 5, 'Vase', 3),
       (NULL, 5, 'Laptop', 1),
       (NULL, 5, 'Mouse', 1);
