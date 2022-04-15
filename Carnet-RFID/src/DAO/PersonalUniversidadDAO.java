package DAO;

import Model.PersonalUniversidad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonalUniversidadDAO {
    
    public void createPersonalUniversidad (PersonalUniversidad pu){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "INSERT INTO personal_universidad VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pu.getIdPersona());
            statement.setString(2, pu.getTipoId());
            statement.setString(3, pu.getRfidNfcIdCarnet());
            statement.setString(4, pu.getCodigo());
            statement.setString(5, pu.getPrimerNombre());
            statement.setString(6, pu.getSegundoNombre());
            statement.setString(7, pu.getPrimerApellido());
            statement.setString(8, pu.getSegundoApellido());
            statement.setString(9, pu.getFechaNacimiento());
            statement.setString(10, pu.getGenero());
            statement.setString(11, pu.getEmail());
            statement.setString(12, pu.getCelular());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public PersonalUniversidad getPersonalUniverdidadId (String idPersona) {
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        PersonalUniversidad pu = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT * FROM personal_universidad WHERE id_persona = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String idPersona1 = rs.getString(1);
                String tipoId = rs.getString(2);
                String rfidNfc = rs.getString(3);
                String codigo = rs.getString(4);
                String primerNombre = rs.getString(5);
                String segundoNombre = rs.getString(6);
                String primerApellido = rs.getString(7);
                String segundoApellido = rs.getString(8);
                String fechaNacimineto = rs.getString(9);
                String genero = rs.getString(10);
                String email = rs.getString(11);
                String celular = rs.getString(12);
                pu = new PersonalUniversidad(idPersona1, tipoId, rfidNfc, codigo, primerNombre, 
                        segundoNombre, primerApellido, segundoApellido, fechaNacimineto, genero, email, celular);
            } else {
                pu = new PersonalUniversidad(null, null, null, null, null, null, null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return pu;
    }
    
    public List<PersonalUniversidad> getAllPersonasUniversidad(){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        List<PersonalUniversidad> Personas = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT * FROM personal_universidad";
            PreparedStatement statement = conn.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String idPersona1 = rs.getString(1);
                String tipoId = rs.getString(2);
                String rfidNfc = rs.getString(3);
                String codigo = rs.getString(4);
                String primerNombre = rs.getString(5);
                String segundoNombre = rs.getString(6);
                String primerApellido = rs.getString(7);
                String segundoApellido = rs.getString(8);
                String fechaNacimineto = rs.getString(9);
                String genero = rs.getString(10);
                String email = rs.getString(11);
                String celular = rs.getString(12);
                PersonalUniversidad pu = new PersonalUniversidad(idPersona1, tipoId, rfidNfc, codigo, 
                        primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimineto, 
                        genero, email, celular);
                Personas.add(pu);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Personas;
    }
    
    public void updatePersonalUniversidad (PersonalUniversidad pu){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "UPDATE personal_universidad SET tipo_id =?, primer_nombre=?, segundo_nombre=?, "
                    + "primer_apellido=?, segundo_apellido=?, fecha_nacimiento=?, genero=?, email=?, "
                    + "celular=? WHERE id_persona=?;";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, pu.getIdPersona());
            statement.setString(2, pu.getTipoId());
            statement.setString(3, pu.getPrimerNombre());
            statement.setString(4, pu.getSegundoNombre());
            statement.setString(5, pu.getPrimerApellido());
            statement.setString(6, pu.getSegundoApellido());
            statement.setString(7, pu.getFechaNacimiento());
            statement.setString(8, pu.getGenero());
            statement.setString(9, pu.getEmail());
            statement.setString(10, pu.getCelular());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Actualización exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deletePersonalUniversidad (String idPersona){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "DELETE FROM docentes WHERE id_persona_docente =?\n" +
                            "DELETE FROM egresado WHERE id_persona_egresado=?\n" +
                            "DELETE FROM estudiante WHERE id_persona_estudiante=?\n" +
                            "DELETE FROM administrativo WHERE id_persona_administrativo =?\n" +
                            "DELETE FROM laboratorio WHERE id_persona=?\n" +
                            "DELETE FROM personal_Universidad WHERE id_persona=?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            statement.setString(2, idPersona);
            statement.setString(3, idPersona);
            statement.setString(4, idPersona);
            statement.setString(5, idPersona);
            statement.setString(6, idPersona);
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
