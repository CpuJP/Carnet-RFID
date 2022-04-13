package Model;

public class Laboratorio {
    private String ingreso;
    private String salida;
    private String idPersona;
    private String idRfidNfc;

    public Laboratorio(String ingreso, String salida, String idPersona, String idRfidNfc) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.idPersona = idPersona;
        this.idRfidNfc = idRfidNfc;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public String getIdRfidNfc() {
        return idRfidNfc;
    }
}
