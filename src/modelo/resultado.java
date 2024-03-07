package modelo;

public class resultado {
    private int[] valores = new int[3];

    public synchronized void setValor(int id, int valor) {
        this.valores[id] = valor;
    }

    public synchronized int getValor(int id) {
        return valores[id];
    }

    public String toString(){

        String cadena;
        cadena = String.valueOf(valores[0]) + String.valueOf(valores [1]) + String.valueOf(valores[2]) ;
    
        return cadena;
    }

}