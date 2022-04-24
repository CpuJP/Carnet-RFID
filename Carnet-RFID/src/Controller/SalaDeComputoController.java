package Controller;

import Model.SalaDeComputo;
import DAO.SalaDeComputoDAO;
import java.util.List;

public class SalaDeComputoController {
    
    public void saveSalaComputoIngreso(SalaDeComputo sc){
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        scDAO.createSalaComputoIngreso(sc);
    }
    
    public void saveSalaComputoSalida(SalaDeComputo sc){
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        scDAO.createSalaComputoSalida(sc);
    }
    
    public SalaDeComputo getSalaComputoById(String id){
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        return scDAO.getSalaComputoId(id);
    }
    
    public List<SalaDeComputo> getAllSalaComputo(){
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        return scDAO.getAllSalaComputo();
    }
}
