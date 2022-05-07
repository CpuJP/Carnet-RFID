package Controller;

import Model.PersonalUniversidad;
import DAO.PersonalUniversidadDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class PersonalUniversidadController {
    
    public void savePersonalUniversidad(PersonalUniversidad pu) throws FileNotFoundException{
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        puDAO.createPersonalUniversidad(pu);
    }
    
    public PersonalUniversidad getPersonalUniversidadById(String id) throws FileNotFoundException{
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        return puDAO.getPersonalUniverdidadId(id);
    }
    
    public PersonalUniversidad getFullNameById(String idPersona) throws FileNotFoundException{
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        return puDAO.getFullNameByIdPersona(idPersona);
    }
    
    public List<PersonalUniversidad> getAllPersonalUniversidad() throws FileNotFoundException{
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        return puDAO.getAllPersonasUniversidad();
    }
    
    public void updatePersonalUniversidad(PersonalUniversidad pu) throws FileNotFoundException{
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        puDAO.updatePersonalUniversidad(pu);
    }
    
    public void deletePersonalUniversidad(String id) throws FileNotFoundException{
        PersonalUniversidadDAO puDAO = new PersonalUniversidadDAO();
        puDAO.deletePersonalUniversidad(id);
    }

    public void deletePersonalUniversidad(int documento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
