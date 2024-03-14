package modelo;

public class Productor extends Thread {
    private Buffer buffer;
    private CarreraHIlos piloto;

    public Productor(Buffer b1) {
      this.buffer = b1;
    }

    public void setPiloto(CarreraHIlos piloto){

        this.piloto = piloto;
    }
  
    public void run() {
      for (int i = 0; i < 10; i++) {
        System.out.println(this.piloto.getName()+" entro en los pits");
        buffer.entrar();
        try {
         this.piloto.wait();
         sleep(10000);
        } catch (InterruptedException e) {
        }
      }
    }
  }