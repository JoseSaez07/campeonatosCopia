package es.fplumara.dam1.campeonato.repository;

import es.fplumara.dam1.campeonato.model.Deportista;

import java.util.*;

public class DeportistaRepositoryImpl  implements DeportistaRepository {
    private Map<String, Deportista> repositorio = new HashMap<>();

    @Override
    public void save(Deportista d) {
        repositorio.put(d.getId(), d);
    }

    @Override
    public Optional<Deportista> findById(String id) {
        Deportista d = repositorio.get(id);
        if (d == null) {
            return Optional.empty();
        } else {
            return Optional.of(d);
        }
    }

    @Override
    public List<Deportista> listAll() {
        return new ArrayList<>(repositorio.values());
    }

    @Override
    public List<Deportista> findByPais(String pais) {
        List<Deportista> resultado = new ArrayList<>();
        for (Deportista es : repositorio.values())
            if (es.getPais().equalsIgnoreCase(pais)) {
                resultado.add(es);
            }
        return resultado;
    }
}
