package com.aeropuerto.empleados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SpringBootApplication
public class EmpleadosApplication {
	@Autowired
	private Repositorio repositorio;
	public static void main(String[] args) {
		SpringApplication.run(EmpleadosApplication.class, args);
	}
	//curl -X GET localhost:8080/
	@GetMapping("/")
	public String returnRoot(){
		return "Esta es la raiz";
	}

	@GetMapping(value="/empleado")
	public List<Empleado> getMethodName() {
		Iterable<Empleado> empleados = repositorio.findAll();
   		List<Empleado> empleadosList = new ArrayList<>();
   		empleados.forEach(empleadosList::add); 
		return empleadosList;
	}
	@GetMapping(value = "/empleado/{nombre}")
	public Empleado getAeropuertoByNombre(@PathVariable String nombre){
		Empleado empleado = repositorio.findByNombre(nombre);
		return empleado;
	}
	//no se pueden poner nombres iguales porque crachea la api
	@PostMapping(value = "/empleado")
	public Empleado postAeropuerto(@RequestBody Empleado empleado){
		repositorio.save(empleado);
		return empleado;
	}
	@DeleteMapping(value = "/empleado/{nombre}")
	public Empleado deleteAeropuertoByNombre(@PathVariable String nombre){
		Empleado empleado = repositorio.findByNombre(nombre);
		repositorio.delete(empleado);
		return empleado;
	}
	/*private String nombre;
    private  String correo;
    private  String numeroTefonico;
    private String depatamento;
    private String puesto; */
	@PatchMapping(value = "/empleado/{nombre}")
	public Empleado PatchAeropuerto(@PathVariable String nombre,@RequestBody Empleado empleado){
		Empleado empTemp = repositorio.findByNombre(nombre);
		empTemp.setCorreo(empleado.getCorreo());
		empTemp.setNombre(empleado.getNombre());
		empTemp.setNumeroTelefonico(empleado.getNumeroTelefonico());
		empTemp.setDepartamento(empleado.getDepartamento());
		empTemp.setPuesto(empleado.getPuesto());
		empTemp = repositorio.save(empTemp);
		return empTemp;
	}

}
