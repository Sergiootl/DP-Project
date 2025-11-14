# 🎾 DP TENNIS: Simulación de Campeonato con Patrones de Diseño (Java)

**Autores:** Sergio Terrazas Lobato e Ismael Acedo Acedo

Este proyecto implementa un motor de simulación para un torneo de tenis basado en el **Diseño Orientado a Objetos (POO) avanzado** y la aplicación de **Patrones de Diseño** para garantizar la modularidad, la escalabilidad y el bajo acoplamiento.

El objetivo principal es simular un torneo de eliminación directa donde la puntuación y el rendimiento de los participantes dependen de su habilidad base y el tipo de equipamiento (zapatillas, raquetas).

---

## 🚀 1. Arquitectura de Software y Patrones de Diseño

El diseño está optimizado para el **bajo acoplamiento** y la **modularidad**, usando patrones clave de diseño.

### Patrones de Diseño (GoF)

| Patrón | Clases Involucradas | Propósito |
| :--- | :--- | :--- |
| **OBSERVER** | `MedioDeportivo`, `MedioGeneralista`, `MedioSensacionalista` | Utilizado para notificar los resultados a los **medios de comunicación** de forma desacoplada (Tercera Entrega). |
| **SINGLETON** | `Campeonato` | Garantiza una **única instancia central** del torneo para controlar el estado y los recursos. |

### Diseño POO Avanzado 💡

* **Polimorfismo por Herencia:** La clase `Tenista` se extiende a subtipos como **`Golpeadores`** y **`Voleadores`**. Cada uno sobrescribe el método de puntuación (`golpear()`) para aplicar su **lógica de juego especializada**.
* **Lógica Modular con Enums:** Se utiliza el **Enum con estado** (`EstiloEncordado`) para encapsular los **multiplicadores** de Potencia/Control del equipamiento, manteniendo el código limpio.
* **JUnit:** Implementación de **testing unitario** en clases clave (`Zapatillas`, `RaquetaGenerica`) para validar la robustez de las reglas del juego.

---

## 📊 2. Estructuras de Datos y Algoritmos

La gestión de colecciones se realiza con criterios específicos para optimizar la simulación.

### Asignación de Recursos por Prioridad

* **`PotenciaComparator`** y **`Iterator`**: Se utiliza un `Comparator` para ordenar las **raquetas** por potencia (asumiendo su uso con `TreeSet`), lo que permite el uso de un **Iterator** en la clase `Campeonato` para asignar de manera eficiente los mejores recursos a los tenistas de mayor prioridad.
* **`EliminadosComparator` y `PointComparator`**: Comparadores específicos que definen los criterios de ordenación de los tenistas eliminados y la lógica de victoria en cada partido.

### Flujo de Ejecución

1.  **Carga de Datos:** La clase **`Init`** carga tenistas, zapatillas y raquetas.
2.  **Torneo:** El método `Torneo` de la clase `Campeonato` gestiona el flujo de **eliminación directa** por rondas.
3.  **Output:** Se genera un **fichero de texto de salida** para registrar el historial completo del campeonato.

---

## 📁 3. Archivos Clave del Proyecto

| Archivo | Rol en el Sistema | Concepto Principal |
| :--- | :--- | :--- |
| **`Campeonato.java`** | Motor de Simulación Central | Singleton / Sujeto (Observer) |
| **`Medio*.java`** | Clases de *Reporting* | Patrón Observer (Tercera Entrega) |
| **`PotenciaComparator.java`** | Lógica de ordenación | Gestión de Colecciones Avanzada |
| **`Tenista.java`** | Clase Base de Jugadores | Herencia / Polimorfismo |
| **`EstiloEncordado.java`** | Multiplicadores de Stats | Enum con Estado (Segunda Entrega) |
