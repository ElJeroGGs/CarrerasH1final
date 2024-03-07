package control;

public class controlcarrera {

    private modelo.CarreraHIlos Checo;
    private modelo.CarreraHIlos Max;
    private modelo.CarreraHIlos Hamilton;
    private vista.main vistaMain;

    public void setCheco(modelo.CarreraHIlos Checo){
    this.Checo = Checo;
}

public void setMax(modelo.CarreraHIlos Max){
    this.Max = Max;}

public void setHamilton(modelo.CarreraHIlos Hamilton){
    this.Hamilton = Hamilton;}

public void setVistaMain(vista.main vistaMain){
    this.vistaMain = vistaMain;}

public void iniciarCarrera(){
    Checo.start();
    Max.start();
    Hamilton.start();

    
    vistaMain.addIcon("checo.jpg", 100);
}
}
