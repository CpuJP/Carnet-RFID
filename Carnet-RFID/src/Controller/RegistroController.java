package Controller;

import DAO.RegistrarDAO;
import Model.Registrar;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RegistroController {
    
    public boolean saveRegistro(Registrar rg) throws FileNotFoundException, SQLException{
        RegistrarDAO rgDAO = new RegistrarDAO();
        return rgDAO.createUsuario(rg);
    }
    
    public int validarRegistro(String usuario) throws FileNotFoundException, SQLException{
        RegistrarDAO rgDAO = new RegistrarDAO();
        return rgDAO.validarUsuario(usuario);
    }
    
    public boolean validarCorreo(String correo) throws FileNotFoundException, SQLException{
        RegistrarDAO rgDAO = new RegistrarDAO();
        return rgDAO.exiteEmail(correo);
    }
    
    public boolean validarLogin(Registrar rg) throws FileNotFoundException, SQLException{
        RegistrarDAO rgDAO = new RegistrarDAO();
        return rgDAO.LoginUsuario(rg);
    }
}
