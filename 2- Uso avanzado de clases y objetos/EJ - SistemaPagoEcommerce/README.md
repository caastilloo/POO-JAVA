# Práctica – Sistema de Pago E-commerce

## Descripción del proyecto

Este proyecto consiste en el desarrollo de una aplicación en Java que simula el motor de pagos de una plataforma de comercio electrónico. La aplicación permite gestionar diferentes métodos de pago, validando la información sensible y los requisitos de seguridad antes de procesar cualquier transacción.

El sistema está diseñado bajo el paradigma de **Programación Orientada a Objetos (POO)**, haciendo un uso intensivo de la **abstracción**, la **herencia** y el **polimorfismo** para permitir que la tienda procese cualquier método de pago de forma genérica.

---

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases y jerarquías:

- **MetodoPago (Clase Abstracta)**
- **TarjetaCredito**
- **Bizum**
- **PayPal**
- **Tienda**
- **AppEcommerce**

Cada una de ellas cumple un rol específico dentro del flujo de la transacción, desde la captura de datos hasta la validación y confirmación del pago.

---

## Clase Abstracta `MetodoPago`

Representa la base del sistema de cobros. Es la clase de la que derivan todos los servicios de pago.

### Funcionalidades
- `procesarPago(double importe)`: Método abstracto que define el contrato obligatorio para todas las subclases, permitiendo que cada método de pago imprima su propia confirmación.

---

## Clase `TarjetaCredito`

Implementa el pago mediante tarjetas bancarias (Débito/Crédito).

### Atributos principales
- `nro_tarjeta`: Cadena de texto que debe contener exactamente 16 dígitos.
- `tipo`: Tipo de tarjeta introducido por el usuario (VISA, MASTERCARD o MAESTRO).

### Funcionalidades
- **validarTarjeta()**: Comprueba que el número tenga la longitud reglamentaria y que la marca de la tarjeta sea una de las tres aceptadas por el sistema.
- **procesarPago()**: Ejecuta la transacción final mostrando el tipo de tarjeta utilizado.

---

## Clase `Bizum`

Representa el método de pago móvil basado en un sistema de PIN de seguridad.

### Atributos principales
- `telefono`: Número telefónico asociado (debe tener 9 dígitos).
- `pin`: Código de seguridad de 6 dígitos generado dinámicamente por el sistema.

### Funcionalidades
- **generarPin()**: Método privado que crea un número aleatorio entre 100.000 y 999.999 cada vez que se inicia una instancia de pago.
- **validarBizum(int pin)**: Verifica que el número de teléfono sea correcto y que el PIN introducido por el usuario coincida exactamente con el generado por la aplicación.

---

## Clase `PayPal`

Gestiona los pagos a través de cuentas de correo electrónico con control de saldo.

### Atributos principales
- `cuenta`: Correo electrónico del usuario.
- `saldo`: Importe disponible en la cuenta (inicializado en 23€ para pruebas).

### Funcionalidades
- **validarPayPal(double importe)**: Implementa una doble validación:
    1. **Formato**: Utiliza una expresión regular para asegurar que el correo pertenece al dominio `@alu.edu.gva.com`.
    2. **Solvencia**: Comprueba si el saldo disponible es suficiente para cubrir el importe de la compra.

---

## Clase `Tienda`

Es el orquestador principal que gestiona la lógica de la tienda y la interfaz con el usuario.

### Funcionalidades
- **iniciarPago()**: Solicita al usuario el método de pago deseado.
- **metodoCliente(String metodo)**: Captura los datos específicos según el tipo de pago elegido y realiza las llamadas a los métodos de validación.
- **realizarPago(MetodoPago metodo)**: Utiliza el polimorfismo para procesar el pago final sin importar qué tipo de objeto (Bizum, PayPal o Tarjeta) se haya creado.

---

## Relaciones entre clases

- **Herencia**: `TarjetaCredito`, `Bizum` y `PayPal` heredan de `MetodoPago`.
- **Uso**: La clase `Tienda` mantiene una relación de uso con `MetodoPago` para ejecutar el cobro de forma genérica.
- **Jerarquía**: El sistema es fácilmente ampliable; para añadir un nuevo método, basta con heredar de la clase base.

---

## Diagrama UML

A continuación se muestra el diagrama UML que representa la arquitectura de clases del proyecto y sus relaciones:

![Diagrama UML del proyecto](img/DiagramaUML%20-%20Ecommerce.png)

---

## Plan de pruebas

Para garantizar la robustez del sistema, se han llevado a cabo 10 pruebas unitarias y de flujo que cubren todos los escenarios posibles, desde errores de validación hasta transacciones exitosas.

A continuación se muestran las capturas de pantalla de la ejecución del programa:

### Pruebas de ejecucción

|      Pruebas (1-5)       | Pruebas (6-10) |
|:------------------------:| :---: |
| ![Prueba 1](img/pr1.png) | ![Prueba 6](img/pr6.png) |
| ![Prueba 2](img/pr2.png) | ![Prueba 7](img/pr7.png) |
| ![Prueba 3](img/pr3.png) | ![Prueba 8](img/pr8.png) |
| ![Prueba 4](img/pr4.png) | ![Prueba 9](img/pr9.png) |
| ![Prueba 5](img/pr5.png) | ![Prueba 10](img/pr10.png) |

---

## Conclusión

Este proyecto permite gestionar de forma eficiente un sistema de pagos digital. Gracias al uso de clases abstractas y polimorfismo, el código es limpio y cumple con los principios de escalabilidad, permitiendo añadir nuevas formas de pago en el futuro sin modificar la estructura principal.