package Controller;

import Model.Prestamos;
import DAO.PrestamosDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class PrestamosController {
    
    public void savePrestamoInicio(Prestamos pe) throws FileNotFoundException{
        PrestamosDAO peDAO = new PrestamosDAO();
        peDAO.createPrestamosInicio(pe);
    }
    
    public void savePrestamoFinal(Prestamos pe) throws FileNotFoundException{
        PrestamosDAO peDAO = new PrestamosDAO();
        peDAO.createPrestamosFinal(pe);
    }
    
    public Prestamos getPrestamoById(String id) throws FileNotFoundException{
        PrestamosDAO peDAO = new PrestamosDAO();
        return peDAO.getPrestamosId(id);
    }
    
    public List<Prestamos> getAllPrestamos() throws FileNotFoundException{
        PrestamosDAO peDAO = new PrestamosDAO();
        return peDAO.getAllPrestamos();
    }
    
    
    
}
