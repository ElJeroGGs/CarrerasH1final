package control;

public class controlcarrera {

    private modelo.CarreraHIlos Checo;
    private modelo.CarreraHIlos Max;
    private modelo.CarreraHIlos Hamilton;
    private vista.main vistaMain;
    private modelo.resultado res;

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

    this.vistaMain.setVisible(true);
    modelo.CarreraHIlos ChecoPerez = new modelo.CarreraHIlos(this.res,0);
    modelo.CarreraHIlos MaxVerstappen = new modelo.CarreraHIlos(this.res,1);
    modelo.CarreraHIlos LewisHamilton = new modelo.CarreraHIlos(this.res,2);

    this.Checo = ChecoPerez;
    this.Max = MaxVerstappen;
    this.Hamilton = LewisHamilton;

    Checo.start();
    Max.start();
    Hamilton.start();

    while (res.getValor(0)<1000 || res.getValor(1)<1000 ||  res.getValor(2)<1000)
    {
        this.vistaMain.pintapanel(res);
    }
    
}

public void setResultado(modelo.resultado res){

    this.res = res;
}
}
