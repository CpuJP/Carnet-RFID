package Model;

public class Administrativo {
   private String idPersona;
   private String tipoId;
   private String codigo;
   private String primerNombre;
   private String segundoNombre;
   private String primerApellido;
   private String segundoApellido;
   private String email;
   private String celular;
   private String cargo;
   private String sede;
   private String idPersonaAdministrativo;
   private String idRfidNfcAdministrativo;

    public Administrativo(String idPersona, String tipoId, String codigo, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String email, String celular, String cargo, String sede) {
        this.idPersona = idPersona;
        this.tipoId = tipoId;
        this.codigo = codigo;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
        this.celular = celular;
        this.cargo = cargo;
        this.sede = sede;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getIdPersonaAdministrativo() {
        return idPersonaAdministrativo;
    }

    public String getIdRfidNfcAdministrativo() {
        return idRfidNfcAdministrativo;
    }
}
