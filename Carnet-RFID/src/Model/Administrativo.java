package Model;

public class Administrativo {
   private String cargo;
   private String sede;
   private String idPersonaAdministrativo;
   private String idRfidNfcAdministrativo;

    public Administrativo(String cargo, String sede, String idPersonaAdministrativo, String idRfidNfcAdministrativo) {
        this.cargo = cargo;
        this.sede = sede;
        this.idPersonaAdministrativo = idPersonaAdministrativo;
        this.idRfidNfcAdministrativo = idRfidNfcAdministrativo;
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
