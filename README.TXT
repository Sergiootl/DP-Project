# 🎾 DP TENNIS: Simulación de Campeonato con Patrones de Diseño (Java)

**Autores:** Sergio Terrazas Lobato e Ismael Acedo Acedo

Este proyecto implementa un motor de simulación para un torneo de tenis basado en el **Diseño Orientado a Objetos (POO) avanzado** y la aplicación de **Patrones de Diseño** para garantizar la modularidad, la escalabilidad y el bajo acoplamiento.

El objetivo principal es simular un torneo de eliminación directa donde la puntuación y el rendimiento de los participantes dependen de su habilidad base y el tipo de equipamiento (zapatillas, raquetas).

---

## 1. Arquitectura de Software y Patrones de Diseño

El diseño está optimizado para el **bajo acoplamiento** y la **modularidad**, con una aplicación estricta de Patrones de Diseño GoF.

### 1.1. Patrones de Diseño

| Patrón | Clases Involucradas | Propósito |
| :--- | :--- | :--- |
| **OBSERVER** | `MedioDeportivo`, `MedioGeneralista`, `MedioSensacionalista` | Utilizado para notificar los resultados de los partidos a los distintos **medios de comunicación** de forma desacoplada. |
| **SINGLETON** | `Campeonato` | Garantiza una única instancia central del torneo para controlar el estado y los recursos. |

### 1.2. Diseño POO Avanzado

* **Polimorfismo por Herencia:** La clase base `Tenista` se extiende a subtipos (`Golpeadores`, `Voleadores`) que sobrescriben el método de puntuación (`golpear()`) para aplicar una lógica de juego especializada.
* **Lógica Modular con Enums:** Se utilizan **Enums con estado** (`EstiloEncordado`) para encapsular los factores de modificación de atributos (multiplicadores de Potencia/Control), separando la lógica de negocio de las clases principales.
* **JUnit:** Se implementó **testing unitario** en clases clave (`Zapatillas`, `RaquetaGenerica`) para validar la robustez de las reglas del juego.

---

## 2. Estructuras de Datos y Algoritmos

La gestión de colecciones y el flujo de la simulación demuestran un manejo avanzado de las estructuras de datos de Java.

### 2.1. Comparadores y Asignación de Recursos

Se utilizan múltiples `Comparator` para optimizar el control de flujo y la gestión de recursos:

| Comparator | Propósito | Aplicación |
| :--- | :--- | :--- |
| **`PotenciaComparator`** | Priorización de recursos | Ordena las **raquetas** (asumiendo su uso con `TreeSet`) para la asignación prioritaria a los tenistas. |
| **`EliminadosComparator`** | Ordenamiento de salida | Clasifica a los tenistas eliminados por la posición en la que salieron del torneo. |
| **`PointComparator`** | Lógica de partido | Determina el **ganador** de una ronda comparando los puntos acumulados. |

### 2.2. Flujo de Ejecución

1.  **Carga de Datos:** La clase `Init` carga los tenistas, zapatillas y raquetas.
2.  **Inicialización:** El método `Torneo` de la clase `Campeonato` gestiona el flujo de eliminación.
3.  **Asignación de Raquetas:** Se utiliza el patrón **Iterator** en la clase `Campeonato` para recorrer y asignar las raquetas ordenadas por potencia.
4.  **Output:** Se genera un **fichero de texto de salida** para registrar todos los eventos del campeonato.

---

## 3. Archivos Clave del Proyecto

| Archivo | Rol en el Sistema | Concepto Principal |
| :--- | :--- | :--- |
| **`Campeonato.java`** | Motor de Simulación | Singleton / Sujeto (Observer) |
| **`Medio*.java`** | Observadores | Patrón Observer |
| **`PotenciaComparator.java`** | Lógica de ordenación | Gestión de Colecciones Avanzada |
| **`Tenista.java`** | Clase Base de Jugadores | Herencia / Polimorfismo |
| **`EstiloEncordado.java`** | Multiplicadores de Stats | Enum con Estado |
