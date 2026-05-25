# Diccionario Español–Inglés en Java

Pequeña práctica en **Java** que implementa un diccionario Español–Inglés usando `HashMap`.  
El programa realiza preguntas al usuario mostrando una palabra en español y una pista con la primera letra de la traducción.

---

## Descripción

El programa:

- Guarda pares **español → inglés** en un `HashMap`.
- Selecciona **palabras aleatorias** del diccionario.
- Muestra la **primera letra de la traducción** como pista.
- El usuario introduce la traducción.
- El programa indica si es **correcta o incorrecta**.
- Finaliza cuando el usuario escribe **`fin`**.

Al terminar, muestra estadísticas de:

- número de preguntas
- aciertos
- errores
- porcentaje de acierto

---

## Conceptos de Java utilizados

- `HashMap`
- `ArrayList`
- `Random`
- Métodos y clases
- Manipulación de `String`
- Entrada de datos con `Scanner`

---

## Funcionamiento

1. Se crea un `HashMap<String,String>` con pares **español → inglés**.
2. Se obtiene una palabra aleatoria del diccionario.
3. Se muestra al usuario: `Perro: d ...`
4. El usuario introduce la traducción.

**Ejemplo de ejecución:**
```
Perro: d...
Indique la respuesta: dog
¡CORRECTO!

Mesa: t...
Indique la respuesta: chair
¡NO! La respuesta correcta es table
```
---
