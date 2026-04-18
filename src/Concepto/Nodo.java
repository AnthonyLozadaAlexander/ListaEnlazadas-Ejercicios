package Concepto;

class Nodo {
    int data;  // el valor que guarda
    Nodo next; // la referencia al proximo nodo

    // constructor para creacion del Nodo
    public Nodo(int data){
        this.data = data;
        this.next = null; // por defecto no apunta a nada
    }

    public void imprimir(){
        Nodo actual = this; // apunta al nodo Actual
        StringBuilder salida = new StringBuilder(); // Objeto para concatenar cadenas de texto como los nodos y punteros

        // mientras tenga un nodo siguiente
        while(actual != null){
            salida.append(actual.data).append(" -> ");
            actual = actual.next; // avanzamos al siguiente Nodo
        }

        salida.append("null"); // se ha llegado al ultimo elemento y el puntero apunta a Null
        System.out.println(salida.toString());
    }
}

