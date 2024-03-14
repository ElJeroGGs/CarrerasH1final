package control;

import modelo.Buffer;
import modelo.Consumidor;
import modelo.Productor;

public class controlcarrera {

    private modelo.CarreraHIlos Checo;
    private modelo.CarreraHIlos Max;
    private modelo.CarreraHIlos Hamilton;
    private vista.main vistaMain;
    private modelo.resultado res;
    

    public void setCheco(modelo.CarreraHIlos Checo) {
        this.Checo = Checo;
    }

    public void setMax(modelo.CarreraHIlos Max) {
        this.Max = Max;
    }

    public void setHamilton(modelo.CarreraHIlos Hamilton) {
        this.Hamilton = Hamilton;
    }

    public void setVistaMain(vista.main vistaMain) {
        this.vistaMain = vistaMain;
    }

public void iniciarCarrera(){

    this.vistaMain.setVisible(true);

    Buffer b1;
    
    b1 = new Buffer();

    Productor p1 = new Productor(b1);
    Productor p2 = new Productor(b1);
    Productor p3 = new Productor(b1);
    Consumidor c1 = new Consumidor (b1);
    Consumidor c2 = new Consumidor(b1);
    Consumidor c3 = new Consumidor(b1);


    //colocamos pilotos con productores y consumidores

   
p1 = new Productor(b1);

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
        this.vistaMain.pintapanel(this.res);

        if(res.getValor(0)>=100){

            
    p1.setPiloto(Checo);
    c1.setPiloto(Checo);
            p1.start();
            c1.start();

        }
    }



    
    
}

    public void setResultado(modelo.resultado res) {

        this.res = res;
    }
}
