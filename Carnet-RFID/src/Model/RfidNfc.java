package Model;

public class RfidNfc {
    private String idCarnet;
    private String idPersona;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    public RfidNfc(String idCarnet) {
        this.idCarnet = idCarnet;
    }

    public RfidNfc(String idCarnet, String idPersona) {
        this.idCarnet = idCarnet;
        this.idPersona = idPersona;
    }

    public RfidNfc(String idCarnet, String idPersona, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.idCarnet = idCarnet;
        this.idPersona = idPersona;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
    
    public RfidNfc(String idCarnet, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.idCarnet = idCarnet;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
    
    public String getIdCarnet() {
        return idCarnet;
    }
    
    public String getIdPersona() {
        return idPersona;
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
    
    
}