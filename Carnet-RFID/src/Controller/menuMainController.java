package Controller;

import View.Registro.login;

public class menuMainController {
    
    public static login frnLogin;
    
    public void mostrarVista(){
        if (frnLogin == null) {
            frnLogin = new login();
            frnLogin.setVisible(true);
        }
    }
}
