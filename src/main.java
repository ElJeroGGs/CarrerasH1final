
public class main {

    public static void main(String[] args) {
    vista.main vistaMain;
        modelo.CarreraHIlos ChecoPerez = new modelo.CarreraHIlos("Checo Perez",1);
        modelo.CarreraHIlos MaxVerstappen = new modelo.CarreraHIlos("Max Verstappen",2);
       modelo.CarreraHIlos LewisHamilton = new modelo.CarreraHIlos("Lewis Hamilton",3);

       control.controlcarrera controlCarrera = new control.controlcarrera();
        vistaMain = new vista.main();
        controlCarrera.setCheco(ChecoPerez);
        controlCarrera.setMax(MaxVerstappen);
        controlCarrera.setHamilton(LewisHamilton);
        controlCarrera.setVistaMain(vistaMain);
        controlCarrera.iniciarCarrera();
    }



}
