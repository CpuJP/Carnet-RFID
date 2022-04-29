package DAO;

import Model.PersonalUniversidad;
import Controller.ConexionBD;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonalUniversidadDAO {
    
    public void createPersonalUniversidad (PersonalUniversidad pu) throws FileNotFoundException{
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
    
    public PersonalUniversidad getPersonalUniverdidadId (String idPersona) throws FileNotFoundException {
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
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
                conn.close();
            } else {
                pu = new PersonalUniversidad(null, null, null, null, null, null, null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return pu;
    }
    
    public List<PersonalUniversidad> getAllPersonasUniversidad() throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
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
    
    public void updatePersonalUniversidad (PersonalUniversidad pu) throws FileNotFoundException{
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
            String sql = "UPDATE personal_universidad SET tipo_id =?, primer_nombre=?, segundo_nombre=?, "
                    + "primer_apellido=?, segundo_apellido=?, fecha_nacimiento=?, genero=?, email=?, "
                    + "celular=? WHERE id_persona=?;";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, pu.getTipoId());
            statement.setString(2, pu.getPrimerNombre());
            statement.setString(3, pu.getSegundoNombre());
            statement.setString(4, pu.getPrimerApellido());
            statement.setString(5, pu.getSegundoApellido());
            statement.setString(6, pu.getFechaNacimiento());
            statement.setString(7, pu.getGenero());
            statement.setString(8, pu.getEmail());
            statement.setString(9, pu.getCelular());
            statement.setString(10, pu.getIdPersona());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Actualización exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deletePersonalUniversidad (String idPersona) throws FileNotFoundException{
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
            String sql = "DELETE FROM docentes WHERE id_persona_docente =?;" +
                            "DELETE FROM egresado WHERE id_persona_egresado=?;" +
                            "DELETE FROM estudiante WHERE id_persona_estudiante=?;" +
                            "DELETE FROM administrativo WHERE id_persona_administrativo =?;" +
                            "DELETE FROM laboratorio WHERE id_persona=?;" +
                            "delete from autodiag where id_persona=?;" +
                            "delete from prestamos where id_persona=?;" +
                            "delete from sala_computo where id_persona=?;" +
                            "DELETE FROM personal_Universidad WHERE id_persona=?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            statement.setString(2, idPersona);
            statement.setString(3, idPersona);
            statement.setString(4, idPersona);
            statement.setString(5, idPersona);
            statement.setString(6, idPersona);
            statement.setString(7, idPersona);
            statement.setString(8, idPersona);
            statement.setString(9, idPersona);
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
