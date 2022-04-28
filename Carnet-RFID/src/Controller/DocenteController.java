package Controller;

import Model.Docente;
import DAO.DocenteDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class DocenteController {
    
    public void saveDocente(Docente dc) throws FileNotFoundException{
        DocenteDAO dcDAO = new DocenteDAO();
        dcDAO.createDocente(dc);
    }
    
    public Docente getDocenteById(String id) throws FileNotFoundException{
        DocenteDAO dcDAO = new DocenteDAO();
        return dcDAO.getDocenteId(id);
    }
    
    public List<Docente> getAllDocentes() throws FileNotFoundException{
        DocenteDAO dcDAO = new DocenteDAO();
        return dcDAO.getAllDocentes();
    }
    
    public void updateDocente(Docente dc) throws FileNotFoundException{
        DocenteDAO dcDAO = new DocenteDAO();
        dcDAO.updateDocente(dc);
    }
    
    public void deleteDocente(String id) throws FileNotFoundException{
        DocenteDAO dcDAO = new DocenteDAO();
        dcDAO.deleteDocentes(id);
    }
}
