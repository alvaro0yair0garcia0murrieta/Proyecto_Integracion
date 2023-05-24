package com.notas.notas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repositorio {
    private Map<Integer, Nota> notas;
    private int nextId;

    public Repositorio() {
        notas = new HashMap<>();
        nextId = 1;
    }

    public List<Nota> consegirNotas() {
        return new ArrayList<>(notas.values());
    }

    public Nota consegirNotaPorId(int id) {
        return notas.get(id);
    }

    public Nota crear(Nota nota) {
        nota.setId(nextId);
        nextId++;
        notas.put(nota.getId(), nota);
        return nota;
    }

    public Nota actualizar(Nota notaActualizada) {
        int id = notaActualizada.getId();
        if (notas.containsKey(id)) {
            notas.put(id, notaActualizada);
            return notaActualizada;
        }
        return null;
    }

    public boolean borrar(int id) {
        return notas.remove(id) != null;
    }
}
