package Controller;

import Model.AutoDiag;
import DAO.AutoDiagDAO;
import java.util.List;

public class AutoDiagController {
    
    public void saveAutoDiag (AutoDiag ad){
        AutoDiagDAO adDAO = new AutoDiagDAO();
        adDAO.createAutoDiag(ad);
    }
    
    public AutoDiag getAutodiagById(String id){
        AutoDiagDAO adDAO = new AutoDiagDAO();
        return adDAO.getAutoDiagIdPersona(id);
    }
    
    public List<AutoDiag> getAllAutoDiag(){
        AutoDiagDAO adDAO = new AutoDiagDAO();
        return adDAO.getAllAutoDiag();
    }
    
}
