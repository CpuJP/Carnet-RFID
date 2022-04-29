package Model;

public class PersonalUniversidad {          
    private String idPersona;
    private String tipoId;
    private String RfidNfcIdCarnet;
    private String codigo;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private String genero;
    private String email;
    private String celular;

    public PersonalUniversidad(String idPersona, String tipoId, String RfidNfcIdCarnet, String codigo, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String fechaNacimiento, String genero, String email, String celular) {
        this.idPersona = idPersona;
        this.tipoId = tipoId;
        this.RfidNfcIdCarnet = RfidNfcIdCarnet;
        this.codigo = codigo;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.email = email;
        this.celular = celular;
    }
    
    public PersonalUniversidad(String idPersona, String tipoId, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String fechaNacimiento, String genero, String email, String celular){
        this.idPersona = idPersona;
        this.tipoId = tipoId;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.email = email;
        this.celular = celular;
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

    public String getRfidNfcIdCarnet() {
        return RfidNfcIdCarnet;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
}
