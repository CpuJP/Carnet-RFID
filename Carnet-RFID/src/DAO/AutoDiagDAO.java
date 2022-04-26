package DAO;

import Model.AutoDiag;
import Controller.ConexionBD;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoDiagDAO {
    
    public void createAutoDiag(AutoDiag au) throws FileNotFoundException{
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
            String sql = "INSERT INTO autodiag (fiebre, fatiga, cabeza, tos, malestar, musculos, contacto_covid19, "
                    + "respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, ingresar_elementos, "
                    + "bicicleta, carro, moto, portatil, id_persona, id_rfid_nfc) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setByte(1, au.getFiebre());
            statement.setByte(2, au.getFatiga());
            statement.setByte(3, au.getCabeza());
            statement.setByte(4, au.getTos());
            statement.setByte(5, au.getMalestar());
            statement.setByte(6, au.getMusculos());
            statement.setByte(7, au.getContactoCovid19());
            statement.setByte(8, au.getRespiracion());
            statement.setByte(9, au.getPecho());
            statement.setByte(10, au.getNariz());
            statement.setByte(11, au.getGarganta());
            statement.setByte(12, au.getOlores());
            statement.setByte(13, au.getDiarrea());
            statement.setFloat(14, au.getTemperatura());
            statement.setByte(15, au.getIngresarElementos());
            statement.setByte(16, au.getBicicleta());
            statement.setByte(17, au.getCarro());
            statement.setByte(18, au.getMoto());
            statement.setByte(19, au.getPortatil());
            statement.setString(20, au.getIdPersona());
            statement.setString(21, au.getIdRfidNfc());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Inserción exitosa");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public AutoDiag getAutoDiagIdPersona (String idPersona) throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        AutoDiag au = null;
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "SELECT fiebre, fatiga, cabeza, tos, malestar, musculos, contacto_covid19, "
                    + "respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, "
                    + "ingresar_elementos, bicicleta, carro, moto, portatil, id_rfid_nfc "
                    + "FROM carnet.autodiag, carnet.personal_universidad WHERE autodiag.id_persona = "
                    + "personal_universidad.id_persona AND autodiag.id_persona = ?";
            PreparedStatement statement = conn.prepareCall(sql);
            statement.setString(1, idPersona);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                Integer codigo = rs.getInt(1);
                byte fiebre = rs.getByte(2);
                byte fatiga = rs.getByte(3);
                byte cabeza = rs.getByte(4);
                byte tos = rs.getByte(5);
                byte malestar = rs.getByte(6);
                byte musculos = rs.getByte(7);
                byte contactoCovid19 = rs.getByte(8);
                byte respiracion = rs.getByte(9);
                byte pecho = rs.getByte(10);
                byte nariz = rs.getByte(11);
                byte garganta = rs.getByte(12);
                byte olores = rs.getByte(13);
                byte diarrea = rs.getByte(14);
                float temperatura = rs.getFloat(15);
                byte ingresarElementos = rs.getByte(16);
                byte bicicleta = rs.getByte(17);
                byte carro = rs.getByte(18);
                byte moto = rs.getByte(19);
                byte portatil = rs.getByte(20);
                String idRfidNfc = rs.getString(21);
                au = new AutoDiag(codigo, fiebre, fatiga, cabeza, tos, malestar, musculos, contactoCovid19, 
                        respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, 
                        ingresarElementos, bicicleta, carro, moto, portatil, idPersona, idRfidNfc);
                conn.close();
            }else{
                au = new AutoDiag(0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, 
                        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0
                        , (byte)0, (byte)0, (byte)0, null, null);
            }
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return au;
    }
    
    public List<AutoDiag> getAllAutoDiag() throws FileNotFoundException{
        ConexionBD cBD = new ConexionBD();
        String dbURL = cBD.getURL();
        String username = cBD.getUSER();
        String password = cBD.getPASSWORD();
        List<AutoDiag> Autodiags = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Problemas al conectar");
            }
            String sql = "select * from autodiag";
            PreparedStatement statement = conn.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                byte fiebre = rs.getByte(2);
                byte fatiga = rs.getByte(3);
                byte cabeza = rs.getByte(4);
                byte tos = rs.getByte(5);
                byte malestar = rs.getByte(6);
                byte musculos = rs.getByte(7);
                byte contactoCovid19 = rs.getByte(8);
                byte respiracion = rs.getByte(9);
                byte pecho = rs.getByte(10);
                byte nariz = rs.getByte(11);
                byte garganta = rs.getByte(12);
                byte olores = rs.getByte(13);
                byte diarrea = rs.getByte(14);
                float temperatura = rs.getFloat(15);
                byte ingresarElementos = rs.getByte(16);
                byte bicicleta = rs.getByte(17);
                byte carro = rs.getByte(18);
                byte moto = rs.getByte(19);
                byte portatil = rs.getByte(20);
                String idPersona = rs.getString(21);
                String idRfidNfc = rs.getString(22);
                AutoDiag au = new AutoDiag(codigo, fiebre, fatiga, cabeza, tos, malestar, musculos, 
                        contactoCovid19, respiracion, pecho, nariz, garganta, olores, diarrea, temperatura, 
                        ingresarElementos, bicicleta, carro, moto, portatil, idPersona, idRfidNfc);
                Autodiags.add(au);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Autodiags;
    }
    
}
