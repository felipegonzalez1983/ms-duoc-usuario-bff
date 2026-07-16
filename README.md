# 👟 Ecosistema de Microservicios: CloudStride - Calzado e Innovación Textil

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.16-brightgreen?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql)
![JWT](https://img.shields.io/badge/JWT-Autenticación-success?style=for-the-badge)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-green?style=for-the-badge&logo=swagger)
![OpenFeign](https://img.shields.io/badge/OpenFeign-SpringCloud-blueviolet?style=for-the-badge)

---

## 📌 Descripción

Este proyecto implementa una arquitectura de **Microservicios** utilizando **Spring Boot**, siguiendo el patrón **BFF (Backend For Frontend) + BS (Business Service) + BD (Data Service)**.

El sistema fue desarrollado para administrar el negocio ficticio **CloudStride**, dedicado a la comercialización y distribución de calzado e innovación textil.

La solución contempla:

- Gestión de Clientes y Usuarios
- Gestión de Productos
- Gestión de Ventas
- API Gateway
- Seguridad mediante JWT
- Comunicación entre microservicios usando OpenFeign
- Persistencia con Spring Data JPA y MySQL

---

# 🏗 Arquitectura General

> **(Agregar aquí imagen de arquitectura)**

---

# 🔄 Flujo General del Sistema

```text
                 API Gateway (9000)
                        │
        ┌───────────────┼───────────────┐
        │               │               │
        ▼               ▼               ▼
 Usuarios BFF      Productos BFF     Ventas BFF
    8080               8180             8280
        │               │               │
        ▼               ▼               ▼
 Usuarios BS      Productos BS     Ventas BS
    8081               8181             8281
        │               │               │
        ▼               ▼               ▼
 Usuarios BD      Productos BD     Ventas BD
    8082               8182             8282
                │
                ▼
              MySQL
```

---

# 📂 Repositorios del Proyecto

| Módulo | Microservicio | Tipo | Puerto | GitHub |
|:------|:--------------|:------|:------:|:-------|
| 👤 Usuarios | ms-duoc-usuario-bff | BFF | 8080 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-usuario-bff) |
| | ms-duoc-usuario-bs | BS | 8081 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-usuario-bs) |
| | ms-duoc-usuario-bd | BD | 8082 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-usuario-bd) |
| 📦 Productos | ms-duoc-productos-bff | BFF | 8180 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-productos-bff) |
| | ms-duoc-productos-bs | BS | 8181 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-productos-bs) |
| | ms-duoc-productos-bd | BD | 8182 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-productos-bd) |
| 💰 Ventas | ms-duoc-ventas-bff | BFF | 8280 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-ventas-bff) |
| | ms-duoc-ventas-bs | BS | 8281 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-ventas-bs) |
| | ms-duoc-ventas-bd | BD | 8282 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-ventas-bd) |
| 🔐 Seguridad | ms-duoc-api-gateway | API Gateway | 9000 | [Repositorio](https://github.com/felipegonzalez1983/ms-duoc-api-gateway) |

---

# 🛠 Stack Tecnológico

| Tecnología | Descripción |
|------------|-------------|
| ☕ Java 17 | Lenguaje principal |
| 🌱 Spring Boot 3.5.16 | Framework Backend |
| ☁ Spring Cloud OpenFeign | Comunicación entre microservicios |
| 🔐 JWT | Autenticación |
| 📚 Swagger OpenAPI | Documentación REST |
| 🗄 Spring Data JPA | Persistencia |
| 🐬 MySQL | Base de datos |
| 🧩 Lombok | Reducción de código repetitivo |
| ✅ Spring Validation | Validación de datos |

---

# 📁 Arquitectura del Proyecto

```
Cliente
   │
   ▼
API Gateway
   │
   ▼
BFF
   │
   ▼
BS
   │
   ▼
BD
   │
   ▼
MySQL
```

---

# 🔐 Flujo de Autenticación JWT

```
Cliente
   │
POST /auth/login
   │
   ▼
JWT
   │
Bearer Token
   │
API Gateway
   │
Valida Token
   │
Microservicios
```

---

# 🚀 Ejecución Local

Levantar los servicios en el siguiente orden:

1. MySQL

## Usuarios

- ms-duoc-usuario-bd
- ms-duoc-usuario-bs
- ms-duoc-usuario-bff

## Productos

- ms-duoc-productos-bd
- ms-duoc-productos-bs
- ms-duoc-productos-bff

## Ventas

- ms-duoc-ventas-bd
- ms-duoc-ventas-bs
- ms-duoc-ventas-bff

## Gateway

- ms-duoc-api-gateway

---

# 📌 Endpoints Principales

## Autenticación

```
POST /auth/login
```

## Usuarios

```
GET /Usuarios
POST /Usuarios
```

## Productos

```
GET /Productos
POST /Productos
```

## Ventas

```
GET /Ventas
POST /Ventas
```

---

# 📸 Evidencias

## Swagger

<img width="1215" height="644" alt="image" src="https://github.com/user-attachments/assets/4c5fd2d9-7e1e-4f90-9e09-836e1a9d1448" />


---

## Login JWT

<img width="1193" height="596" alt="image" src="https://github.com/user-attachments/assets/e4b68054-0056-4f18-8ebb-52d43e8f9576" />


---

## Consulta de Productos

<img width="1120" height="697" alt="image" src="https://github.com/user-attachments/assets/449f4a52-eafe-4a53-a90f-a22393f6d7aa" />


---

## Consulta de Ventas

<img width="1111" height="715" alt="image" src="https://github.com/user-attachments/assets/793ffcb6-0219-4674-9f2e-cdb6cf009e6c" />


---

## Creación de Venta

> Agregar captura del POST Ventas (201 Created)

---

# ✅ Funcionalidades Implementadas

- ✔ Arquitectura BFF - BS - BD
- ✔ API Gateway
- ✔ JWT
- ✔ OpenFeign
- ✔ Spring Validation
- ✔ Swagger
- ✔ CRUD Usuarios
- ✔ CRUD Productos
- ✔ CRUD Ventas
- ✔ Persistencia MySQL
- ✔ Comunicación entre microservicios
- ✔ Arquitectura desacoplada
- ✔ Principio Database per Service

---

# 👨‍💻 Autor

**Felipe Andrés González Henríquez**

Ingeniería en Informática  
Duoc UC

---

# 📄 Licencia

Proyecto desarrollado exclusivamente con fines académicos para la asignatura de Ingeniería de Software / Arquitectura de Microservicios de **Duoc UC**.
