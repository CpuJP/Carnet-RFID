package Controller;

import Model.Egresado;
import DAO.EgresadoDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class EgresadoController {
    
    public void saveEgresado(Egresado eg) throws FileNotFoundException{
        EgresadoDAO egDAO = new EgresadoDAO();
        egDAO.createEgresado(eg);
    }
    
    public Egresado getEgresadoById(String id) throws FileNotFoundException{
        EgresadoDAO egDAO = new EgresadoDAO();
        return egDAO.getEgresadoId(id);
    }
    
    public List<Egresado> getAllEgresados() throws FileNotFoundException{
        EgresadoDAO egDAO = new EgresadoDAO();
        return egDAO.getAllEgresados();
    }
    
    public void updateEgresado(Egresado eg) throws FileNotFoundException{
        EgresadoDAO egDAO = new EgresadoDAO();
        egDAO.updateEgresado(eg);
    }
    
    public void deleteEgresadi(String id) throws FileNotFoundException{
        EgresadoDAO egDAO = new EgresadoDAO();
        egDAO.deleteEgresado(id);
    }
    
}
