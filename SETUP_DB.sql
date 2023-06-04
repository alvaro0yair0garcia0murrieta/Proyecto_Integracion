# inicializador de la base de datos 
# usuario para los tres servicios 
CREATE USER yo IDENTIFIED BY '123';  

#BASE DE DATOS POR SERVICIO
CREATE DATABASE empleados;
CREATE DATABASE aeropuerto;
CREATE DATABASE vuelos;

#privilegios
GRANT ALL PRIVILEGES ON aeropuerto.* TO 'yo'@'%';
GRANT ALL PRIVILEGES ON empleados.* TO 'yo'@'%';
GRANT ALL PRIVILEGES ON vuelos.* TO 'yo'@'%';