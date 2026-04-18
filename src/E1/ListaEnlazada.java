package E1;

public class ListaEnlazada {

    private class Nodo { // clase encapsulada para el Nodo
        int data;
        Nodo next;

        public Nodo(int data){
            this.data = data;
            this.next = null;
        }
    }


    // Puntero maestro: nos dice donde empieza la lista
    private Nodo cabeza;

    // Constructor: Al crear la lista, la cabeza es null
    public ListaEnlazada(){
        this.cabeza = null;
    }

    public void insertarAlInicio(int data){
        Nodo nuevoNodo = new Nodo(data);
        nuevoNodo.next = cabeza;
        cabeza = nuevoNodo;
    }
}