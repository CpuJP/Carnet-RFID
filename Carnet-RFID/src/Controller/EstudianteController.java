package Controller;

import Model.Estudiante;
import DAO.EstudianteDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class EstudianteController {
    
    public void saveEstudiante(Estudiante es) throws FileNotFoundException{
        EstudianteDAO esDAO = new EstudianteDAO();
        esDAO.createEstudiante(es);
    }
    
    public Estudiante getEstudianteById(String id) throws FileNotFoundException{
        EstudianteDAO esDAO = new EstudianteDAO();
         return esDAO.getEstudianteId(id);
    }
    
    public List<Estudiante> getAllEstudiantes() throws FileNotFoundException{
        EstudianteDAO esDAO = new EstudianteDAO();
        return esDAO.getAllEstudiantes();
    }
    
    public void updateEstudiante(Estudiante es) throws FileNotFoundException{
        EstudianteDAO esDAO = new EstudianteDAO();
        esDAO.updateEstudiante(es);
    }
    
    public void deleteEstudiante(String id) throws FileNotFoundException{
        EstudianteDAO esDAO = new EstudianteDAO();
        esDAO.deleteEstudiante(id);
    }
    
}
