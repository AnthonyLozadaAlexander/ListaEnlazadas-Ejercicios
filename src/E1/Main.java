package E1;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Agregamos 10 al inicio: ");
        lista.insertarAlInicio(10);
        lista.imprimir();

        System.out.println("\nAgregando 20 al final: ");
        lista.insertarAlFinal(20);
        lista.imprimir();

        System.out.println("\nAgregando 5 al inicio: ");
        lista.insertarAlInicio(5);
        lista.imprimir();
    }
}
