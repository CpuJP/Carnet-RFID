package Controller;

import Model.Administrativo;
import DAO.AdministrativoDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class AdministradorController {
    
    public void saveAdministrador(Administrativo ad) throws FileNotFoundException{
        AdministrativoDAO aDao = new AdministrativoDAO();
        aDao.createAdministrativo(ad);
    }
    
    public Administrativo getAdministrativoById(String id) throws FileNotFoundException{
        AdministrativoDAO aDao = new AdministrativoDAO();
        return aDao.getAdministrativoId(id);
    }
    
    public List<Administrativo> getAllAdministrativos() throws FileNotFoundException{
        AdministrativoDAO aDao = new AdministrativoDAO();
        return aDao.getAllAdministrativo();
    }
    
    public void updateAdministrativo(Administrativo ad) throws FileNotFoundException{
        AdministrativoDAO aDao = new AdministrativoDAO();
        aDao.updateAdministrativo(ad);
    }
    
    public void deleteAdministrativo(String id) throws FileNotFoundException{
        AdministrativoDAO aDao = new AdministrativoDAO();
        aDao.deleteAdministrativo(id);
    }
}
