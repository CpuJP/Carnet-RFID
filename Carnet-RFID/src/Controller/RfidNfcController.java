package Controller;

import Model.RfidNfc;
import DAO.RfidNfcDAO;
import java.util.List;

public class RfidNfcController {
    
    public void saveRfidNfc(RfidNfc rn){
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        rnDAO.createRfidNfc(rn);
    }
    
    public RfidNfc getIdPersonaByRfidNfc(String RfidNfc){
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getPersonaURfidNfc(RfidNfc);
    }
    
    public RfidNfc getIdPersonaAndIdRfidNfcByRfidNfc(String RfidNfc){
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getIdPersonaRAndfidNfcByRfidNfc(RfidNfc);
    }
    
    public RfidNfc getIdPersonaAndIdRfidNfcByIdPersona(String idPersona){
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getIdPersonaRAndfidNfcByIdPersona(idPersona);
    }
    
    public List<RfidNfc> getAllIdPersona(){
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        return rnDAO.getAllIdPersonasRfidNfc();
    }
    
    public void updateRfidNfc(RfidNfc rn){
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        rnDAO.updateRfidNfc(rn);
    }
    
    public void deleteRfidNfc(String idCarnet){
        RfidNfcDAO rnDAO = new RfidNfcDAO();
        rnDAO.deleteRfidNfc(idCarnet);
    }
    
}
