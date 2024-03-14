import java.nio.Buffer;

import control.controlcarrera;
import modelo.Consumidor;
import modelo.Productor;
import modelo.resultado;

public class main {

    public static void main(String[] args) {
    vista.main vistaMain;
    modelo.resultado res;
    

    

        
        res = new resultado();
        vistaMain = new vista.main();
       control.controlcarrera controlCarrera = new control.controlcarrera();
       controlCarrera.setResultado(res);
       controlCarrera.setVistaMain(vistaMain);

        controlCarrera.iniciarCarrera();
    }



}
