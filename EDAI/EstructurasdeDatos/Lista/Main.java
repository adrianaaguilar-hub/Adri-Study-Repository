package EDAI.EstructurasdeDatos.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregarInicio(1);
        lista.agregarFinal(2);
        System.out.println(lista.mostrar());
    }
}
