CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
	description VARCHAR(255),
	isbn VARCHAR(20) UNIQUE,
    price DECIMAL(10,2),
    author VARCHAR(255) NOT NULL,
    release_date DATE,
    category VARCHAR(100),
    rating INTEGER CHECK (rating BETWEEN 1 AND 5),
    visibility BOOLEAN DEFAULT TRUE,
    format VARCHAR(50),
    stock INTEGER,
    image TEXT,
    created_by VARCHAR(100),
    created_at TIMESTAMP,
    updated_by VARCHAR(100),
    updated_at TIMESTAMP
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (1)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-6500064-6', 43.62, 'Suzanne Collins', 
    '2024-06-24', 'Ciencia ficción', 4, FALSE, 'físico', 85, 
    'https://placeimg.com/200/300/any', 'admin', '2024-12-17 23:42:25', 'librero', '2025-03-08 20:14:19'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (2)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-3137455-9', 33.29, 'Frank Herbert', 
    '2023-12-03', 'Ciencia ficción', 3, TRUE, 'digital', 67, 
    'https://dummyimage.com/200x300', 'admin', '2024-08-01 00:25:25', 'librero', '2025-02-01 18:12:43'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (3)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-9483231-8', 32.72, 'Andy Weir', 
    '2021-04-15', 'Ciencia ficción', 3, TRUE, 'físico', 78, 
    'https://placeimg.com/200/300/any', 'admin', '2024-11-12 02:53:19', 'editor1', '2025-05-17 16:21:33'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (4)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-5537129-2', 30.01, 'Paula Hawkins', 
    '2020-08-18', 'Suspenso', 4, TRUE, 'físico', 0, 
    'https://dummyimage.com/200x300', 'admin', '2025-05-06 16:25:48', 'editor1', '2025-05-08 09:06:18'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (5)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-8927654-5', 13.66, 'Dante Alighieri', 
    '2018-02-17', 'Drama', 3, FALSE, 'físico', 63, 
    'https://placeimg.com/200/300/any', 'librero', '2025-05-20 00:46:16', 'editor1', '2025-05-26 00:09:39'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (6)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-5253553-7', 42.41, 'Alex Hirsch', 
    '2018-12-27', 'Aventura', 2, TRUE, 'físico', 87, 
    'https://dummyimage.com/200x300', 'librero', '2025-02-12 15:10:27', 'admin', '2025-02-16 06:57:47'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (7)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-4390763-8', 33.07, 'Javier Castillo', 
    '2016-09-11', 'Suspenso', 2, FALSE, 'físico', 80, 
    'https://placeimg.com/200/300/any', 'admin', '2025-03-05 12:24:28', 'admin', '2025-05-26 06:28:31'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (8)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-8992515-6', 31.47, 'Cormac McCarthy', 
    '2024-10-22', 'Drama', 5, FALSE, 'físico', 44, 
    'https://dummyimage.com/200x300', 'admin', '2024-08-15 18:56:56', 'editor1', '2024-11-29 01:35:14'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (9)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-1613090-5', 31.04, 'Varios author', 
    '2019-03-03', 'Terror', 5, FALSE, 'físico', 99, 
    'https://placeimg.com/200/300/any', 'admin', '2025-03-13 18:41:46', 'editor1', '2025-05-22 12:35:21'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (10)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-9954314-2', 16.42, 'Varios author', 
    '2017-07-31', 'Ciencia ficción', 5, FALSE, 'digital', 81, 
    'https://placeimg.com/200/300/any', 'admin', '2024-10-12 15:11:48', 'admin', '2025-06-01 20:53:36'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (11)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-6273269-5', 25.1, 'Suzanne Collins', 
    '2017-04-23', 'Ciencia ficción', 2, FALSE, 'físico', 76, 
    'https://dummyimage.com/200x300', 'librero', '2024-09-13 23:07:00', 'admin', '2025-03-06 20:56:44'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (12)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-3845932-6', 26.63, 'Frank Herbert', 
    '2024-10-13', 'Ciencia ficción', 2, TRUE, 'físico', 28, 
    'https://dummyimage.com/200x300', 'editor1', '2024-08-31 02:25:44', 'librero', '2025-05-28 22:01:30'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (13)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-1680778-9', 22.03, 'Andy Weir', 
    '2015-10-26', 'Ciencia ficción', 2, FALSE, 'físico', 71, 
    'https://dummyimage.com/200x300', 'admin', '2025-05-07 12:38:51', 'admin', '2025-05-14 19:06:21'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (14)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-9400652-8', 21.57, 'Paula Hawkins', 
    '2023-04-25', 'Suspenso', 1, FALSE, 'digital', 22, 
    'https://dummyimage.com/200x300', 'librero', '2025-04-06 04:32:16', 'librero', '2025-06-02 19:36:44'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (15)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-8899610-6', 31.71, 'Dante Alighieri', 
    '2016-10-30', 'Drama', 5, TRUE, 'digital', 35, 
    'https://dummyimage.com/200x300', 'librero', '2024-12-10 09:55:23', 'librero', '2025-01-15 00:47:39'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (16)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-7591175-9', 24.35, 'Alex Hirsch', 
    '2020-04-03', 'Aventura', 2, FALSE, 'digital', 21, 
    'https://dummyimage.com/200x300', 'librero', '2025-04-29 18:34:32', 'librero', '2025-05-28 00:37:15'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (17)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-7582355-6', 44.93, 'Javier Castillo', 
    '2025-02-12', 'Suspenso', 2, TRUE, 'digital', 36, 
    'https://dummyimage.com/200x300', 'librero', '2024-08-28 09:15:08', 'librero', '2025-04-14 18:40:27'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (18)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-8915108-6', 25.57, 'Cormac McCarthy', 
    '2020-12-14', 'Drama', 3, FALSE, 'físico', 84, 
    'https://dummyimage.com/200x300', 'editor1', '2024-12-18 00:44:28', 'librero', '2025-04-11 17:10:32'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (19)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-9608770-0', 14.32, 'Varios author', 
    '2022-12-02', 'Terror', 1, FALSE, 'digital', 36, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-11-04 01:38:49', 'librero', '2025-04-29 01:48:31'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (20)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-4188493-1', 28.58, 'Varios author', 
    '2023-07-07', 'Ciencia ficción', 5, FALSE, 'digital', 64, 
    'https://dummyimage.com/200x300', 'admin', '2024-06-13 15:47:53', 'editor1', '2025-04-08 12:52:48'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (21)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-1971996-5', 36.82, 'Suzanne Collins', 
    '2025-02-11', 'Ciencia ficción', 4, TRUE, 'físico', 53, 
    'https://placeimg.com/200/300/any', 'admin', '2024-12-05 09:41:43', 'editor1', '2025-05-30 16:39:42'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (22)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-5638584-3', 36.66, 'Frank Herbert', 
    '2022-03-23', 'Ciencia ficción', 2, TRUE, 'digital', 83, 
    'https://dummyimage.com/200x300', 'admin', '2024-07-23 03:58:25', 'librero', '2024-12-26 07:40:16'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (23)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-5364811-7', 31.36, 'Andy Weir', 
    '2017-07-29', 'Ciencia ficción', 5, TRUE, 'físico', 47, 
    'https://placeimg.com/200/300/any', 'librero', '2024-12-09 17:33:05', 'admin', '2025-02-13 14:11:21'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (24)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-8759088-5', 29.77, 'Paula Hawkins', 
    '2024-05-18', 'Suspenso', 5, TRUE, 'digital', 3, 
    'https://placeimg.com/200/300/any', 'librero', '2024-08-06 03:28:55', 'editor1', '2025-03-16 00:34:31'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (25)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-9419315-6', 11.16, 'Dante Alighieri', 
    '2020-03-05', 'Drama', 1, FALSE, 'físico', 86, 
    'https://placeimg.com/200/300/any', 'admin', '2025-03-15 07:29:23', 'editor1', '2025-05-16 11:20:47'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (26)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-2251451-8', 33.52, 'Alex Hirsch', 
    '2023-05-09', 'Aventura', 3, FALSE, 'físico', 60, 
    'https://placeimg.com/200/300/any', 'admin', '2024-07-08 13:00:38', 'admin', '2025-04-09 03:37:18'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (27)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-8493960-5', 15.71, 'Javier Castillo', 
    '2024-09-30', 'Suspenso', 3, TRUE, 'digital', 5, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-06-11 21:02:15', 'librero', '2024-09-24 05:17:14'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (28)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-9326770-5', 28.49, 'Cormac McCarthy', 
    '2018-07-29', 'Drama', 3, FALSE, 'físico', 55, 
    'https://dummyimage.com/200x300', 'admin', '2024-12-13 18:45:58', 'admin', '2025-04-13 07:26:06'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (29)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-2298164-4', 43.41, 'Varios author', 
    '2016-05-13', 'Terror', 5, FALSE, 'físico', 73, 
    'https://dummyimage.com/200x300', 'editor1', '2024-08-05 08:16:00', 'editor1', '2024-12-12 03:21:19'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (30)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-1437984-0', 19.05, 'Varios author', 
    '2025-02-02', 'Ciencia ficción', 2, TRUE, 'físico', 13, 
    'https://placeimg.com/200/300/any', 'admin', '2025-04-07 02:21:30', 'admin', '2025-04-17 19:04:03'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (31)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-9845201-9', 13.94, 'Suzanne Collins', 
    '2022-01-31', 'Ciencia ficción', 4, FALSE, 'físico', 94, 
    'https://dummyimage.com/200x300', 'editor1', '2025-05-16 02:29:02', 'editor1', '2025-05-23 16:34:26'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (32)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-3779073-7', 21.9, 'Frank Herbert', 
    '2023-04-22', 'Ciencia ficción', 4, TRUE, 'digital', 32, 
    'https://placeimg.com/200/300/any', 'librero', '2024-11-03 16:28:25', 'librero', '2025-05-21 10:17:45'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (33)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-5577797-2', 27.82, 'Andy Weir', 
    '2021-02-10', 'Ciencia ficción', 1, FALSE, 'físico', 16, 
    'https://placeimg.com/200/300/any', 'admin', '2024-07-20 23:31:42', 'editor1', '2024-11-22 04:40:59'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (34)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-6558226-6', 40.5, 'Paula Hawkins', 
    '2021-06-25', 'Suspenso', 2, FALSE, 'digital', 45, 
    'https://placeimg.com/200/300/any', 'librero', '2025-02-15 04:58:07', 'librero', '2025-05-13 01:06:58'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (35)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-2277058-6', 16.82, 'Dante Alighieri', 
    '2024-03-21', 'Drama', 2, FALSE, 'físico', 13, 
    'https://dummyimage.com/200x300', 'admin', '2025-02-05 13:01:35', 'admin', '2025-04-09 02:36:20'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (36)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-3023908-8', 27.66, 'Alex Hirsch', 
    '2023-11-07', 'Aventura', 5, FALSE, 'físico', 67, 
    'https://placeimg.com/200/300/any', 'admin', '2024-08-06 17:13:33', 'editor1', '2025-01-30 15:50:17'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (37)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-5146512-9', 37.05, 'Javier Castillo', 
    '2020-07-11', 'Suspenso', 5, FALSE, 'físico', 25, 
    'https://dummyimage.com/200x300', 'editor1', '2025-03-16 14:58:57', 'editor1', '2025-05-31 16:14:26'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (38)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-7309445-3', 28.23, 'Cormac McCarthy', 
    '2024-05-16', 'Drama', 1, TRUE, 'físico', 34, 
    'https://dummyimage.com/200x300', 'librero', '2024-08-19 19:00:07', 'editor1', '2024-11-08 11:34:39'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (39)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-5806029-5', 17.32, 'Varios author', 
    '2023-09-25', 'Terror', 5, TRUE, 'digital', 27, 
    'https://placeimg.com/200/300/any', 'librero', '2024-12-23 03:22:47', 'admin', '2025-04-16 19:52:06'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (40)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-9062496-4', 36.68, 'Varios author', 
    '2022-08-03', 'Ciencia ficción', 5, TRUE, 'digital', 87, 
    'https://placeimg.com/200/300/any', 'librero', '2024-12-03 14:47:13', 'librero', '2025-01-17 21:21:18'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (41)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-9406983-5', 11.88, 'Suzanne Collins', 
    '2015-11-24', 'Ciencia ficción', 2, TRUE, 'digital', 61, 
    'https://dummyimage.com/200x300', 'librero', '2025-01-26 00:06:13', 'admin', '2025-06-01 11:34:28'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (42)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-9896579-4', 31.51, 'Frank Herbert', 
    '2022-05-28', 'Ciencia ficción', 5, TRUE, 'físico', 14, 
    'https://placeimg.com/200/300/any', 'admin', '2024-11-23 07:15:46', 'editor1', '2025-02-04 07:19:48'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (43)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-9053436-2', 14.69, 'Andy Weir', 
    '2019-11-04', 'Ciencia ficción', 4, TRUE, 'físico', 62, 
    'https://dummyimage.com/200x300', 'editor1', '2025-01-26 22:56:21', 'editor1', '2025-05-30 17:07:34'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (44)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-9074621-5', 24.02, 'Paula Hawkins', 
    '2016-11-14', 'Suspenso', 2, TRUE, 'digital', 37, 
    'https://placeimg.com/200/300/any', 'librero', '2024-10-07 04:13:06', 'admin', '2025-04-02 10:06:53'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (45)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-6673728-2', 22.78, 'Dante Alighieri', 
    '2024-07-19', 'Drama', 1, FALSE, 'físico', 38, 
    'https://placeimg.com/200/300/any', 'librero', '2024-07-13 17:15:50', 'admin', '2024-10-13 13:07:28'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (46)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-2269379-2', 35.78, 'Alex Hirsch', 
    '2024-04-22', 'Aventura', 4, FALSE, 'digital', 91, 
    'https://placeimg.com/200/300/any', 'admin', '2025-04-12 22:40:32', 'editor1', '2025-05-10 15:20:50'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (47)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-7316811-1', 43.61, 'Javier Castillo', 
    '2024-11-21', 'Suspenso', 1, TRUE, 'digital', 35, 
    'https://dummyimage.com/200x300', 'librero', '2024-12-25 12:10:18', 'editor1', '2025-05-19 06:11:28'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (48)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-6539215-7', 10.86, 'Cormac McCarthy', 
    '2016-05-01', 'Drama', 3, FALSE, 'digital', 5, 
    'https://placeimg.com/200/300/any', 'librero', '2024-10-15 07:50:49', 'librero', '2025-02-16 17:28:01'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (49)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-3308934-8', 10.47, 'Varios author', 
    '2016-07-13', 'Terror', 4, FALSE, 'digital', 26, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-08-05 07:18:21', 'admin', '2024-10-09 04:05:26'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (50)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-8469690-9', 39.97, 'Varios author', 
    '2019-10-24', 'Ciencia ficción', 1, FALSE, 'físico', 83, 
    'https://dummyimage.com/200x300', 'editor1', '2024-10-01 18:28:16', 'editor1', '2025-02-19 23:28:24'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (51)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-5523873-6', 28.39, 'Suzanne Collins', 
    '2022-01-22', 'Ciencia ficción', 3, TRUE, 'digital', 28, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-08-21 11:51:29', 'editor1', '2024-11-22 11:55:59'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (52)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-2630550-5', 34.73, 'Frank Herbert', 
    '2016-04-04', 'Ciencia ficción', 3, TRUE, 'digital', 35, 
    'https://dummyimage.com/200x300', 'editor1', '2025-03-09 08:59:44', 'librero', '2025-04-26 09:34:33'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (53)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-3224187-3', 29.89, 'Andy Weir', 
    '2024-01-27', 'Ciencia ficción', 5, FALSE, 'físico', 65, 
    'https://placeimg.com/200/300/any', 'librero', '2025-03-15 16:06:42', 'librero', '2025-03-31 07:01:01'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (54)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-9137347-3', 11.37, 'Paula Hawkins', 
    '2016-06-06', 'Suspenso', 1, FALSE, 'digital', 63, 
    'https://placeimg.com/200/300/any', 'editor1', '2025-03-09 17:47:23', 'librero', '2025-05-23 20:35:41'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (55)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-2274656-5', 40.49, 'Dante Alighieri', 
    '2016-10-16', 'Drama', 3, TRUE, 'digital', 7, 
    'https://placeimg.com/200/300/any', 'admin', '2024-08-24 08:48:07', 'editor1', '2025-01-10 12:48:11'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (56)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-8223104-4', 40.13, 'Alex Hirsch', 
    '2024-06-09', 'Aventura', 5, FALSE, 'físico', 63, 
    'https://placeimg.com/200/300/any', 'librero', '2024-12-06 10:57:40', 'librero', '2025-05-29 17:43:48'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (57)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-2110867-1', 37.31, 'Javier Castillo', 
    '2020-07-23', 'Suspenso', 4, TRUE, 'físico', 90, 
    'https://placeimg.com/200/300/any', 'librero', '2024-11-29 16:04:31', 'admin', '2025-03-02 02:36:42'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (58)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-1619025-1', 9.09, 'Cormac McCarthy', 
    '2019-07-12', 'Drama', 4, TRUE, 'físico', 82, 
    'https://dummyimage.com/200x300', 'editor1', '2024-11-20 01:23:53', 'editor1', '2025-04-23 09:11:28'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (59)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-4705872-5', 26.67, 'Varios author', 
    '2017-09-29', 'Terror', 2, FALSE, 'digital', 30, 
    'https://placeimg.com/200/300/any', 'admin', '2024-12-19 23:19:12', 'editor1', '2025-03-01 01:28:06'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (60)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-8509755-7', 40.74, 'Varios author', 
    '2023-06-26', 'Ciencia ficción', 2, TRUE, 'físico', 24, 
    'https://placeimg.com/200/300/any', 'admin', '2025-03-12 14:43:13', 'librero', '2025-03-28 13:46:37'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (61)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-5451046-2', 24.32, 'Suzanne Collins', 
    '2017-02-13', 'Ciencia ficción', 3, TRUE, 'físico', 40, 
    'https://placeimg.com/200/300/any', 'librero', '2024-09-06 03:21:26', 'admin', '2024-09-28 15:17:59'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (62)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-2758045-0', 10.02, 'Frank Herbert', 
    '2017-09-09', 'Ciencia ficción', 5, FALSE, 'físico', 14, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-11-19 23:29:09', 'admin', '2025-04-02 10:54:35'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (63)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-9864569-4', 18.11, 'Andy Weir', 
    '2019-12-26', 'Ciencia ficción', 5, FALSE, 'físico', 63, 
    'https://dummyimage.com/200x300', 'admin', '2025-05-06 03:09:39', 'admin', '2025-05-21 05:30:09'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (64)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-5536174-0', 20.43, 'Paula Hawkins', 
    '2018-08-07', 'Suspenso', 2, TRUE, 'físico', 16, 
    'https://placeimg.com/200/300/any', 'librero', '2024-11-21 08:20:11', 'admin', '2025-03-04 08:55:02'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (65)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-1848847-2', 31.73, 'Dante Alighieri', 
    '2022-11-07', 'Drama', 5, TRUE, 'digital', 0, 
    'https://placeimg.com/200/300/any', 'librero', '2025-02-12 13:04:22', 'librero', '2025-06-03 08:15:48'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (66)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-5769547-7', 15.81, 'Alex Hirsch', 
    '2016-10-07', 'Aventura', 1, TRUE, 'digital', 67, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-08-18 12:00:25', 'librero', '2025-04-22 02:13:11'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (67)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-5315820-8', 20.62, 'Javier Castillo', 
    '2023-08-13', 'Suspenso', 3, TRUE, 'físico', 44, 
    'https://dummyimage.com/200x300', 'editor1', '2024-09-27 07:25:34', 'librero', '2025-03-09 16:02:47'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (68)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-1560241-6', 21.61, 'Cormac McCarthy', 
    '2016-12-12', 'Drama', 5, TRUE, 'digital', 0, 
    'https://placeimg.com/200/300/any', 'admin', '2024-07-26 22:57:49', 'editor1', '2024-09-03 13:36:15'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (69)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-7208650-5', 41.35, 'Varios author', 
    '2020-05-08', 'Terror', 5, TRUE, 'digital', 71, 
    'https://placeimg.com/200/300/any', 'librero', '2025-05-07 16:51:35', 'admin', '2025-05-30 15:24:34'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (70)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-1914973-8', 44.98, 'Varios author', 
    '2022-02-15', 'Ciencia ficción', 4, TRUE, 'físico', 92, 
    'https://placeimg.com/200/300/any', 'admin', '2024-08-27 01:53:00', 'admin', '2024-10-12 20:35:34'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (71)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-9424029-2', 15.52, 'Suzanne Collins', 
    '2024-05-05', 'Ciencia ficción', 1, TRUE, 'digital', 57, 
    'https://dummyimage.com/200x300', 'editor1', '2024-07-24 01:48:57', 'admin', '2025-05-21 09:14:13'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (72)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-3972964-9', 32.32, 'Frank Herbert', 
    '2022-09-12', 'Ciencia ficción', 3, FALSE, 'físico', 71, 
    'https://placeimg.com/200/300/any', 'admin', '2025-05-08 06:35:48', 'librero', '2025-05-09 23:13:24'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (73)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-9887778-1', 27.76, 'Andy Weir', 
    '2019-11-16', 'Ciencia ficción', 5, FALSE, 'digital', 51, 
    'https://dummyimage.com/200x300', 'admin', '2025-04-05 15:21:24', 'admin', '2025-05-08 07:18:40'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (74)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-6366114-4', 12.3, 'Paula Hawkins', 
    '2019-07-10', 'Suspenso', 5, TRUE, 'digital', 49, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-07-31 15:35:44', 'editor1', '2025-03-03 16:36:29'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (75)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-9122097-5', 32.35, 'Dante Alighieri', 
    '2016-05-13', 'Drama', 5, FALSE, 'digital', 42, 
    'https://dummyimage.com/200x300', 'editor1', '2025-04-19 02:23:18', 'admin', '2025-04-20 21:40:04'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (76)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-5115021-1', 37.68, 'Alex Hirsch', 
    '2017-07-17', 'Aventura', 4, TRUE, 'físico', 92, 
    'https://placeimg.com/200/300/any', 'editor1', '2025-06-01 12:25:02', 'librero', '2025-06-01 14:48:21'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (77)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-2358333-2', 21.79, 'Javier Castillo', 
    '2018-11-01', 'Suspenso', 4, TRUE, 'digital', 33, 
    'https://dummyimage.com/200x300', 'editor1', '2025-03-31 13:25:49', 'admin', '2025-05-10 20:01:54'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (78)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-5533465-9', 24.05, 'Cormac McCarthy', 
    '2023-03-19', 'Drama', 1, FALSE, 'físico', 11, 
    'https://placeimg.com/200/300/any', 'admin', '2025-01-28 21:56:28', 'editor1', '2025-02-14 14:52:51'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (79)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-4395660-8', 13.51, 'Varios author', 
    '2021-02-14', 'Terror', 1, FALSE, 'físico', 24, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-12-12 07:07:56', 'librero', '2025-01-01 11:27:34'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (80)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-6247018-2', 35.98, 'Varios author', 
    '2024-02-19', 'Ciencia ficción', 2, FALSE, 'físico', 66, 
    'https://dummyimage.com/200x300', 'librero', '2024-09-27 19:56:13', 'editor1', '2025-01-04 23:58:11'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (81)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-8654663-0', 29.01, 'Suzanne Collins', 
    '2016-11-06', 'Ciencia ficción', 1, TRUE, 'digital', 19, 
    'https://dummyimage.com/200x300', 'admin', '2025-04-06 02:11:11', 'editor1', '2025-05-30 05:33:29'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (82)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-7472032-1', 9.04, 'Frank Herbert', 
    '2016-12-17', 'Ciencia ficción', 4, FALSE, 'físico', 19, 
    'https://placeimg.com/200/300/any', 'librero', '2025-01-26 19:36:10', 'admin', '2025-02-26 07:35:47'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (83)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-7185846-3', 13.39, 'Andy Weir', 
    '2022-03-30', 'Ciencia ficción', 3, FALSE, 'físico', 100, 
    'https://placeimg.com/200/300/any', 'admin', '2024-10-22 22:55:01', 'librero', '2024-11-01 12:53:26'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (84)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-5707672-6', 38.94, 'Paula Hawkins', 
    '2024-08-21', 'Suspenso', 1, TRUE, 'físico', 94, 
    'https://placeimg.com/200/300/any', 'librero', '2024-07-29 03:03:49', 'editor1', '2025-02-13 01:05:50'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (85)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-7630473-9', 31.0, 'Dante Alighieri', 
    '2015-06-07', 'Drama', 3, FALSE, 'físico', 53, 
    'https://placeimg.com/200/300/any', 'editor1', '2025-02-16 13:27:41', 'admin', '2025-05-07 20:42:33'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (86)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-2102571-2', 36.87, 'Alex Hirsch', 
    '2020-10-20', 'Aventura', 3, FALSE, 'digital', 17, 
    'https://dummyimage.com/200x300', 'editor1', '2024-06-18 15:24:10', 'librero', '2025-04-07 18:03:25'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (87)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-2881933-2', 12.39, 'Javier Castillo', 
    '2015-10-19', 'Suspenso', 5, FALSE, 'físico', 18, 
    'https://placeimg.com/200/300/any', 'librero', '2024-06-08 21:45:27', 'librero', '2024-11-03 18:51:18'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (88)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-7623078-3', 44.02, 'Cormac McCarthy', 
    '2019-08-16', 'Drama', 4, FALSE, 'digital', 15, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-11-21 03:16:11', 'librero', '2024-11-25 02:30:12'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (89)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-1259727-1', 13.79, 'Varios author', 
    '2019-04-21', 'Terror', 5, FALSE, 'digital', 56, 
    'https://placeimg.com/200/300/any', 'editor1', '2025-02-06 14:53:42', 'editor1', '2025-05-09 01:46:09'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (90)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-2847403-9', 32.2, 'Varios author', 
    '2017-07-09', 'Ciencia ficción', 5, TRUE, 'físico', 63, 
    'https://dummyimage.com/200x300', 'librero', '2025-05-04 00:54:06', 'editor1', '2025-05-22 08:40:14'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Hunger Games (91)', 'En un futuro distópico, Katniss Everdeen se ve obligada a participar en un torneo televisado.', '978-3-4054914-6', 14.81, 'Suzanne Collins', 
    '2020-06-25', 'Ciencia ficción', 1, FALSE, 'físico', 46, 
    'https://placeimg.com/200/300/any', 'librero', '2025-03-30 20:31:54', 'admin', '2025-05-16 04:23:34'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Dune (92)', 'La historia de Paul Atreides y su lucha por el control del planeta Arrakis.', '978-3-3973559-5', 39.07, 'Frank Herbert', 
    '2020-09-05', 'Ciencia ficción', 4, FALSE, 'digital', 18, 
    'https://placeimg.com/200/300/any', 'admin', '2025-05-27 12:59:13', 'editor1', '2025-06-02 22:48:42'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Martian (93)', 'Un astronauta queda atrapado en Marte y debe usar su ingenio para sobrevivir.', '978-3-4267780-9', 36.42, 'Andy Weir', 
    '2021-02-24', 'Ciencia ficción', 5, TRUE, 'físico', 85, 
    'https://placeimg.com/200/300/any', 'editor1', '2025-02-27 07:29:24', 'librero', '2025-04-17 22:43:29'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Girl on The Train (94)', 'Una mujer presencia algo sospechoso desde el tren que toma diariamente.', '978-3-6542316-0', 37.51, 'Paula Hawkins', 
    '2021-02-28', 'Suspenso', 5, FALSE, 'físico', 15, 
    'https://dummyimage.com/200x300', 'librero', '2025-02-05 23:50:07', 'librero', '2025-02-10 12:41:37'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'La Divina Comedia (95)', 'Un viaje alegórico a través del Infierno, el Purgatorio y el Paraíso.', '978-3-8520172-3', 10.68, 'Dante Alighieri', 
    '2022-03-17', 'Drama', 1, FALSE, 'digital', 69, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-09-10 08:06:06', 'librero', '2025-02-01 11:30:52'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Gravity Falls. Leyendas Perdidas (96)', 'Historias inéditas basadas en la serie animada, llenas de misterios.', '978-3-7428738-8', 26.46, 'Alex Hirsch', 
    '2024-09-15', 'Aventura', 5, FALSE, 'digital', 61, 
    'https://dummyimage.com/200x300', 'editor1', '2025-04-13 10:01:17', 'editor1', '2025-05-21 00:02:25'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'El Cuco de Cristal (97)', 'Una historia entrelazada por un misterioso asesinato.', '978-3-5537270-8', 25.77, 'Javier Castillo', 
    '2022-07-10', 'Suspenso', 1, FALSE, 'digital', 23, 
    'https://dummyimage.com/200x300', 'editor1', '2024-09-12 00:18:54', 'admin', '2024-12-31 09:37:40'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'The Road (98)', 'Un padre y su hijo atraviesan un mundo devastado, luchando por sobrevivir.', '978-3-6653792-3', 12.42, 'Cormac McCarthy', 
    '2020-01-20', 'Drama', 3, FALSE, 'físico', 99, 
    'https://placeimg.com/200/300/any', 'admin', '2024-07-31 12:50:25', 'librero', '2025-05-06 18:12:34'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Antología del Terror (99)', 'Recopilación de relatos escalofriantes de diferentes escritores.', '978-3-2507184-0', 25.75, 'Varios author', 
    '2016-08-08', 'Terror', 2, TRUE, 'digital', 9, 
    'https://placeimg.com/200/300/any', 'editor1', '2024-10-29 14:57:45', 'editor1', '2025-01-29 18:09:46'
);

INSERT INTO books (
    title, description, isbn, price, author, release_date, category, rating, 
    visibility, format, stock, image, created_by, created_at, updated_by, updated_at
) VALUES (
    'Relatos de Ciencia Ficción (100)', 'Cuentos que exploran futuros posibles y tecnologías avanzadas.', '978-3-8130076-9', 12.53, 'Varios author', 
    '2021-05-04', 'Ciencia ficción', 3, FALSE, 'digital', 50, 
    'https://dummyimage.com/200x300', 'librero', '2024-12-26 01:48:39', 'librero', '2025-01-12 23:24:14'
);

CREATE USER booksuser WITH PASSWORD 'bookspassword';
GRANT ALL PRIVILEGES ON DATABASE booksdb TO booksuser;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO booksuser;
GRANT USAGE, SELECT, UPDATE ON SEQUENCE books_id_seq TO booksuser;
GRANT ALL PRIVILEGES ON TABLE books TO booksuser;
ALTER TABLE books OWNER TO booksuser
