package es.fplumara.dam1.campeonato.service;

import es.fplumara.dam1.campeonato.model.Deportista;

import java.util.HashMap;
import java.util.Map;

public class CampeonatoService {
    private Map<String, Deportista> repositorio = new HashMap<>();

    public void registrarDeportista(Deportista d) {

        if (d == null) {
            throw new IllegalArgumentException("El deportista no puede ser nulo ni vacío");
        }

        if (d.getId() == null || d.getId().isEmpty()) {
            throw new IllegalArgumentException("El id no puede ser null ni vacío");
        }
    }
}