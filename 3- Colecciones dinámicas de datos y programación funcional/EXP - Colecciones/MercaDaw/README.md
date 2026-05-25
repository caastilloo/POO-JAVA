# MERCADAW - Sistema de compra online

## Descripción

Este proyecto consiste en el desarrollo de una aplicación en Java que simula un sistema de compra online para un supermercado llamado **MERCADAW**.

La aplicación permite a los clientes autenticarse y realizar pedidos desde casa, gestionando productos, carrito de compra y promociones.

---

## Objetivos

* Implementar un sistema de autenticación de usuarios
* Gestionar pedidos mediante estructuras de datos
* Aplicar promociones sobre el pedido
* Simular un flujo completo de compra online
* Aplicar conceptos de programación orientada a objetos en Java

---

## Estructura del proyecto

El sistema está dividido en las siguientes clases:

### `Producto`

Enum que contiene los productos disponibles junto con su precio.

### `Cliente`

Representa a un usuario del sistema:

* Usuario y contraseña
* Dirección
* Pedido asociado
* Estado de promociones

### `Pedido`

Gestiona el carrito de compra:

* Almacena productos y cantidades (`Map<Producto, Integer>`)
* Calcula el importe total
* Aplica promociones

### `Mercadaw`

Gestiona la colección de clientes:

* Genera clientes aleatorios
* Proporciona acceso a los clientes

### `AppZonaClientes`

Clase principal:

* Controla el flujo del programa
* Gestiona autenticación, compra y opciones finales

---

## Funcionamiento

### Autenticación

* Se generan clientes aleatorios (usuario + contraseña)
* El usuario dispone de **3 intentos**
* Si falla → el programa finaliza
* Si acierta → accede al sistema

---

### Compra

1. Se crea un nuevo pedido
2. Se muestran los productos disponibles
3. El usuario añade productos al carrito
4. Se actualiza el importe automáticamente
5. El usuario decide si continuar o finalizar

---

### Resumen del pedido

Se muestra:

* Productos seleccionados
* Cantidad de cada uno
* Precio unitario
* Importe total

---

### Promociones

El sistema incluye dos promociones:

#### 3x2

Por cada 3 unidades de un producto, se pagan solo 2.

#### 10% descuento

Aplicado sobre el total después del 3x2.

#### Restricción

Las promociones solo pueden aplicarse **una vez por cliente**.

---

### Ordenación

Permite mostrar el pedido ordenado por número de unidades en orden descendente.

---

### Finalización

* Se muestra un mensaje de despedida
* Se indica la dirección de envío

---

## Decisiones de diseño

* Uso de `Map<Producto, Integer>` para gestionar cantidades
* Uso de `Set<Cliente>` para evitar duplicados
* Separación de responsabilidades en distintas clases
* Uso de enums para representar productos
* Encapsulación de atributos

---

## Tecnologías utilizadas

* Java
* Colecciones (`Set`, `Map`)
* Programación orientada a objetos

---

## Ejecución

1. Ejecutar la clase `AppZonaClientes`
2. Introducir usuario y contraseña (de los generados)
3. Añadir productos al carrito
4. Finalizar compra o aplicar promociones

---

## Estructura del proyecto

```
Colecciones.MercaDaw
│
├── Producto.java
├── Cliente.java
├── Pedido.java
├── Mercadaw.java
└── AppZonaClientes.java
```

---
