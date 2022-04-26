package DAO;

import Model.Egresado;
import Controller.ConexionBD;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EgresadoDAO {
    
    public void createEgresado(Egresado eg) throws FileNotFoundException{
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
            String sql = "INSERT INTO egresado VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, eg.getFacultad());
            statement.setString(2, eg.getCarrera());
            statement.setString(3, eg.getAnioProm());
            statement.setString(4, eg.getIdPersonaEgresado());
            statement.setString(5, eg.getIdRfidNfcEgresado());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Egresado getEgresadoId (String idPersonaEgresado) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        Egresado eg = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, facultad, carrera, ano_prom "
                    + "FROM carnet.egresado, carnet.personal_universidad WHERE "
                    + "egresado.id_persona_egresado = personal_universidad.id_persona "
                    + "AND egresado.id_persona_egresado = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersonaEgresado);
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
                String facultad = rs.getString(10);
                String carrera = rs.getString(11);
                String anoProm = rs.getString(12);
                eg = new Egresado(idPersona, tipoId, codigo, primerNombre, segundoNombre, 
                        primerApellido, segundoApellido, email, celular, facultad, carrera, anoProm);
                conn.close();
            } else {
                eg = new Egresado(null, null, null, null, null, null, null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return eg;
    }
    
    public List<Egresado> getAllEgresados() throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        List<Egresado> Egresados = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, facultad, carrera, ano_prom "
                    + "FROM egresado, personal_universidad WHERE "
                    + "egresado.id_persona_egresado = personal_universidad.id_persona";
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
                String facultad = rs.getString(10);
                String carrera = rs.getString(11);
                String anoProm = rs.getString(12);
                Egresado eg = new Egresado(idPersona, tipoId, codigo, primerNombre, segundoNombre, 
                        primerApellido, segundoApellido, email, celular, facultad, carrera, anoProm);
                Egresados.add(eg);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Egresados;
    }
    
    public void updateEgresado (Egresado eg) throws FileNotFoundException{
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
            String sql = "UPDATE egresado SET facultad=?, carrera=?, ano_prom=? WHERE id_persona_egresado = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, eg.getIdPersonaEgresado());
            statement.setString(2, eg.getFacultad());
            statement.setString(3, eg.getCarrera());
            statement.setString(4, eg.getAnioProm());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Actualización exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteEgresado (String idPersona) throws FileNotFoundException{
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
            String sql = "DELETE FROM egresado WHERE id_persona_egresado=?";
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
