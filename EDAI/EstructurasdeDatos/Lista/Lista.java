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

    //prueba 2

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
        if (vacia()) {
            inicio = fin = new Nodo(elemento);
        } else {
            inicio = new Nodo(elemento, inicio);
        }
        cantidadElementos ++;

    }

    private void agregarFinal () {
        if (vacia()) {
            agregarInicio(elemento);
        } else {
            fijarFin(new Nodo (elemento));
            fin = fin.obtenerFin
        }
        cantidadElementos ++;
    }

    private void quitarElementoInicio () {

    }

    private void quitarElementoFinal () {
         
    }

    public String mostrar () {
        String salida = "";
        Nodo auxiliar = inicio;
        while (auxiliar! = null) {
            salida += auxiliar.obtenerDato() + " ";
            auxiliar = auxiliar.obtenerSiguienteDato();
        }
        return salida;
    }


}
