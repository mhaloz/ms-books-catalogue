-- Crear base de datos (si no existe) 

CREATE DATABASE booksdb; 

   

-- Crear tabla books 

CREATE TABLE books ( 

    id SERIAL PRIMARY KEY, 

    title VARCHAR(255) NOT NULL, 

    author VARCHAR(255) NOT NULL, 

    publication_date DATE, 

    category VARCHAR(100), 

    isbn VARCHAR(20) UNIQUE, 

    rating INTEGER CHECK (rating BETWEEN 1 AND 5), 

    visible BOOLEAN DEFAULT TRUE 

); 

  

-- Insertar datos de ejemplo 

INSERT INTO books (title, author, publication_date, category, isbn, rating, visible) VALUES 

('Cien años de soledad', 'Gabriel García Márquez', '1967-06-05', 'Realismo mágico', '9780307474728', 5, TRUE), 

('1984', 'George Orwell', '1949-06-08', 'Distopía', '9780451524935', 5, TRUE), 

('Don Quijote', 'Miguel de Cervantes', '1605-01-16', 'Clásico', '9788491050293', 4, TRUE), 

('El código Da Vinci', 'Dan Brown', '2003-03-18', 'Thriller', '9780307474278', 3, FALSE), 

('Fahrenheit 451', 'Ray Bradbury', '1953-10-19', 'Ciencia ficción', '9781451673319', 4, TRUE), 

('La sombra del viento', 'Carlos Ruiz Zafón', '2001-04-12', 'Misterio', '9788408172171', 5, TRUE); 

 

 

 

-- Crear usuario 

CREATE USER booksuser WITH PASSWORD 'bookspassword'; 

  

-- Darle permisos sobre la base de datos 

GRANT ALL PRIVILEGES ON DATABASE booksdb TO booksuser; 

  

-- También es buena práctica permitir el uso de la tabla: 

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO booksuser; 

 

 

GRANT USAGE, SELECT, UPDATE ON SEQUENCE books_id_seq TO booksuser; 

 

 

GRANT ALL PRIVILEGES ON TABLE books TO booksuser; 
