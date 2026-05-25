# Práctica 2 – Sistema de modernización del MUTXAMEL FC

## Descripción

En esta práctica se ha desarrollado una aplicación en Java utilizando Programación Orientada a Objetos (POO) para simular el sistema de organización del MUTXAMEL FC tras su enfrentamiento en la Copa del Rey contra el Real Madrid.

El objetivo principal ha sido modelar la estructura del club siguiendo el diagrama UML proporcionado y aplicar conceptos como:

- Herencia
- Interfaces
- Enumeraciones
- Excepciones personalizadas
- Uso de colecciones (ArrayList)
- Menús interactivos

---

## Estructura del proyecto

El proyecto está organizado en el paquete `CopaDelRey` y contiene las siguientes clases:

### Clase abstracta

- **MutxamelFC**
    - Contiene los atributos comunes: `nombre` y `edad`.
    - Implementa la interfaz `FuncionesIntegrantes`.

### Interfaces

- **FuncionesIntegrantes**
    - `concentrarse()`
    - `viajar(String ciudad)`
    - `celebrarGol()`

- **AccionesDeportivas**
    - `entrenar()`
    - `jugarPartido(String rival)`

### Clases principales

- **Jugador**
    - Atributos: categoría, dorsal y posición.
    - Implementa `AccionesDeportivas`.
    - Incluye métodos como `calentar()`, `descansar()` y `marcarGol()`.

- **Entrenador**
    - Atributos: equipo y formación preferida.
    - Implementa `AccionesDeportivas`.
    - Incluye métodos como `planificarEntrenamiento()` y `hacerCambios()`.

- **Masajista**
    - Atributos: titulación y años de experiencia.
    - Incluye el método `darMasaje(Jugador jugador)`.

- **Acompanyante**
    - Asociado a un jugador.
    - Incluye el método `animarEquipo()`.

### Enumeraciones

- **Equipos**
    - BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR

- **Posiciones**
    - PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO

### Excepciones personalizadas

- **MismoDorsalException**
    - Se lanza cuando se intenta asignar un dorsal ya ocupado en el mismo equipo.

- **FormatoFormacionException**
    - Se lanza cuando la formación del entrenador no tiene el formato correcto (N-N-N).

---

## Funcionamiento del mantenimiento

Se ha implementado la clase `AppMantenimiento`, que contiene un menú interactivo para:

- Añadir jugadores
- Modificar jugadores existentes
- Crear acompañantes (solo para jugadores SENIOR)
- Consultar equipos

### Validaciones implementadas

- No se permite asignar un dorsal repetido dentro del mismo equipo.
- Se controla mediante `MismoDorsalException`.
- Solo los jugadores del equipo SENIOR pueden tener acompañantes.
- Se validan los índices seleccionados en los menús.

---

## Conceptos aplicados

Durante la realización de la práctica se han aplicado:

- Herencia mediante la clase abstracta `MutxamelFC`
- Polimorfismo usando interfaces
- Uso de `ArrayList` para almacenar jugadores
- Manejo de excepciones personalizadas
- Uso de `Scanner` para interacción con el usuario
- Control de errores en entradas por teclado

---

## Conclusión

Esta práctica ha permitido reforzar los conceptos fundamentales de la Programación Orientada a Objetos en Java, especialmente el uso de herencia, interfaces y excepciones personalizadas.

Además, se ha trabajado la organización del código y la creación de un sistema funcional basado en menús, simulando una aplicación real de gestión deportiva.
