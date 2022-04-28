package Controller;

import Model.AutoDiag;
import DAO.AutoDiagDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class AutoDiagController {
    
    public void saveAutoDiag (AutoDiag ad) throws FileNotFoundException{
        AutoDiagDAO adDAO = new AutoDiagDAO();
        adDAO.createAutoDiag(ad);
    }
    
    public AutoDiag getAutodiagById(String id) throws FileNotFoundException{
        AutoDiagDAO adDAO = new AutoDiagDAO();
        return adDAO.getAutoDiagIdPersona(id);
    }
    
    public List<AutoDiag> getAllAutoDiag() throws FileNotFoundException{
        AutoDiagDAO adDAO = new AutoDiagDAO();
        return adDAO.getAllAutoDiag();
    }
    
}
