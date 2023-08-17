
package controlador;

import vista.VistaMonedas;
import vista.VistaTemperatura;

public class Controlador { 
    
    public Controlador(int opcion){
        VistaMonedas vistaMonedas = new VistaMonedas();
        VistaTemperatura vistaTemperatura = new VistaTemperatura();
        
        switch(opcion){
            case 1:
                vistaMonedas.setVisible(true);
                break;
            case 2:
                vistaTemperatura.setVisible(true);
                break;
        }
    }
}
