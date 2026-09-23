public class Lista {
    private Nodo cabeza;
    private int tamano;

    public Lista() {
        this.cabeza = null;
        this.tamano = 0;
    }

    public int obtenerTamano() {
        return tamano;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public void encolar(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.obtenerSiguiente() != null) {
                actual = actual.obtenerSiguiente();
            }
            actual.agregarSiguiente(nuevo);
        }
        tamano++;
    }

    public Cliente desencolar() {
        if (cabeza == null) return null;
        Cliente atendido = cabeza.obtenerCliente();
        cabeza = cabeza.obtenerSiguiente();
        tamano--;
        return atendido;
    }

    public Cliente obtener(int indice) {
        if (indice < 0 || indice >= tamano) return null;
        Nodo actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.obtenerSiguiente();
        }
        return actual.obtenerCliente();
    }
}