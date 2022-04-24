package Controller;

import Model.PersonalUniversidad;
import DAO.PersonalUniversidadDAO;
import java.util.List;

public class PersonalUniversidadController {
    
    public void savePersonalUniversidad(PersonalUniversidad pu){
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        puDAO.createPersonalUniversidad(pu);
    }
    
    public PersonalUniversidad getPersonalUniversidadById(String id){
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        return puDAO.getPersonalUniverdidadId(id);
    }
    
    public List<PersonalUniversidad> getAllPersonalUniversidad(){
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        return puDAO.getAllPersonasUniversidad();
    }
    
    public void updatePersonalUniversidad(PersonalUniversidad pu){
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        puDAO.updatePersonalUniversidad(pu);
    }
    
    public void deletePersonalUniversidad(String id){
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        puDAO.deletePersonalUniversidad(id);
    }
    
}
