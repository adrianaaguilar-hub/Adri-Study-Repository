package EDAI.EstructurasdeDatos.Lista;

public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int cantidadElementos;

    public Lista () {
        this.inicio = null;
        this.fin = null;
    }

    public Nodo obtenerInicio () {
        return inicio;
    }

    public void fijarInicio (Nodo inicio) {
        this.inicio = inicio;
    }

    //prueba

    public Nodo obtenerFin () {
        return fin;
    }

    public void fijarFin (Nodo fin) {
        this.fin = fin;
    }

    public int obtenerCantidadElementos () {
        return cantidadElementos;
    }

    public void fijarCantidadElementos (int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    public boolean estaVacia () {
        return inicio == null && fin == null;
    }

    private void agregarInicio () {

    }

    private void agregarFinal () {

    }

    private void quitarElementoInicio () {

    }

    private void quitarElementoFinal () {
         
    }


}
