package DAO;

import Model.SalaDeComputo;
import Controller.ConexionBD;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaDeComputoDAO {
    
    public void createSalaComputoIngreso (SalaDeComputo sc) throws FileNotFoundException{
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
            String sql = "insert into sala_computo values (?, null, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, sc.getIngreso());
            statement.setString(2, sc.getSalaIngreso());
            statement.setString(3, sc.getPcUso());
            statement.setString(4, sc.getIdPersona());
            statement.setString(5, sc.getIdRfidNfc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void createSalaComputoSalida (SalaDeComputo sc) throws FileNotFoundException{
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
            String sql = "insert into carnet.sala_computo values (null, ?, null, null, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, sc.getSalida());
            statement.setString(4, sc.getIdPersona());
            statement.setString(5, sc.getIdRfidNfc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public SalaDeComputo getSalaComputoId (String idPersona) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        SalaDeComputo sc = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "select * from sala_computo where id_persona =? order by ingreso asc";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String ingreso = rs.getString(1);
                String salida = rs.getString(2);
                String salaIngreso = rs.getString(3);
                String pcUso = rs.getString(4);
                String idPersona1 = rs.getString(5);
                String idRfidNfc = rs.getString(6);
                sc = new SalaDeComputo(ingreso, salida, salaIngreso, pcUso, idPersona1, idRfidNfc);
                conn.close();
            } else {
                sc = new SalaDeComputo(null, null, null, null, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return sc;
    }
    
    public List<SalaDeComputo> getAllSalaComputo() throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        List<SalaDeComputo> SalaComputoT = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "select * from sala_computo order by ingreso asc";
            PreparedStatement statement = conn.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String ingreso = rs.getString(1);
                String salida = rs.getString(2);
                String salaIngreso = rs.getString(3);
                String pcUso = rs.getString(4);
                String idPersona1 = rs.getString(5);
                String idRfidNfc = rs.getString(6);
                SalaDeComputo sc = new SalaDeComputo(ingreso, salida, salaIngreso, pcUso, idPersona1, idRfidNfc);
                SalaComputoT.add(sc);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return SalaComputoT;
    }
}
