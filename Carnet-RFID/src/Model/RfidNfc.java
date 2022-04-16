package Model;

public class RfidNfc {
    private String idCarnet;
    private String idPersona;

    public RfidNfc(String idCarnet) {
        this.idCarnet = idCarnet;
    }

    public RfidNfc(String idCarnet, String idPersona) {
        this.idCarnet = idCarnet;
        this.idPersona = idPersona;
    }
    
    public String getIdCarnet() {
        return idCarnet;
    }
    
    public String getIdPersona() {
        return idPersona;
    } 
}