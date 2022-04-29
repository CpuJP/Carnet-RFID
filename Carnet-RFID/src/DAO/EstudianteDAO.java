package DAO;

import Model.Estudiante;
import Controller.ConexionBD;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    
    public void createEstudiante (Estudiante et) throws FileNotFoundException{
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
            String sql = "INSERT INTO estudiante VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, et.getFacultad());
            statement.setString(2, et.getCarrera());
            statement.setString(3, et.getSede());
            statement.setInt(4, et.getSemestre());
            statement.setString(5, et.getIdPersonaEstudiante());
            statement.setString(6, et.getIdRfidNfcEstudiante());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Estudiante getEstudianteId (String idPersonaEstudiante) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        Estudiante et = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, facultad, carrera, sede, semestre "
                    + "FROM estudiante, personal_universidad WHERE "
                    + "estudiante.id_persona_estudiante = personal_universidad.id_persona "
                    + "AND estudiante.id_persona_estudiante = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersonaEstudiante);
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
                String sede = rs.getString(12);
                Integer semestre = rs.getInt(13);
                et = new Estudiante(idPersona, tipoId, codigo, primerNombre, segundoNombre, primerApellido, 
                        segundoApellido, email, celular, facultad, carrera, sede, semestre);
                conn.close();
            }else{
                et = new Estudiante(null, null, null, null, null, null, null, null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return et;
    }
    
    public List<Estudiante> getAllEstudiantes() throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        List<Estudiante> Estudiantes = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, facultad, carrera, sede, semestre "
                    + "FROM estudiante, personal_universidad WHERE "
                    + "estudiante.id_persona_estudiante = personal_universidad.id_persona";
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
                String sede = rs.getString(12);
                Integer semestre = rs.getInt(13);
                Estudiante et = new Estudiante(idPersona, tipoId, codigo, primerNombre, segundoNombre, 
                        primerApellido, segundoApellido, email, celular, facultad, carrera, sede, semestre);
                Estudiantes.add(et);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Estudiantes;
    }
    
    public void updateEstudiante (Estudiante et) throws FileNotFoundException{
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
            String sql = "UPDATE estudiante SET facultad=?, carrera=?, sede=?, semestre=? WHERE id_persona_estudiante=?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, et.getFacultad());
            statement.setString(2, et.getCarrera());
            statement.setString(3, et.getSede());
            statement.setInt(4, et.getSemestre());
            statement.setString(5, et.getIdPersonaEstudiante());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Actualización exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteEstudiante (String idPersona) throws FileNotFoundException{
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
            String sql = "DELETE FROM estudiante WHERE id_persona_estudiante=?";
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
