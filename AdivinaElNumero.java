package adivina;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        // Crear un objeto Random para generar un número aleatorio
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Generar un número aleatorio entre 1 y 100

        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int intento; // Variable para almacenar los intentos del usuario

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He pensado en un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        // Bucle while para que el usuario intente adivinar el número
        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            // Comprobar si el intento es mayor, menor o igual al número aleatorio
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo, intenta nuevamente.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto, intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }

        while (intento != numeroAleatorio); // El bucle continúa hasta que se adivine el número

        // Cerrar el Scanner
        scanner.close();
    }
}