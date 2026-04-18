package Concepto;

public class Main {
    public static void main(String[] args) {
        // Creamos los nodos
        Nodo primero = new Nodo(10);
        Nodo segundo = new Nodo(20);
        Nodo tercero = new Nodo(30);

        // los enlazamos
        primero.next = segundo;
        segundo.next = tercero;

        primero.imprimir();


    }
}
