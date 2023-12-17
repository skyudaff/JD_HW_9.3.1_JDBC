insert into netology.CUSTOMERS (name, surname, age, phone_number)
values ('Ivan', 'Ivanov', 28, '5550055'),
       ('Peter', 'Petrov', 20, '7771111'),
       ('Sidor', 'Sidorov', 30, '7771100'),
       ('Katya', 'Petrova', 27, '3371111');

insert into netology.ORDERS (customer_id, product_name, amount)
values (1, 'moloko', 3),
       (5, 'vodka', 6),
       (1, 'kheb', 1),
       (6, 'stakan', 3);
