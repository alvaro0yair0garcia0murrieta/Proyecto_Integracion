# Proyecto_Integracion

bievenidos a este proyecto se trata de un sistema de administracion de aerouertos el cual consta de 3 servicios web: 
api rest para control de empleados, 
api rest para control de estableciento de aeropuerto
y servicio web soap para el registro de pasajeros a un vuelo

## uso en la nube 

BOTON PARA QUE LO UTILISES TU EN LA NUBE!!!
[![Deploy on Railway](https://railway.app/button.svg)](https://railway.app/template/THVYeG?referralCode=VWfeAj)

los servicions listos para consumir estan en la nube via Railway.app

api rest para control de empleados: 
(https://empleadosapirailway-production.up.railway.app/empleados)



api rest para control de estableciento de aeropuerto:
(https://aerouertoapirailway-production.up.railway.app/aeropuertos)

servicio web soap para el registro de pasajeros a un vuelo:
(https://vuelosapirailway-production.up.railway.app/ws/vuelos.wsdl)

## uso local
### requisitos
 - clonar repositorio via git hub
 - mysql service
 - java 17 o mayor
 - configracion inicial de la base de datos (ejecutar el SETUB_DB.sql)
 ### iniciar servicios
 descomprimir zip
  
  para servicio de aeoroueto
```bash
 cd proyecto_integracion
  ./mvnw spring-boot:run
```
si no hay errores se accede la rais en http://localhost:8082/

 para servicio de empleados
```bash
 cd proyecto_integracion/api empleados 
  ./mvnw spring-boot:run
```
si no hay errores se accede la rais en http://localhost:8083/

 para servicio de vuelos
```bash
 cd proyecto_integracion/api_vuelos
  ./mvnw spring-boot:run
```
si no hay errores se accede la rais en http://localhost:8080/ws/vuelos.wsdl
