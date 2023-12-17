-- changeset skyudaff:3
insert into netology.customers (name, surname, age, phone_number)
values ('Ivan', 'Ivanov', 28, '5550055'),
       ('Peter', 'Petrov', 20, '7771111'),
       ('Sidor', 'Sidorov', 30, '7771100'),
       ('Katya', 'Petrova', 27, '3371111');

-- changeset skyudaff:4
insert into netology.orders (date, customer_id, product_name, amount)
values ('2023-12-17', 1, 'moloko', 3),
       ('2023-12-17', 3, 'vodka', 6),
       ('2023-12-17', 1, 'kheb', 1),
       ('2023-12-17', 2, 'stakan', 3);
