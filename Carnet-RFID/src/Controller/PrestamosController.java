package Controller;

import Model.Prestamos;
import DAO.PrestamosDAO;
import java.util.List;

public class PrestamosController {
    
    public void savePrestamoInicio(Prestamos pe){
        PrestamosDAO peDAO = new PrestamosDAO();
        peDAO.createPrestamosInicio(pe);
    }
    
    public void savePrestamoFinal(Prestamos pe){
        PrestamosDAO peDAO = new PrestamosDAO();
        peDAO.createPrestamosFinal(pe);
    }
    
    public Prestamos getPrestamoById(String id){
        PrestamosDAO peDAO = new PrestamosDAO();
        return peDAO.getPrestamosId(id);
    }
    
    public List<Prestamos> getAllPrestamos(){
        PrestamosDAO peDAO = new PrestamosDAO();
        return peDAO.getAllPrestamos();
    }
    
    
    
}
