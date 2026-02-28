package es.fplumara.dam1.campeonato.model;

public class Resultado  implements Puntuable{
    private String id;
    private String idPrueba;
    private Tipoprueba tipoPrueba;
    private String  idDerportista;
    private int posicion;

    public Resultado() {
    }

    public String getId() {
        return id;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getIdDerportista() {
        return idDerportista;
    }

    public Tipoprueba getTipoPrueba() {
        return tipoPrueba;
    }

    public String getIdPrueba() {
        return idPrueba;
    }

    @Override
    public int getPuntos() {
        return 0;
    }
}
