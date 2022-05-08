package Model;

public class Estudiante {
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
    private String sede;
    private Integer semestre;
    private String idPersonaEstudiante;
    private String idRfidNfcEstudiante;

    public Estudiante(String idPersona, String tipoId, String codigo, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String email, String celular, String facultad, String carrera, String sede, Integer semestre) {
        this.idPersona = idPersona;
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
        this.sede = sede;
        this.semestre = semestre;
    }
    
    public Estudiante(String facultad, String carrera, String sede, Integer semestre, String idPersonaEstudiante, String idRfidNfcEstudiante){
        this.facultad = facultad;
        this.carrera = carrera;
        this.sede = sede;
        this.semestre = semestre;
        this.idPersonaEstudiante = idPersonaEstudiante;
        this.idRfidNfcEstudiante = idRfidNfcEstudiante;
    }
    
    public Estudiante(String facultad, String carrera, String sede, Integer semestre, String idPersonaEstudiante){
        this.facultad = facultad;
        this.carrera = carrera;
        this.sede = sede;
        this.semestre = semestre;
        this.idPersonaEstudiante = idPersonaEstudiante;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getIdPersonaEstudiante() {
        return idPersonaEstudiante;
    }

    public String getIdRfidNfcEstudiante() {
        return idRfidNfcEstudiante;
    }
}
