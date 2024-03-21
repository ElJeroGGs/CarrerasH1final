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
public class Consumidor extends Thread {
  private final Buffer buffer;
  private CarreraHIlos piloto;

  public Consumidor(Buffer buffer) {
    this.buffer = buffer;
  }

  public void setpiloto(CarreraHIlos piloto) {
    this.piloto = piloto;
  }

  public void run() {
    int valor;
    while(this.piloto.getPosicionActual() < 600){
      valor = buffer.recoger();
      this.piloto.setPosicionActual(valor);
      try {
        sleep(300);
      } catch (InterruptedException e) {
      }
    }
  }
}
