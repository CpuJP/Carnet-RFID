package Controller;

import Model.RfidNfc;
import DAO.RfidNfcDAO;
import java.io.FileNotFoundException;
import java.util.List;

public class RfidNfcController {
    
    public void saveRfidNfc(RfidNfc rn) throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        rnDAO.createRfidNfc(rn);
    }
    
    public RfidNfc getIdPersonaByRfidNfc(String RfidNfc) throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getPersonaURfidNfc(RfidNfc);
    }
    
    public RfidNfc getIdRfidNfcByIdPersona(String idPersona) throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getIdRfidNfcByIdPersona(idPersona);
    }
    
    public RfidNfc getIdPersonaAndIdRfidNfcByRfidNfc(String RfidNfc) throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getIdPersonaRAndfidNfcByRfidNfc(RfidNfc);
    }
    
    public RfidNfc getIdPersonaAndIdRfidNfcByIdPersona(String idPersona) throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getIdPersonaRAndfidNfcByIdPersona(idPersona);
    }
    
    public List<RfidNfc> getAllIdPersona() throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getAllIdPersonasRfidNfc();
    }
    
    public void updateRfidNfc(RfidNfc rn) throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        rnDAO.updateRfidNfc(rn);
    }
    
    public void deleteRfidNfc(String idCarnet) throws FileNotFoundException{
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        rnDAO.deleteRfidNfc(idCarnet);
    }
    
}
