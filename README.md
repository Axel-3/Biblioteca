*Nota: El main se encuentra en la carpeta src/main/java/Backend*
# Sistema de Préstamo de Libros en Java

Este proyecto es una aplicación Java que simula un sistema de préstamo de libros con distintos tipos de usuarios (normal, premium, administrador). La interfaz está desarrollada en Swing y cuenta con manejo de persistencia mediante objetos serializables.

---

## 🧾 Clases principales

### `Main`
La clase de entrada del sistema. Lanza la interfaz principal del menú de usuario:

```java
Menu_usario inicio = new Menu_usario();
inicio.setVisible(true);
```

---

### `Libro`
Esta clase representa un libro dentro del sistema. Incluye atributos como:
- `nombre`
- `Autor`
- `Generos`
- `año`
- `paginas`
- `cantidad`

Implementa el método `buscador(String nombre)` para realizar búsquedas por coincidencia parcial del nombre.

---

### `Favoritos`
Permite almacenar libros favoritos por usuario. Utiliza un `ArrayList<Libro>` estático para manejar los libros marcados.

---

### `Es_numero`
Clase que extiende `Thread` y se encarga de validar si los campos numéricos (`año`, `cantidad`, `paginas`) son válidos. Usa expresiones regulares para comprobar que contengan solo dígitos:

```java
if(paginas.matches("[0-9+]")...)
```

---

### `ValidarInfo`
Gestiona el proceso de autenticación para tres tipos de usuarios:
- `InfoUsuario` para usuarios normales
- `InfoUsuarioPremium` para usuarios premium
- `InfoUsuarioAdmin` para administradores

Incluye manejo de intentos y validación con mensajes `JOptionPane`.

---

## 🔄 Préstamos
El sistema define un patrón de estrategia mediante la interfaz `metodos_prestamo`, implementada por diferentes clases según el tipo de usuario:

---

### `metodos_prestamo`
Interfaz que define el método:

```java
boolean pedir(ArrayList<Libro> libros, Libro libro_p, int indice);
```

---

### `Prestamos_normal`, `Prestamos_premium`, `Prestamos_admin`
Implementan la lógica de préstamo según el rol:
- **Normal**: hasta 3 préstamos por día
- **Premium**: hasta 8 préstamos
- **Admin**: hasta 999999999 (prácticamente sin límite)

Cada implementación valida:
- Disponibilidad del libro
- Límites de préstamo
- Persistencia de libros en archivos `.obj`

```java
libro_p.cantidad = libro_p.cantidad - 1;
libros_prestadin.add(libro_p);
```

Se serializa el estado actualizado a archivos como:
- `Libros/Libros.obj`
- `Libros/Libros_prestados.obj`

---

## 📦 Clase `Pedi`
Actúa como contexto para el patrón estrategia. Recibe una implementación de `metodos_prestamo` y ejecuta el método `pedir()`.

```java
Pedi p = new Pedi(new Prestamos_normal(), libros, libro_p, indice);
p.pedir();
```

---

## 🗂 Estructura de Carpetas

```
├── Backend
│   ├── Libro.java
│   ├── Favoritos.java
│   ├── Es_numero.java
│   ├── Prestamos_normal.java
│   ├── Prestamos_premium.java
│   ├── Prestamos_admin.java
│   ├── Pedi.java
│   ├── ValidarInfo.java
│   ├── Implementacion_prestamo.java
│   └── Main.java
├── Frontend
│   └── Administrador.java
│   └── Bienvenida_admin.java
│   └── Bienvenida_premium.java
│   └── Bienvenida.java
│   └── Editador.java
│   └── Editar_año.java
│   └── Editar_autor.java
│   └── Editar_cantidad.java
│   └── Editar_generos.java
│   └── Editar_nombre.java
│   └── Editar_Paginas.java
│   └── Frontend_premium.java
│   └── Frontend.java
│   └── Frontend_admin.java
│   └── InicioAdmin.java
│   └── InicioPremium.java
│   └── InivioSesion.java
│   └── Mejora_premium.java
│   └── Menu_usuario.java
│   └── Registrarse.java

└── Libros
    ├── Libros.obj
    └── Libros_prestados.obj
    └── Libros_favoritos.obj
    └── Libros_editados.obj

```

---

## 🚀 Requisitos para ejecutar
- Java 8 o superior
- IDE compatible con Swing (ej. NetBeans)
- Carpeta `Libros/` con permisos de escritura

---

## ⚙️ Futuras mejoras
- Integración con base de datos (ej. SQLite o MySQL)
- Registro de usuarios y préstamos con persistencia

---

## © Autor
Desarrollado por **Gutierrez Murillo Axel**.

---

¿Quieres que agregue la parte visual (Interfaces/Frontend) o que incluya instrucciones detalladas para compilar y correr el proyecto?
