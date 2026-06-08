![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Final Transversal – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Beatriz López Casanova
- **Sección:** POO I
- **Carrera:** Analista Programador Computacional
- **Sede:** Virtual

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la sumativa n°1 de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema orientado a objetos desarrollado en Java que modela una **agencia de turismo** en la región de Llanquihue, gestionando clientes, guías, proveedores y tours.

El sistema aplica encapsulamiento, herencia, composición y manejo de excepciones. Incluye validación de RUT chileno y simula dos escenarios de tours (gastronómico y de aventura) desde consola.

---

## 🧱 Estructura general del proyecto

```plaintext
Agencia-turismo-s3/
├── pom.xml                          # Configuración del proyecto Maven
├── README.md
└── src/
    └── main/
        └── java/
            └── org/
                └── agencia/
                    ├── app/
                    │   └── Main.java              # Punto de entrada de la aplicación
                    ├── model/
                    │   ├── Persona.java           # Clase base (nombre, apellido, RUT)
                    │   ├── Cliente.java           # Cliente de la agencia (hereda de Persona)
                    │   ├── Guia.java              # Guía turístico (hereda de Persona)
                    │   ├── Proveedor.java         # Proveedor de servicios (hereda de Persona)
                    │   ├── Contrato.java          # Contrato laboral del guía
                    │   └── Tour.java              # Agrupa cliente, guía y proveedor
                    └── util/
                        ├── RutValidador.java      # Validación de formato de RUT
                        └── RutInvalidoException.java  # Excepción de RUT inválido
```

### Paquetes y responsabilidades

| Paquete | Descripción |
|---------|-------------|
| `org.agencia.app` | Contiene la clase `Main` con la simulación de los tours |
| `org.agencia.model` | Clases del dominio: personas, contratos y tours |
| `org.agencia.util` | Utilidades de validación y excepciones personalizadas |

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

### Requisitos previos

- [Java JDK 26](https://www.oracle.com/java/technologies/downloads/) (o la versión configurada en el proyecto)
- [Maven](https://maven.apache.org/download.cgi) (opcional, para compilar desde terminal)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (recomendado) u otro IDE compatible con Java

### 1. Clonar el repositorio

```bash
git clone https://github.com/Be-ri-lo/agencia-turismo-s3.git
cd agencia-turismo-s3
```

### 2. Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Selecciona **Open** y elige la carpeta `agencia-turismo-s3`.
3. Espera a que Maven importe las dependencias del `pom.xml`.
4. Verifica que el SDK del proyecto sea **Java 26**.

### 3. Ejecutar desde IntelliJ IDEA

1. Navega a `src/main/java/org/agencia/app/Main.java`.
2. Haz clic derecho sobre el archivo y selecciona **Run 'Main.main()'**.
3. Revisa la salida en la consola: se mostrarán las fichas de los dos tours simulados.

### Salida esperada

Al ejecutar correctamente, la consola mostrará el título de la agencia y las fichas de dos tours:

- Tour cultural/gastronómico (Kuchen tradicional en Frutillar)
- Tour de aventura (Rafting en Saltos del Petrohué)

Si algún RUT no cumple el formato válido (`XXXXXXXX-Y`), se capturará la excepción `RutInvalidoException` y se mostrará un mensaje de error.


---

**Repositorio GitHub:** https://github.com/Be-ri-lo/agencia-turismo-s3
**Fecha de entrega:** \[DD/MM/2025]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Final Transversal EFT



