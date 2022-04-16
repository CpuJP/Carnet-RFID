package DAO;

import Model.Laboratorio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAO {
    
    public void createLaboratorioIngreso (Laboratorio lb){
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
            String sql = "insert into laboratorio values (?, null, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, lb.getIngreso());
            statement.setString(2, lb.getIdPersona());
            statement.setString(3, lb.getIdRfidNfc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void createLaboratorioSalida (Laboratorio lb){
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
            String sql = "insert into laboratorio values (null, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, lb.getSalida());
            statement.setString(2, lb.getIdPersona());
            statement.setString(3, lb.getIdRfidNfc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Laboratorio getLaboratorioId (String idPersona){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        Laboratorio lb = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "select * from laboratorio WHERE id_persona=? order by ingreso desc";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String ingreso = rs.getString(1);
                String salida = rs.getString(2);
                String idPersona1 = rs.getString(3);
                String idRfidNfc = rs.getString(4);
                lb = new Laboratorio(ingreso, salida, idPersona1, idRfidNfc);
                conn.close();
            } else {
                lb = new Laboratorio(null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return lb;
    }
    
    public List<Laboratorio> getAllLaboratorios(){
        String dbURL = "jdbc:mysql://localhost:3306/carnet";
        String username = "root";
        String password = "Juanpablo1870";
        List<Laboratorio> Laboratorios = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "select * from laboratorio order by ingreso desc";
            PreparedStatement statement = conn.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String ingreso = rs.getString(1);
                String salida = rs.getString(2);
                String idPersona1 = rs.getString(3);
                String idRfidNfc = rs.getString(4);
                Laboratorio lb = new Laboratorio(ingreso, salida, idPersona1, idRfidNfc);
                Laboratorios.add(lb);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Laboratorios;
    }
}
