package modelo;

import java.util.Random;

public class CarreraHIlos extends Thread implements Runnable {
    private static final int META = 1000;
    private static final int NUM_HILOS = 4;
    private int posicionActual = 0;
    private static boolean[] llegoMeta = new boolean[NUM_HILOS];
    private int id;
    private String name;
    private resultado res;

    public CarreraHIlos(resultado res, int id) {
        this.id = id;
        this.res = res;
    }

    @Override
    public void run() {
        //Random random = new Random();
        while (posicionActual < META) {
            //int avance = random.nextInt(25) + 1;
            //posicionActual += avance;
            try {
                Thread.sleep(80); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            resultado res = this.res;
            res.setValor(id, posicionActual);

        }
    }

    

    public int getPosicionActual(){
        return this.posicionActual;
    }

public void setResultado(modelo.resultado res){

    this.res = res;
}

public void setPosicionActual(int valor) {
    
    this.posicionActual += valor;
}

}