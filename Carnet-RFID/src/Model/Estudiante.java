package Model;

public class Estudiante {
    private String facultad;
    private String carrera;
    private String sede;
    private Integer semestre;
    private String idPersonaEstudiante;
    private String idRfidNfcEstudiante;

    public Estudiante(String facultad, String carrera, String sede, Integer semestre, String idPersonaEstudiante, String idRfidNfcEstudiante) {
        this.facultad = facultad;
        this.carrera = carrera;
        this.sede = sede;
        this.semestre = semestre;
        this.idPersonaEstudiante = idPersonaEstudiante;
        this.idRfidNfcEstudiante = idRfidNfcEstudiante;
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
