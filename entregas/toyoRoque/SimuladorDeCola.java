import java.util.Random;

public class SimuladorDeCola {
    public static void main(String[] args) {
        Random rand = new Random();
        Cola fila = new Cola(50);
        int personasAtendidas = 0;
        int contadorPersonas = 0;

        for (int minuto = 1; minuto <= 120; minuto++) {
            if (rand.nextDouble() < 0.6) {
                contadorPersonas++;
                fila.encolar(new Persona(contadorPersonas, minuto, false));
            }

            if (rand.nextDouble() < 0.4 && fila.getTamano() > 0) {
                fila.desencolar();
                personasAtendidas++;
            }
        }
    }
}