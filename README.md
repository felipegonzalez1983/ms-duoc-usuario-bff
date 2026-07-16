## Matriz de Servicios y Puertos (Repositorios Activos)

El ecosistema está compuesto por diez microservicios distribuidos en tres módulos (Usuarios, Productos y Ventas), además de un API Gateway que centraliza el acceso a todos los servicios.

| Módulo | Microservicio | Tipo/Capa | Puerto | Repositorio GitHub |
| :--- | :--- | :--- | :---: | :--- |
| **Clientes y Usuarios** | `ms-duoc-usuario-bff` | BFF (Orquestador) | **8080** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-usuario-bff) |
| | `ms-duoc-usuario-bs` | BS (Negocio) | **8081** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-usuario-bs) |
| | `ms-duoc-usuario-bd` | BD (Datos) | **8082** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-usuario-bd) |
| **Productos** | `ms-duoc-productos-bff` | BFF (Orquestador) | **8180** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-productos-bff) |
| | `ms-duoc-productos-bs` | BS (Negocio) | **8181** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-productos-bs) |
| | `ms-duoc-productos-bd` | BD (Datos) | **8182** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-productos-bd) |
| **Ventas** | `ms-duoc-ventas-bff` | BFF (Orquestador) | **8280** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-ventas-bff) |
| | `ms-duoc-ventas-bs` | BS (Negocio) | **8281** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-ventas-bs) |
| | `ms-duoc-ventas-bd` | BD (Datos) | **8282** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-ventas-bd) |
| **Seguridad** | `ms-duoc-api-gateway` | API Gateway + JWT | **9000** | [Ver Repositorio 🔗](https://github.com/felipegonzalez1983/ms-duoc-api-gateway) |
