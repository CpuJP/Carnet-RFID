package Model;

public class Egresado {
    private String idPersona;
    private String tipoId;
    private String codigo;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String celular;
    private String facultad;
    private String carrera;
    private String anioProm;
    private String idPersonaEgresado;
    private String idRfidNfcEgresado;

    public Egresado(String idPersonaEgresado, String tipoId, String codigo, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String email, String celular, String facultad, String carrera, String anioProm) {
        this.idPersonaEgresado = idPersonaEgresado;
        this.tipoId = tipoId;
        this.codigo = codigo;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
        this.celular = celular;
        this.facultad = facultad;
        this.carrera = carrera;
        this.anioProm = anioProm;
    }
    
    public Egresado(String facultad, String carrera, String anioProm, String idPersonaEgresado, String idRfidNfcEgresado){
        this.idPersonaEgresado = idPersonaEgresado;
        this.facultad = facultad;
        this.carrera = carrera;
        this.anioProm = anioProm;
        this.idRfidNfcEgresado = idRfidNfcEgresado;
    }
    
    public Egresado(String facultad, String carrera, String anioProm, String idPersonaEgresado){
        this.idPersonaEgresado = idPersonaEgresado;
        this.facultad = facultad;
        this.carrera = carrera;
        this.anioProm = anioProm;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
