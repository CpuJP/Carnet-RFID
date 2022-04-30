package DAO;

import Model.RfidNfc;
import Controller.ConexionBD;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RfidNfcDAO {
    
    public void createRfidNfc (RfidNfc rn) throws FileNotFoundException{
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
            String sql = "INSERT INTO rfid_nfc VALUES(?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, rn.getIdCarnet());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public RfidNfc getPersonaURfidNfc (String idRfidNfc) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        RfidNfc rn = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona FROM personal_universidad JOIN rfid_nfc ON "
                    + "personal_universidad.rfid_nfc_id_carnet = rfid_nfc.id_carnet AND "
                    + "personal_universidad.rfid_nfc_id_carnet = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idRfidNfc);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String idPersona = rs.getString(1);
                rn = new RfidNfc(idPersona);
                conn.close();
            } else {
                rn = new RfidNfc(null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return rn;
    }
    
    public RfidNfc getIdRfidNfcByIdPersona (String idPersona) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        RfidNfc rn = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT rfid_nfc_id_carnet FROM personal_universidad WHERE id_persona = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String idPersonaRfidNfc = rs.getString(1);
                rn = new RfidNfc(idPersonaRfidNfc, idPersona);
                conn.close();
            } else {
                rn = new RfidNfc(null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return rn;
    }
    
    public RfidNfc getIdPersonaRAndfidNfcByRfidNfc (String idRfidNfc) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        RfidNfc rn = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, rfid_nfc_id_carnet FROM personal_universidad JOIN "
                    + "rfid_nfc ON personal_universidad.rfid_nfc_id_carnet = rfid_nfc.id_carnet AND "
                    + "personal_universidad.rfid_nfc_id_carnet = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idRfidNfc);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String idPersona = rs.getString(1);
                String idPersonaRfidNfc = rs.getString(2);
                rn = new RfidNfc(idPersonaRfidNfc, idPersona);
                conn.close();
            } else {
                rn = new RfidNfc(null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return rn;
    }
    
    public RfidNfc getIdPersonaRAndfidNfcByIdPersona (String idPersona) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        RfidNfc rn = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, rfid_nfc_id_carnet FROM personal_universidad JOIN rfid_nfc ON "
                    + "personal_universidad.id_persona = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String idPersona1 = rs.getString(1);
                String idPersonaRfidNfc = rs.getString(2);
                rn = new RfidNfc(idPersonaRfidNfc, idPersona1);
                conn.close();
            } else {
                rn = new RfidNfc(null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return rn;
    }
    
    public List<RfidNfc> getAllIdPersonasRfidNfc() throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        List<RfidNfc> idPersonasRfidNfc = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT id_persona, rfid_nfc_id_carnet FROM personal_universidad JOIN "
                    + "rfid_nfc ON personal_universidad.rfid_nfc_id_carnet = rfid_nfc.id_carnet";
            PreparedStatement statement = conn.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String idPersona = rs.getString(1);
                String idPersonaRfidNfc = rs.getString(2);
                RfidNfc rn = new RfidNfc(idPersonaRfidNfc, idPersona);
                idPersonasRfidNfc.add(rn);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idPersonasRfidNfc;
    }
    
    public void updateRfidNfc (RfidNfc rn) throws FileNotFoundException{
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
            String sql = "update personal_universidad set rfid_nfc_id_carnet=? where rfid_nfc_id_carnet=?;" +
                    "update administrativo set id_rfid_nfc_administrativo=? where id_rfid_nfc_administrativo=?;" +
                    "update docentes set id_rfid_nfc_docente=? where id_rfid_nfc_docente=?;" +
                    "update egresado set id_rfid_nfc_egresado=? where id_rfid_nfc_egresado=?;" +
                    "update estudiante set id_rfid_nfc_estudiante=? where id_rfid_nfc_estudiante=?;" +
                    "update prestamos set id_rfid_nfc=? where id_rfid_nfc =?;" +
                    "update laboratorio set id_rfid_nfc=? where id_rfid_nfc=?;" +
                    "update sala_computo set id_rfid_nfc=? where id_rfid_nfc=?;" +
                    "update autodiag set id_rfid_nfc=? where id_rfid_nfc=?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, rn.getIdCarnet());
            statement.setString(2, rn.getIdPersona());
            statement.setString(3, rn.getIdCarnet());
            statement.setString(4, rn.getIdPersona());
            statement.setString(5, rn.getIdCarnet());
            statement.setString(6, rn.getIdPersona());
            statement.setString(7, rn.getIdCarnet());
            statement.setString(8, rn.getIdPersona());
            statement.setString(9, rn.getIdCarnet());
            statement.setString(10, rn.getIdPersona());
            statement.setString(11, rn.getIdCarnet());
            statement.setString(12, rn.getIdPersona());
            statement.setString(13, rn.getIdCarnet());
            statement.setString(14, rn.getIdPersona());
            statement.setString(15, rn.getIdCarnet());
            statement.setString(16, rn.getIdPersona());
            statement.setString(17, rn.getIdCarnet());
            statement.setString(18, rn.getIdPersona());
            statement.setString(19, rn.getIdCarnet());
            statement.setString(20, rn.getIdPersona());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Actualización exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteRfidNfc (String idCarnet) throws FileNotFoundException{
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
            String sql = "delete from rfid_nfc where id_carnet=?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idCarnet);
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
