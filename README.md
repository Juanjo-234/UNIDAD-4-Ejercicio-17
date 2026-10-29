Resolución del ejercicio N°17 de la unidad 4 de programación 2.
El programa simula un sistema corporativo de liquidación de sueldos y cálculo de bonos anuales aplicando los principios de la Programación Orientada a Objetos (POO). Su propósito principal es demostrar el uso de clases abstractas, herencia y polimorfismo para procesar los ingresos totales de distintos perfiles de empleados (ventas, sistemas, recursos humanos) de manera unificada, aplicando reglas de cálculo diferenciales para los bonos sin necesidad de utilizar estructuras condicionales explícitas (como instanceof o if/else por tipo de clase).

Clases y Componentes Utilizados
TrabajadorCorporativo (Clase Abstracta)

Propósito: Actúa como la plantilla base para cualquier empleado de la corporación. Define atributos comunes como nombre y sueldoBase, y declara el método abstracto double calcularBonoAnual(), obligando a las clases hijas a implementar su propia lógica de bonificación o comisiones.

EmpleadoVentas (Clase Concreta / Hija)

Propósito: Modela a un trabajador del área de ventas. Sobrescribe el método de cálculo del bono incorporando porcentajes de comisión basados en el volumen de ventas o cumplimiento de metas comerciales.

EmpleadoSistemas (Clase Concreta / Hija)

Propósito: Modela a un empleado del área técnica o desarrollo. Implementa su propio cálculo de bono anual considerando premios por objetivos tecnológicos, entregas de proyectos o guardias.

EmpleadoRRHH (Clase Concreta / Hija)

Propósito: Modela a un colaborador de recursos humanos. Aplica una regla de cálculo diferencial basada en métricas de retención de personal, clima laboral o cumplimiento de objetivos del área.

LiquidadorSueldos (Clase Coordinadora)

Propósito: Funciona como el procesador central de haberes. Recibe una referencia de tipo TrabajadorCorporativo y calcula el monto total a abonar (sumando el sueldo base y el bono anual) de forma completamente polimórfica, desconociendo la subclase específica que está procesando.
<img width="577" height="561" alt="Captura de pantalla 2026-10-29 153635" src="https://github.com/user-attachments/assets/ae9f623d-9cee-4292-88b1-0034b404263a" />
