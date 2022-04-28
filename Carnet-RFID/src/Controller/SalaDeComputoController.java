package Controller;

import Model.SalaDeComputo;
import DAO.SalaDeComputoDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class SalaDeComputoController {
    
    public void saveSalaComputoIngreso(SalaDeComputo sc) throws FileNotFoundException{
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        scDAO.createSalaComputoIngreso(sc);
    }
    
    public void saveSalaComputoSalida(SalaDeComputo sc) throws FileNotFoundException{
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        scDAO.createSalaComputoSalida(sc);
    }
    
    public SalaDeComputo getSalaComputoById(String id) throws FileNotFoundException{
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        return scDAO.getSalaComputoId(id);
    }
    
    public List<SalaDeComputo> getAllSalaComputo() throws FileNotFoundException{
        SalaDeComputoDAO scDAO = new SalaDeComputoDAO();
        return scDAO.getAllSalaComputo();
    }
}
