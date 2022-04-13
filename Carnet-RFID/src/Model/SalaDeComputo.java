package Model;

public class SalaDeComputo {
    private String ingreso;
    private String salida;
    private String salaIngreso;
    private String pcUso;
    private String idPersona;
    private String idRfidNfc;

    public SalaDeComputo(String ingreso, String salida, String salaIngreso, String pcUso, String idPersona, String idRfidNfc) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.salaIngreso = salaIngreso;
        this.pcUso = pcUso;
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

    public String getSalaIngreso() {
        return salaIngreso;
    }

    public void setSalaIngreso(String salaIngreso) {
        this.salaIngreso = salaIngreso;
    }

    public String getPcUso() {
        return pcUso;
    }

    public void setPcUso(String pcUso) {
        this.pcUso = pcUso;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public String getIdRfidNfc() {
        return idRfidNfc;
    }
}
