# Reto talento B

Julian Ortiz Uribe

# Configuración del Proyecto

Este proyecto está construido con Spring Boot 3.2.5, Java 17 y Gradle como herramienta de gestión de dependencias. Se utiliza JPA (Java Persistence API) para las interacciones con la base de datos.

## Prerrequisitos

Asegúrate de tener instalados los siguientes elementos en tu sistema:
- Java 17
- Gradle
- Una base de datos PostgreSQL

## Estructura de carpetas

Repositorio: Contiene la interacción con la base de datos, en este caso por medio de JPA.
Servicio: Contiene la lógica de la app, ejemplo: Las validaciones.
Controlador: Contiene los métodos que manejan las solicitudes HTTP entrantes (Endpoints).
Modelo: Contiene las clases que representan las entidades de la base de datos.

## Modelo entidad relación

CREATE DATABASE lugaresDB;

CREATE USER backend_user WITH PASSWORD 'talentoB';

CREATE TABLE Persona (
    id_persona SERIAL PRIMARY KEY,
    nombre VARCHAR(100),
    edad INTEGER,
    ocupacion VARCHAR(100)
);

CREATE TABLE Lugar (
    id_lugar SERIAL PRIMARY KEY,
    nombre VARCHAR(100),
    departamento VARCHAR(100),
    pais VARCHAR(100),
    persona_id_persona INTEGER,
    FOREIGN KEY (persona_id_persona) REFERENCES Persona(id_persona)
);

## Operaciones

1. Crear persona 

curl --location 'http://localhost:8080/api/person' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Julian Ortiz",
    "age": 20,
    "occupation": "Ingeniero de sistemas"
}'

2. Crear lugar

curl --location 'http://localhost:8080/api/place' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Edificio Bancolombia",
    "department": "Antioquia",
    "country": "Colombia",
    "person": {
        "personId": 1
    }
}'

3. Consultar personas que hayan visitado un lugar específico: Según el modelo de entidad-relación planteado en el reto, solo es posible asociar una persona a un lugar. Para poder asociar a un lugar con muchas personas, habría que modificar el modelo y agregar una tercera tabla que permita una relación de muchos a muchos entre personas y lugares.

curl --location 'http://localhost:8080/api/place/1'

4. Consultar lugares visitados de un país específico

curl --location 'http://localhost:8080/api/place/country?country=Colombia'
