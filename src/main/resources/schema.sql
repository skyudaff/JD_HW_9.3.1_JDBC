create schema if not exists netology;

create table if not exists netology.CUSTOMERS
(
    id           serial primary key,
    name         varchar,
    surname      varchar,
    age          int,
    phone_number varchar
);

create table if not exists netology.ORDERS
(
    id           serial primary key,
    date         date default now(),
    customer_id  int references netology.CUSTOMERS (id),
    product_name varchar,
    amount       int
);