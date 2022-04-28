package Controller;

import Model.Laboratorio;
import DAO.LaboratorioDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class LaboratorioController {
    
    public void saveLaboratorioIngreso(Laboratorio lb) throws FileNotFoundException{
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        lbDAO.createLaboratorioIngreso(lb);
    }
    
    public void saveLaboratorioSalida(Laboratorio lb) throws FileNotFoundException{
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        lbDAO.createLaboratorioSalida(lb);
    }
    
    public Laboratorio getLaboratorioById(String id) throws FileNotFoundException{
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        return lbDAO.getLaboratorioId(id);
    }
    
    public List<Laboratorio> getAllLaboratorio() throws FileNotFoundException{
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        return lbDAO.getAllLaboratorios();
    }
    
}
