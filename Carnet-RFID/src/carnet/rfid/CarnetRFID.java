package carnet.rfid;

import Controller.menuMainController;

public class CarnetRFID {

    public static void main(String[] args) {
        CarnetRFID crfid = new CarnetRFID();
        crfid.vista();
        
    }
    
    public void vista(){
        menuMainController mmc = new menuMainController();
        mmc.mostrarVista();
    }
    
}
