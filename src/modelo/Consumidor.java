package modelo;

public class Consumidor extends Thread {
    private final Buffer buffer;
    private CarreraHIlos piloto;
  
    public Consumidor(Buffer buffer) {
      this.buffer = buffer;
    }

    public void setPiloto(CarreraHIlos piloto){

        this.piloto = piloto;
    }
  
  
    public void run() {
        buffer.salir();
        System.out.println(this.piloto.getName()+" salio de los pits");
       
    }
  }
  