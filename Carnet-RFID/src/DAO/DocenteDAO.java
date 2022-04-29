package DAO;

import Model.Docente;
import Controller.ConexionBD;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DocenteDAO {
    
    public void createDocente(Docente dc) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "INSERT INTO docentes VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, dc.getTipo());
            statement.setString(2, dc.getCargo());
            statement.setString(3, dc.getFacultad());
            statement.setString(4, dc.getSede());
            statement.setString(5, dc.getIdPersonaDocente());
            statement.setString(6, dc.getIdRfidNfcDocente());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Docente getDocenteId (String idPersonDocente) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        Docente dc = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, tipo, cargo, facultad, sede FROM docentes, personal_universidad "
                    + "WHERE docentes.id_persona_docente = personal_universidad.id_persona AND "
                    + "docentes.id_persona_docente = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersonDocente);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String idPersona = rs.getString(1);
                String tipoId = rs.getString(2);
                String codigo = rs.getString(3);
                String primerNombre = rs.getString(4);
                String segundoNombre = rs.getString(5);
                String primerApellido = rs.getString(6);
                String segundoApellido = rs.getString(7);
                String email = rs.getString(8);
                String celular = rs.getString(9);
                String tipo = rs.getString(10);
                String cargo = rs.getString(11);
                String facultad = rs.getString(12);
                String sede = rs.getString(13);
                dc = new Docente(idPersona, tipoId, codigo, primerNombre, segundoNombre, primerApellido, 
                        segundoApellido, email, celular, tipo, cargo, facultad, sede);
                conn.close();
            } else {
                dc = new Docente(null, null, null, null, null, null, null, null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return dc;
    }
    
    public List<Docente> getAllDocentes() throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        List<Docente> Docentes = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, tipo, cargo, facultad, sede FROM docentes, "
                    + "personal_universidad WHERE docentes.id_persona_docente = personal_universidad.id_person";
            PreparedStatement statement = conn.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String idPersona = rs.getString(1);
                String tipoId = rs.getString(2);
                String codigo = rs.getString(3);
                String primerNombre = rs.getString(4);
                String segundoNombre = rs.getString(5);
                String primerApellido = rs.getString(6);
                String segundoApellido = rs.getString(7);
                String email = rs.getString(8);
                String celular = rs.getString(9);
                String tipo = rs.getString(10);
                String cargo = rs.getString(11);
                String facultad = rs.getString(12);
                String sede = rs.getString(13);
                Docente dc = new Docente(idPersona, tipoId, codigo, primerNombre, segundoNombre, 
                        primerApellido, segundoApellido, email, celular, tipo, cargo, facultad, sede);
                Docentes.add(dc);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Docentes;
    }
    
    public void updateDocente (Docente dc) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "UPDATE docentes SET tipo=?, cargo=?, facultad=?, sede=? WHERE id_persona_docente=?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, dc.getTipo());
            statement.setString(2, dc.getCargo());
            statement.setString(3, dc.getFacultad());
            statement.setString(4, dc.getSede());
            statement.setString(5, dc.getIdPersonaDocente());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Actualización exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteDocentes (String idPersona) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "DELETE FROM docentes WHERE id_persona_docente =?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Eliminación exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
