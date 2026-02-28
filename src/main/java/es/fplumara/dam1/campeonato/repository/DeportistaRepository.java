package es.fplumara.dam1.campeonato.repository;

import es.fplumara.dam1.campeonato.model.Deportista;

import java.util.List;
import java.util.Optional;

public interface DeportistaRepository {
    public abstract void save(Deportista d);
    public abstract Optional<Deportista> findById(String id);
    public abstract List<Deportista> listAll();
    public abstract List<Deportista> findByPais(String pais);

}
