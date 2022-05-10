package DAO;

import Controller.ConexionBD;
import Model.Registrar;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrarDAO {

    public boolean createUsuario(Registrar rg) throws FileNotFoundException, SQLException {
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            } else {
                System.out.println("Problemas al conectar");
            }
            String sql = "INSERT INTO usuario (usuario, contraseña, nombre, correo, id_tipo) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, rg.getUsuario());
            statement.setString(2, rg.getContraseña());
            statement.setString(3, rg.getNombre());
            statement.setString(4, rg.getCorreo());
            statement.setInt(5, rg.getTipo_id());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int validarUsuario(String usuario) throws FileNotFoundException, SQLException {
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            } else {
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT count(id) FROM usuario WHERE usuario = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, usuario);
            rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }

    public boolean exiteEmail(String correo) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }

    public boolean LoginUsuario(Registrar rg) throws FileNotFoundException, SQLException {
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            } else {
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT u.id, u.usuario, u.contraseña, u.nombre, u.id_tipo, t.nombre FROM usuario "
                    + "AS u INNER JOIN tipo_usuario AS t ON u.id_tipo = t.id WHERE usuario = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, rg.getUsuario());
            rs = statement.executeQuery();
            if (rs.next()) {
                if (rg.getContraseña().equals(rs.getString(3))) {
                    String sqlUpdate = "UPDATE usuario SET last_session = ? WHERE id = ?";
                    statement = conn.prepareStatement(sqlUpdate);
                    statement.setString(1, rg.getLast_session());
                    statement.setInt(2, rs.getInt(1));
                    statement.execute();
                    rg.setId(rs.getInt(1));
                    rg.setNombre(rs.getString(4));
                    rg.setTipo_id(rs.getInt(5));
                    rg.setNombre_tipo(rs.getString(6));
                    
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
