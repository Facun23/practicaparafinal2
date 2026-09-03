# 🏦 Sistema de Gestión Bancaria - API REST

Este proyecto es una API RESTful desarrollada con **Java** y **Spring Boot** para gestionar las operaciones básicas de un banco. El sistema implementa conceptos avanzados de Programación Orientada a Objetos (POO) como herencia, polimorfismo y clases abstractas.

## 🚀 Tecnologías Utilizadas
* Java 17+ (o versión compatible)
* Spring Boot
* Postman (para pruebas de API)

## 🏗️ Arquitectura del Proyecto

El proyecto sigue una arquitectura en capas:
1. **Model (Modelos):** Representa las entidades del dominio (`Cliente`, `Sucursal`, `Cuenta`, `Movimiento`).
2. **Service (Servicios):** Contiene la lógica de negocio y el almacenamiento de datos en memoria.
3. **Controller (Controladores):** Maneja las peticiones HTTP (endpoints) y estructura las respuestas.

## 📝 Paso a Paso de la Implementación

### 1. Modelado del Dominio (Clases y Herencia)
* Se creó una clase abstracta `Cuenta` que define el contrato básico y obligatorio (`consultarSaldo`, `depositar`, `extraer`).
* Se implementaron las clases hijas `CajaAhorro` y `CuentaCorriente` que heredan de `Cuenta` usando la palabra clave `extends`.
* Se utilizó la palabra clave `super()` en los constructores de las clases hijas para delegar la inicialización de atributos compartidos (como el CBU y el saldo base) a la clase madre.
* Se resolvieron errores de implementación asegurando que todos los métodos abstractos heredados fueran sobreescritos (`@Override`) correctamente en las clases hijas.
* Se encapsularon los atributos para mantener la integridad de los datos, evitando duplicidades estructurales (por ejemplo, eliminando el atributo `saldo` duplicado en `CuentaCorriente`).
* Se implementó lógica de negocio específica, como el método `aplicarInteres()` en `CajaAhorro` reutilizando el método `depositar()`.

### 2. Capa de Servicios (`BancoService`)
* Se creó la clase `BancoService` etiquetada con la anotación `@Service` para que el framework de Spring Boot la reconozca y gestione como un componente (Bean).
* Se definieron listas en memoria (`ArrayList`) para almacenar las `Sucursales`, los `Clientes` y las `Cuentas`.
* Se implementó el método `inicializarDatos()` para pre-cargar el sistema con información de prueba (creación de objetos `Cliente`, `CajaAhorro`, `CuentaCorriente` y sus relaciones).
* Se expusieron los datos a través de métodos *getter*, como `obtenerClientes()`.

### 3. Capa de Controladores (`BancoController`)
* Se creó el controlador principal etiquetado con la anotación `@RestController` para habilitar el manejo de peticiones web y devolver respuestas automáticamente en formato JSON.
* Se aplicó el patrón de **Inyección de Dependencias** utilizando `@Autowired` para traer el `BancoService` al controlador, conectando exitosamente la lógica de negocio con la capa de red y solucionando errores de desconexión (`NullPointerException`).

### 4. Configuración y Prueba de Endpoints
* Se configuró el primer endpoint de lectura utilizando la anotación `@GetMapping("/clientes")`.
* Se vinculó este endpoint al método `obtenerClientes()` del servicio.
* Se solucionó el problema de listas vacías (`[]`) asegurando la ejecución del método de inicialización de datos para que las estructuras se llenen antes de recibir peticiones.

## 🛠️ Cómo Probar la API Localmente

1. Ejecutar la clase principal de la aplicación Spring Boot. El servidor web integrado (Tomcat) arrancará en `localhost` a través del puerto `8080`.
2. Abrir **Postman** (o cualquier otro cliente HTTP).
3. Crear una nueva petición seleccionando el método **GET**.
4. Ingresar la siguiente URL: `http://localhost:8080/clientes`
5. Al hacer clic en "Send", el servidor debería responder con un código HTTP `200 OK` y un cuerpo en formato JSON mostrando el listado completo de clientes y sus respectivas cuentas asociadas.
