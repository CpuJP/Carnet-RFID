package Model;

public class Prestamos {
    private Integer idPrestamo;
    private String nombreObjeto;
    private String inicioPrestamo;
    private String finalPrestamo;
    private String origen;
    private String idPersona;
    private String idRfidNfc;

    public Prestamos(Integer idPrestamo, String nombreObjeto, String inicioPrestamo, String finalPrestamo, String origen, String idPersona, String idRfidNfc) {
        this.idPrestamo = idPrestamo;
        this.nombreObjeto = nombreObjeto;
        this.inicioPrestamo = inicioPrestamo;
        this.finalPrestamo = finalPrestamo;
        this.origen = origen;
        this.idPersona = idPersona;
        this.idRfidNfc = idRfidNfc;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getInicioPrestamo() {
        return inicioPrestamo;
    }

    public void setInicioPrestamo(String inicioPrestamo) {
        this.inicioPrestamo = inicioPrestamo;
    }

    public String getFinalPrestamo() {
        return finalPrestamo;
    }

    public void setFinalPrestamo(String finalPrestamo) {
        this.finalPrestamo = finalPrestamo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public String getIdRfidNfc() {
        return idRfidNfc;
    }
}
