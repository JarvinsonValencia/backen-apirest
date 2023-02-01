INSERT INTO role (name) VALUES ('ROLE_ADMIN');
INSERT INTO role (name) VALUES ('ROLE_USER');


INSERT INTO users (username, password, enabled, name, lastname, email) VALUES ('jarvinson', '$2a$10$1x88Qul1dspI7dXhKPs4HORjB4kI2462Rg1FG4AjkBx5LrMbkWyE2', 1, 'Jarvinson', 'Valencia', 'jarvinsonv@gmail.com');
INSERT INTO users (username, password, enabled, name, lastname, email) VALUES ('andrea', '$2a$10$ijrNswEYQ8M5QhzlaQelC.ioNO86W/WUUH4uYEjaxm/ZLW.7/fG2W', 1, 'Andrea', 'Hurtado', 'andrea@gmail.com');

INSERT INTO users_list_roles (list_users_id, list_roles_id) VALUES (1, 1);
INSERT INTO users_list_roles (list_users_id, list_roles_id) VALUES (1, 2);
INSERT INTO users_list_roles (list_users_id, list_roles_id) VALUES (2, 2);


INSERT INTO regiones (id, name) VALUES (1, 'Sudam�rica');
INSERT INTO regiones (id, name) VALUES (2, 'Europa');
INSERT INTO regiones (id, name) VALUES (3, 'Asia');

INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01', 1);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02', 2);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03', 3);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04', 1);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01', 2);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10', 3);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18', 1);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28', 2);
INSERT INTO client (name, lastname, email, create_at, region_id) VALUES('Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03', 3);

insert into product (name, price, create_at) values ('Tea - Earl Grey', '540', NOW());
insert into product (name, price, create_at) values ('Wine - Magnotta - Cab Franc', '643', NOW());
insert into product (name, price, create_at) values ('Quail - Eggs, Fresh', '742', NOW());
insert into product (name, price, create_at) values ('Glass Clear 8 Oz', '862', NOW());
insert into product (name, price, create_at) values ('Bread - 10 Grain', '186', NOW());
insert into product (name, price, create_at) values ('Bread - Rosemary Focaccia', '692', NOW());
insert into product (name, price, create_at) values ('Oats Large Flake', '036', NOW());
insert into product (name, price, create_at) values ('Amaretto', '777', NOW());
insert into product (name, price, create_at) values ('Fish - Halibut, Cold Smoked', '397', NOW());
insert into product (name, price, create_at) values ('Yogurt - Blueberry, 175 Gr', '542', NOW());
insert into product (name, price, create_at) values ('Beef - Ox Tongue', '711', NOW());
insert into product (name, price, create_at) values ('Garlic Powder', '939', NOW());
insert into product (name, price, create_at) values ('Chips - Miss Vickies', '963', NOW());
insert into product (name, price, create_at) values ('Langers - Mango Nectar', '386', NOW());
insert into product (name, price, create_at) values ('Pepper - Cubanelle', '932', NOW());
insert into product (name, price, create_at) values ('Fireball Whisky', '946', NOW());
insert into product (name, price, create_at) values ('Beer - Maudite', '698', NOW());
insert into product (name, price, create_at) values ('Bread - Rolls, Corn', '208', NOW());

INSERT INTO factura (description, observation, client_id, create_at) VALUES ('Factura Tea', null, 1, NOW());
INSERT INTO item_factura (amount, factura_id, product_id) VALUES (1, 1, 1);
INSERT INTO item_factura (amount, factura_id, product_id) VALUES (2, 1, 2);
INSERT INTO item_factura (amount, factura_id, product_id) VALUES (3, 1, 3);


