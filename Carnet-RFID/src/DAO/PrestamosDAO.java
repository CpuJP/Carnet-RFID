package DAO;

import Model.Prestamos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrestamosDAO {
    
    public void createPrestamosInicio(Prestamos pe){
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
            String sql = "INSERT INTO prestamos (nombre_objeto, inicio_prestamo, final_prestamo, origen, "
                    + "id_persona, id_rfid_nfc) VALUES (?, ?, null, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pe.getNombreObjeto());
            statement.setString(2, pe.getInicioPrestamo());
            statement.setString(3, pe.getOrigen());
            statement.setString(4, pe.getIdPersona());
            statement.setString(5, pe.getIdRfidNfc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void createPrestamosFinal(Prestamos pe){
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
            String sql = "INSERT INTO prestamos (nombre_objeto, inicio_prestamo, final_prestamo, origen, "
                    + "id_persona, id_rfid_nfc) VALUES (?, null, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pe.getNombreObjeto());
            statement.setString(2, pe.getFinalPrestamo());
            statement.setString(3, pe.getOrigen());
            statement.setString(4, pe.getIdPersona());
            statement.setString(5, pe.getIdRfidNfc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Prestamos getPrestamosId (String idPersona){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        Prestamos pe = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT * FROM prestamos WHERE id_persona = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Integer codigo  = rs.getInt(1);
                String nombreObjeto = rs.getString(2);
                String inicioPrestamo = rs.getString(3);
                String finalPrestamo = rs.getString(4);
                String origen = rs.getString(5);
                String idPersona1 = rs.getString(6);
                String idRfidNfc = rs.getString(7);
                pe = new Prestamos(codigo, nombreObjeto, inicioPrestamo, finalPrestamo, origen, idPersona1, idRfidNfc);
                conn.close();
            } else {
                pe = new Prestamos(null, null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return pe;
    }
    
    public List<Prestamos> getAllPrestamos(){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        List<Prestamos> PrestamosT = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT * FROM prestamos;";
            PreparedStatement statement = conn.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Integer codigo  = rs.getInt(1);
                String nombreObjeto = rs.getString(2);
                String inicioPrestamo = rs.getString(3);
                String finalPrestamo = rs.getString(4);
                String origen = rs.getString(5);
                String idPersona1 = rs.getString(6);
                String idRfidNfc = rs.getString(7);
                Prestamos pe = new Prestamos(codigo, nombreObjeto, inicioPrestamo, finalPrestamo, 
                        origen, idPersona1, idRfidNfc);
                PrestamosT.add(pe);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return PrestamosT;
    }
}
