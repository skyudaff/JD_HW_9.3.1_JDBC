-- changeset skyudaff:1
create table netology.customers
(
    id           serial primary key,
    name         varchar,
    surname      varchar,
    age          int,
    phone_number varchar
);
-- rollback drop table netology.customers;

-- changeset skyudaff:2
create table netology.orders
(
    id           serial primary key,
    date         date,
    customer_id  int references netology.customers (id),
    product_name varchar,
    amount       int
);
-- rollback drop table netology.orders;