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
        nuevoNodo.next = cabeza; // El Nuevo Nodo mira a la antigua cabeza
        cabeza = nuevoNodo; // La Cabeza de la lista se actualiza
    }

    public void insertarAlFinal(int data){
        Nodo nuevoNodo = new Nodo(data);

        // si la lista esta vacia, el nuevo nodo es la cabeza
        if(cabeza == null){
            cabeza = nuevoNodo;
            return;
        }

        // si no esta vacio, creamos un puntero temporal para recorrerla
        Nodo actual = cabeza;

        // Mientras el nodo actual tenga un nodo siguiente, avanzamos
        while(actual.next != null){
            actual = actual.next;
        }

        // Al salir del bucle, actual es el ultimo nodo, lo enlazamos al nuevo.
        actual.next = nuevoNodo;
    }

    public void imprimir(){
        Nodo actual = cabeza;
        System.out.println("Estado de la memoria: ");

        while(actual != null){
            System.out.println(actual.data + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}