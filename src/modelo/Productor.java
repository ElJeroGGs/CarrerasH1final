/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author luis_
 */
public class Productor extends Thread {
  private Buffer buffer;
  private CarreraHIlos piloto;

  public Productor(Buffer buffer) {
    this.buffer = buffer;
  }

  public void setpiloto(CarreraHIlos piloto) {
    this.piloto = piloto;
  }

  public void run() {
    while(piloto.getPosicionActual() < 600) {
      int recorrido = (int) (Math.random() * 10+1);
      buffer.poner(recorrido);
      try {
        sleep(100);
      } catch (InterruptedException e) {
      }
    }
  }
}
