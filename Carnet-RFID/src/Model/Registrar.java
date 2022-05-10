package Model;

public class Registrar {
    private Integer id;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String correo;
    private String last_session;
    private Integer tipo_id;
    private String nombre_tipo;

    public Registrar() {
    }

    public Registrar(Integer id, String usuario, String contraseña, String nombre, String correo, String last_session, Integer tipo_id) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
        this.last_session = last_session;
        this.tipo_id = tipo_id;
    }
    
    public Registrar(String usuario, String contraseña, String nombre, String correo, Integer tipo_id) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
        this.tipo_id = tipo_id;
    }
    
    public Registrar(String usuario, String contraseña, String nombre, String correo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public Integer getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(Integer tipo_id) {
        this.tipo_id = tipo_id;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
}
