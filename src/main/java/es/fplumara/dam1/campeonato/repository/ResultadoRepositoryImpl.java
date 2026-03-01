package es.fplumara.dam1.campeonato.repository;

import es.fplumara.dam1.campeonato.model.Resultado;

import java.util.*;

public class ResultadoRepositoryImpl  implements  ResultadoRepository{
    private Map<String,Resultado> resultados =new HashMap<>();
    @Override
    public void save(Resultado r) {
        resultados.put(r.getId(),r);
    }

    @Override
    public Optional<Resultado> findById(String id) {
       Resultado r = resultados.get(id);
       if (r == null){
           return Optional.empty();
       }else{
           return Optional.of(r);
       }

    }

    @Override
    public Optional<ArrayList<Resultado>> listAll() {
        return Optional.of(new ArrayList<>(resultados.values()));
    }

    @Override
    public boolean existByPruebaYDeportista(String idPrueba, String idDeportista) {
        return false;
    }
}
