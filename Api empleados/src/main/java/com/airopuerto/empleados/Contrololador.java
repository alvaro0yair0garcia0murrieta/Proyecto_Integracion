package com.airopuerto.empleados;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personal")
public class Contrololador {
    @Autowired
        private Repositorio repositorio;
    // GET /api/empleados - Obtener todos empleados.
    @GetMapping
    public @ResponseBody Iterable<Empleado> obtenerTodos() {
      return repositorio.findAll();
        // Implementa la lógica para obtener todas las notas de la base de datos 
    }
    
    // GET /api/empleado/{id} - Obtener una nota específica por ID
    @GetMapping("/{id}")
    public @ResponseBody Optional<Empleado> obtenerPorId(@PathVariable int id) {
        
        return repositorio.findById(id);
        // Implementa la lógica para obtener una nota por su ID
    }
    
    // POST /api/empleado - Crear 
    @PostMapping
    public @ResponseBody Empleado crear(@RequestBody Empleado empleado) {
       
        return repositorio.save(empleado); 
        // Implementa la lógica para crear una nueva nota
    }
    
    // Put /api/notas/{id} - Actualizar una nota por ID
    @PutMapping("/{id}")
    public @ResponseBody Empleado actualizarNota(@PathVariable int id, @RequestBody Empleado empleadoNuevo) {
        
        
        return repositorio.findById(id).map(
            empleado ->{
                empleado.setCorreo(empleadoNuevo.getCorreo());
                empleado.setDepatamento(empleadoNuevo.getDepatamento());
                empleado.setNombre(empleadoNuevo.getNombre());
                empleado.setNumeroTefonico(empleadoNuevo.getNumeroTefonico());
                empleado.setPuesto(empleadoNuevo.getPuesto());
                return repositorio.save(empleado);
            }).orElseGet(()->{
                empleadoNuevo.setId(id);
                return repositorio.save(empleadoNuevo);
            });
        // Implementa la lógica para actualizar una nota por su ID
    }
    
    // DELETE /api/notas/{id} - Eliminar una nota por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        Empleado exist = repositorio.findById(id).get();
        repositorio.delete(exist);
        // Implementa la lógica para eliminar una nota por su ID
    }

}
