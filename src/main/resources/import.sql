INSERT INTO role (name) VALUES ('ROLE_ADMIN');
INSERT INTO role (name) VALUES ('ROLE_USER');


INSERT INTO users (username, password, enabled, name, lastname, email) VALUES ('Jarvinson', '$2a$10$tWW5clI.DwkoY5yPM5tabO3TtU6qJ5U7oysuQpUbRx4XnB4d3VFIW', 1, 'Jarvinson', 'Valencia', 'jarvinsonv@gmail.com');
INSERT INTO users (username, password, enabled, name, lastname, email) VALUES ('Andrea', '$2a$10$ijrNswEYQ8M5QhzlaQelC.ioNO86W/WUUH4uYEjaxm/ZLW.7/fG2W', 1, 'Andrea', 'Hurtado', 'andrea@gmail.com');

INSERT INTO users_list_roles (list_users_id, list_roles_id) VALUES (1, 1);
INSERT INTO users_list_roles (list_users_id, list_roles_id) VALUES (2, 2);


INSERT INTO regiones (id, name) VALUES (1, 'Sudamérica');
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


