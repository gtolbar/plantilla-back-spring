-- liquibase formatted sql

-- changeset gustavo:1
-- comment: Tabla persona plantilla
CREATE TABLE persona(
	id_persona INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(255) NOT NULL
);

-- changeset gustavo:2
-- comment: Registros persona plantilla
INSERT INTO persona (nombre,apellido) VALUES 
("Gustavo","Toledo"),
("Jorge","Toledo"),
("Ingrid","Toledo");