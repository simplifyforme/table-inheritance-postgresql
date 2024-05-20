create table if not exists products
(
    id  int not null,
    name_product varchar not null,
    price float not null,
    CONSTRAINT users_pkey PRIMARY KEY (id)
    );

create table if not exists books
(
    LIKE products INCLUDING INDEXES, --optional, used to inherit parent's indexes
    author varchar not null,
    isbn varchar not null
    ) INHERITS (products); --mandatory, creates the inheritance

create table if not exists electronics
(
    LIKE products INCLUDING INDEXES, --optional, used to inherit parent's indexes
    brand varchar not null,
    warranty integer not null
    ) INHERITS (products); --mandatory, creates the inheritance

CREATE SEQUENCE products_seq START 1 INCREMENT BY 50;