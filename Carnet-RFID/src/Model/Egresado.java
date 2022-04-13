package Model;

public class Egresado {
    private String facultad;
    private String carrera;
    private String anioProm;
    private String idPersonaEgresado;
    private String idRfidNfcEgresado;

    public Egresado(String facultad, String carrera, String anioProm, String idPersonaEgresado, String idRfidNfcEgresado) {
        this.facultad = facultad;
        this.carrera = carrera;
        this.anioProm = anioProm;
        this.idPersonaEgresado = idPersonaEgresado;
        this.idRfidNfcEgresado = idRfidNfcEgresado;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAnioProm() {
        return anioProm;
    }

    public void setAnioProm(String anioProm) {
        this.anioProm = anioProm;
    }

    public String getIdPersonaEgresado() {
        return idPersonaEgresado;
    }

    public String getIdRfidNfcEgresado() {
        return idRfidNfcEgresado;
    }
}
