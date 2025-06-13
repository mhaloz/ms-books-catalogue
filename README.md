# ms-books-catalogue

Microservicio Spring Boot para la gestión de un catálogo de libros.

## Características

- API RESTful para gestión de libros
- Integración con base de datos PostgreSQL
- Scripts de inicialización de esquema y datos

## Requisitos

- Java 17 o superior
- Maven 3.8 o superior
- PostgreSQL

## Estructura del Proyecto
controller/: REST controllers
model/: Entity classes
repository/: Data access layer
service/: Business logic
resources/: Config files and SQL scripts

2. **Configura la base de datos:**
   -- Ejecutar los siguentes comandos:
	CREATE DATABASE booksdb;
	CREATE USER booksuser WITH PASSWORD 'bookspassword';
	GRANT ALL PRIVILEGES ON DATABASE booksdb TO booksuser;

   - Ejecuta el script de esquema y datos en `src/main/resources/db/scripts/script.sql`.
     

## Ejecución

Para compilar y ejecutar el proyecto:

```sh
./mvnw spring-boot:run


## Endpoints Principales - Swagger

http://localhost:8081/swagger-ui/index.html
