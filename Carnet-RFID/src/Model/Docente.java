package Model;

public class Docente {
    private String tipo;
    private String cargo;
    private String facultad;
    private String sede;
    private String idPersonaDocente;
    private String idRfidNfcDocente;

    public Docente(String tipo, String cargo, String facultad, String sede, String idPersonaDocente, String idRfidNfcDocente) {
        this.tipo = tipo;
        this.cargo = cargo;
        this.facultad = facultad;
        this.sede = sede;
        this.idPersonaDocente = idPersonaDocente;
        this.idRfidNfcDocente = idRfidNfcDocente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getIdPersonaDocente() {
        return idPersonaDocente;
    }

    public String getIdRfidNfcDocente() {
        return idRfidNfcDocente;
    }
}
