package Controller;

import Model.Laboratorio;
import DAO.LaboratorioDAO;
import java.util.List;

public class LaboratorioController {
    
    public void saveLaboratorioIngreso(Laboratorio lb){
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        lbDAO.createLaboratorioIngreso(lb);
    }
    
    public void saveLaboratorioSalida(Laboratorio lb){
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        lbDAO.createLaboratorioSalida(lb);
    }
    
    public Laboratorio getLaboratorioById(String id){
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        return lbDAO.getLaboratorioId(id);
    }
    
    public List<Laboratorio> getAllLaboratorio(){
        LaboratorioDAO lbDAO = new LaboratorioDAO();
        return lbDAO.getAllLaboratorios();
    }
    
}
