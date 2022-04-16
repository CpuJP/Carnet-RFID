package DAO;

import Model.Administrativo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdministrativoDAO {
    
    public void creacteAdministrativo(Administrativo ad){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        try{
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "INSERT INTO administrativo VALUES(?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, ad.getCargo());
            statement.setString(2, ad.getSede());
            statement.setString(3, ad.getIdPersonaAdministrativo());
            statement.setString(4, ad.getIdRfidNfcAdministrativo());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Administrativo getAdministrativoId (String idPersonaAdministrativo){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        Administrativo ad = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, cargo, sede FROM carnet.personal_universidad, "
                    + "carnet.administrativo WHERE personal_universidad.id_persona = "
                    + "administrativo.id_persona_administrativo AND administrativo.id_persona_administrativo = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersonaAdministrativo);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                String idPersona = rs.getString(1);
                String tipoId = rs.getString(2);
                String codigo = rs.getString(3);
                String primerNombre = rs.getString(4);
                String segundoNombre = rs.getString(5);
                String primerApellido = rs.getString(6);
                String segundoApellido = rs.getString(7);
                String email = rs.getString(8);
                String celular = rs.getString(9);
                String cargo = rs.getString(10);
                String sede = rs.getString(11);
                ad = new Administrativo(idPersona, tipoId, codigo, primerNombre, segundoNombre, primerApellido, 
                        segundoApellido, email, celular, cargo, sede);
                conn.close();
            }else{
                ad = new Administrativo(null, null, null, null, null, null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ad;
    }
    
    public List<Administrativo> getAllAdministrativo(){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        List<Administrativo> Administrativos = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, tipo_id, codigo, primer_nombre, segundo_nombre, primer_apellido, "
                    + "segundo_apellido, email, celular, cargo, sede FROM carnet.personal_universidad, "
                    + "carnet.administrativo WHERE personal_universidad.id_persona = "
                    + "administrativo.id_persona_administrativo";
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
                String cargo = rs.getString(10);
                String sede = rs.getString(11);
                Administrativo ad = new Administrativo(idPersona, tipoId, codigo, primerNombre, 
                        segundoNombre, primerApellido, segundoApellido, email, celular, cargo, sede);
                Administrativos.add(ad);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Administrativos;
    }
    
    public void updateAdministrativo (Administrativo ad){
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
            String sql = "UPDATE administrativo SET cargo=?, sede=? WHERE id_persona_administrativo =?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, ad.getIdPersonaAdministrativo());
            statement.setString(2, ad.getCargo());
            statement.setString(3, ad.getSede());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Actualización exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteAdministrativo(String idPersona){
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
            String sql = "DELETE FROM administrativo WHERE id_persona_administrativo =?";
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