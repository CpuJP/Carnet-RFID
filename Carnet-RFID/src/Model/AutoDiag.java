package Model;

public class AutoDiag {
    private Integer idAutoDiag;
    private byte fiebre;
    private byte fatiga;
    private byte cabeza;
    private byte tos;
    private byte malestar;
    private byte musculos;
    private byte contactoCovid19;
    private byte respiracion;
    private byte pecho;
    private byte nariz;
    private byte garganta;
    private byte olores;
    private byte diarrea;
    private float temperatura;
    private byte ingresarElementos;
    private byte bicicleta;
    private byte carro;
    private byte moto;
    private byte portatil;
    private String idPersona;
    private String idRfidNfc;

    public AutoDiag(Integer idAutoDiag, byte fiebre, byte fatiga, byte cabeza, byte tos, byte malestar, byte musculos, byte contactoCovid19, byte respiracion, byte pecho, byte nariz, byte garganta, byte olores, byte diarrea, float temperatura, byte ingresarElementos, byte bicicleta, byte carro, byte moto, byte portatil, String idPersona, String idRfidNfc) {
        this.idAutoDiag = idAutoDiag;
        this.fiebre = fiebre;
        this.fatiga = fatiga;
        this.cabeza = cabeza;
        this.tos = tos;
        this.malestar = malestar;
        this.musculos = musculos;
        this.contactoCovid19 = contactoCovid19;
        this.respiracion = respiracion;
        this.pecho = pecho;
        this.nariz = nariz;
        this.garganta = garganta;
        this.olores = olores;
        this.diarrea = diarrea;
        this.temperatura = temperatura;
        this.ingresarElementos = ingresarElementos;
        this.bicicleta = bicicleta;
        this.carro = carro;
        this.moto = moto;
        this.portatil = portatil;
        this.idPersona = idPersona;
        this.idRfidNfc = idRfidNfc;
    }

    public Integer getIdAutoDiag() {
        return idAutoDiag;
    }

    public byte getFiebre() {
        return fiebre;
    }

    public void setFiebre(byte fiebre) {
        this.fiebre = fiebre;
    }

    public byte getFatiga() {
        return fatiga;
    }

    public void setFatiga(byte fatiga) {
        this.fatiga = fatiga;
    }

    public byte getCabeza() {
        return cabeza;
    }

    public void setCabeza(byte cabeza) {
        this.cabeza = cabeza;
    }

    public byte getTos() {
        return tos;
    }

    public void setTos(byte tos) {
        this.tos = tos;
    }

    public byte getMalestar() {
        return malestar;
    }

    public void setMalestar(byte malestar) {
        this.malestar = malestar;
    }

    public byte getMusculos() {
        return musculos;
    }

    public void setMusculos(byte musculos) {
        this.musculos = musculos;
    }

    public byte getContactoCovid19() {
        return contactoCovid19;
    }

    public void setContactoCovid19(byte contactoCovid19) {
        this.contactoCovid19 = contactoCovid19;
    }

    public byte getRespiracion() {
        return respiracion;
    }

    public void setRespiracion(byte respiracion) {
        this.respiracion = respiracion;
    }

    public byte getPecho() {
        return pecho;
    }

    public void setPecho(byte pecho) {
        this.pecho = pecho;
    }

    public byte getNariz() {
        return nariz;
    }

    public void setNariz(byte nariz) {
        this.nariz = nariz;
    }

    public byte getGarganta() {
        return garganta;
    }

    public void setGarganta(byte garganta) {
        this.garganta = garganta;
    }

    public byte getOlores() {
        return olores;
    }

    public void setOlores(byte olores) {
        this.olores = olores;
    }

    public byte getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(byte diarrea) {
        this.diarrea = diarrea;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public byte getIngresarElementos() {
        return ingresarElementos;
    }

    public void setIngresarElementos(byte ingresarElementos) {
        this.ingresarElementos = ingresarElementos;
    }

    public byte getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(byte bicicleta) {
        this.bicicleta = bicicleta;
    }

    public byte getCarro() {
        return carro;
    }

    public void setCarro(byte carro) {
        this.carro = carro;
    }

    public byte getMoto() {
        return moto;
    }

    public void setMoto(byte moto) {
        this.moto = moto;
    }

    public byte getPortatil() {
        return portatil;
    }

    public void setPortatil(byte portatil) {
        this.portatil = portatil;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public String getIdRfidNfc() {
        return idRfidNfc;
    }
}
