package es.fplumara.dam1.campeonato.repository;

import es.fplumara.dam1.campeonato.model.Resultado;

import java.util.ArrayList;
import java.util.Optional;

public interface ResultadoRepository {
        void save(Resultado r);
        Optional<Resultado> findById(String id);
        Optional<ArrayList<Resultado>> listAll();
        boolean existByPruebaYDeportista(String idPrueba,String idDeportista);

}
