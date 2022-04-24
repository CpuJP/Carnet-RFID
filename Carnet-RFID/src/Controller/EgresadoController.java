package Controller;

import Model.Egresado;
import DAO.EgresadoDAO;
import java.util.List;

public class EgresadoController {
    
    public void saveEgresado(Egresado eg){
        EgresadoDAO egDAO = new EgresadoDAO();
        egDAO.createEgresado(eg);
    }
    
    public Egresado getEgresadoById(String id){
        EgresadoDAO egDAO = new EgresadoDAO();
        return egDAO.getEgresadoId(id);
    }
    
    public List<Egresado> getAllEgresados(){
        EgresadoDAO egDAO = new EgresadoDAO();
        return egDAO.getAllEgresados();
    }
    
    public void updateEgresado(Egresado eg){
        EgresadoDAO egDAO = new EgresadoDAO();
        egDAO.updateEgresado(eg);
    }
    
    public void deleteEgresadi(String id){
        EgresadoDAO egDAO = new EgresadoDAO();
        egDAO.deleteEgresado(id);
    }
    
}
