package com.notas.notas;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notas")
public class Contrololador {
    Repositorio repositorio = new Repositorio();
    // GET /api/notas - Obtener todas las notas
    @GetMapping
    public List<Nota> obtenerTodasLasNotas() {
      return repositorio.consegirNotas();
        // Implementa la lógica para obtener todas las notas de la base de datos u otro mecanismo de almacenamiento
    }
    
    // GET /api/notas/{id} - Obtener una nota específica por ID
    @GetMapping("/{id}")
    public Nota obtenerNotaPorId(@PathVariable int id) {
        
        return repositorio.consegirNotaPorId(id);
        // Implementa la lógica para obtener una nota por su ID
    }
    
    // POST /api/notas - Crear una nueva nota
    @PostMapping
    public Nota crearNota(@RequestBody Nota nota) {
       nota.setDia(new Date());
       Nota notaNueva = repositorio.crear(nota);
        return notaNueva;
        // Implementa la lógica para crear una nueva nota
    }
    
    // PUT /api/notas/{id} - Actualizar una nota por ID
    @PutMapping("/{id}")
    public Nota actualizarNota(@PathVariable int id, @RequestBody Nota notaActualizada) {
        Nota  notaExistente = repositorio.consegirNotaPorId(id);
        notaExistente.setTitulo(notaActualizada.getTitulo());
        notaExistente.setContenido(notaActualizada.getContenido());
        return repositorio.actualizar(notaExistente);
        // Implementa la lógica para actualizar una nota por su ID
    }
    
    // DELETE /api/notas/{id} - Eliminar una nota por ID
    @DeleteMapping("/{id}")
    public void eliminarNota(@PathVariable int id) {
        repositorio.borrar(id);
        // Implementa la lógica para eliminar una nota por su ID
    }

}
