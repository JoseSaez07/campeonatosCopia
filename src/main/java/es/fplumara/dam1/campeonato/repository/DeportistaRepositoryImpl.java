package es.fplumara.dam1.campeonato.repository;

import es.fplumara.dam1.campeonato.model.Deportista;

import java.util.List;
import java.util.Optional;

public class DeportistaRepositoryImpl  implements DeportistaRepository{
    @Override
    public void save(Deportista d) {

    }

    @Override
    public Optional<Deportista> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Deportista> listAll() {
        return List.of();
    }

    @Override
    public List<Deportista> findByPais(String pais) {
        return List.of();
    }
}
