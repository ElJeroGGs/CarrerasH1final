package modelo;

import java.util.Random;

public class CarreraHIlos extends Thread implements Runnable {
    private static final int META = 100;
    private static final int NUM_HILOS = 4;
    private static int posicionActual = 0;
    private static boolean[] llegoMeta = new boolean[NUM_HILOS];
    private int id;
    private String name;

    public CarreraHIlos(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (posicionActual < META) {
            int avance = random.nextInt(10) + 1;
            posicionActual += avance;
            System.out.println(this.name + (id) + " avanzo " + avance + " unidades. Posicion actual: " + posicionActual);
            if (posicionActual >= META) {
                llegoMeta[id] = true;
                System.out.println("Hilo " + (id) + " llegó a la meta!");
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}