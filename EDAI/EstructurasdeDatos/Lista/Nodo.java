package EDAI.EstructurasdeDatos.Lista;

public class Nodo {
    private int dato;
    private Nodo siguiente;

    public Nodo (int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo (int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    
    public int obtenerDato() {
        return dato;
    }

    public void fijarDato (int dato) {
        this.dato = dato;
    }

    public Nodo obtenerSiguienteDato () {
        return siguiente;
    }

    public void fijarSiguienteDato( Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
