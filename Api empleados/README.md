# API de Gestión de Empleados

La API de Gestión de Empleados proporciona puntos finales para administrar los datos de los empleados, permitiéndote realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los registros de los empleados.

## Prerrequisitos

- Java Development Kit (JDK) 8 o superior
- Maven

## Empezando

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu-nombre-de-usuario/api-gestion-empleados.git
   ```

2. Navega hasta el directorio del proyecto:

   ```bash
   cd api-gestion-empleados
   ```

3. Compila el proyecto:

   ```bash
   mvn clean install
   ```

4. Ejecuta la aplicación:

   ```bash
   mvn spring-boot:run
   ```

5. La API estará disponible en `http://localhost:8080/api/empleados`.

## Puntos finales de la API

Los siguientes puntos finales están disponibles en la API:

- `GET /api/empleados`: Obtener una lista de todos los empleados.
- `POST /api/empleados`: Crear un nuevo empleado.
- `GET /api/empleados/{id}`: Obtener un empleado específico por su ID.
- `PUT /api/empleados/{id}`: Actualizar un empleado específico por su ID.
- `DELETE /api/empleados/{id}`: Eliminar un empleado específico por su ID.

### Ejemplos de solicitud/respuesta

#### Obtener una lista de todos los empleados

- Solicitud:

  ```
  GET /api/empleados
  ```

- Respuesta:

  ```json
  HTTP/1.1 200 OK
  Content-Type: application/json
  
  [
    {
      "id": 1,
      "nombre": "Juan Pérez",
      "email": "juan.perez@example.com",
      "telefono": "+1 123-456-7890",
      "departamento": "IT",
      "cargo": "Ingeniero de Software"
    },
    {
      "id": 2,
      "nombre": "María Gómez",
      "email": "maria.gomez@example.com",
      "telefono": "+1 987-654-3210",
      "departamento": "Recursos Humanos",
      "cargo": "Gerente de RRHH"
    }
  ]
  ```

#### Crear un nuevo empleado

- Solicitud:

  ```
  POST /api/empleados
  Content-Type: application/json
  
  {
    "nombre": "Ana Torres",
    "email": "ana.torres@example.com",
    "telefono": "+1 555-123-4567",
    "departamento": "Marketing",
    "cargo": "Especialista en Marketing"
  }
  ```

- Respuesta:

  ```json
  HTTP/1.1 201 Created
  Content-Type: application/json
  
  {
    "id": 3,
    "nombre": "Ana Torres",
    "email": "ana.torres@example.com",
    "telefono": "+1 555-123-4567",
    "departamento": "Marketing",
    "cargo": "Especialista en Marketing"
  }
  ```

#### Actualizar un empleado

- Solicitud:

  ```
  PUT /api/empleados/3
  Content-Type: application

/json
  
  {
    "nombre": "Ana Thompson",
    "email": "ana.thompson@example.com",
    "telefono": "+1 555-987-6543",
    "departamento": "Marketing",
    "cargo": "Especialista Senior en Marketing"
  }
  ```

- Respuesta:

  ```json
  HTTP/1.1 200 OK
  Content-Type: application/json
  
  {
    "id": 3,
    "nombre": "Ana Thompson",
    "email": "ana.thompson@example.com",
    "telefono": "+1 555-987-6543",
    "departamento": "Marketing",
    "cargo": "Especialista Senior en Marketing"
  }
  ```

#### Eliminar un empleado

- Solicitud:

  ```
  DELETE /api/empleados/3
  ```

- Respuesta:

  ```json
  HTTP/1.1 204 No Content
  ```

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejoras, no dudes en enviar un pull request.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
```

Siéntete libre de personalizar el contenido según tus necesidades específicas y agregar cualquier sección o información adicional que consideres relevante.
![alt text](http://3.bp.blogspot.com/-x2uhTuWFGoc/VmfELLZ0d5I/AAAAAAAAMWM/k_qBiNiQTk4/s1600/Animal-01.jpg)