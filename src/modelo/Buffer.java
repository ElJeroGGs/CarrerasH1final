package modelo;

public class Buffer {
   private boolean disponible=false;
 public synchronized void salir(){
     while(!disponible){
         try{
             wait();
         }catch(InterruptedException ex){}
     }
     disponible=false;
     notify();
   }
 
   public synchronized void entrar(){
      while(disponible){
         try{
             wait();
         }catch(InterruptedException ex){}
     }
     disponible=true;
     notify();
   }
 }
