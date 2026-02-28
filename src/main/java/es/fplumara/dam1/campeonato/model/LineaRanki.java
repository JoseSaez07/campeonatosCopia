package es.fplumara.dam1.campeonato.model;

public class LineaRanki {
    private String idDeportista;
    private String nombre;
    private String pais;
    private int puntos;

    public LineaRanki() {
    }

    public String getIdDeportista() {
        return idDeportista;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getPais() {
        return pais;
    }

    public String getNombre() {
        return nombre;
    }
}
