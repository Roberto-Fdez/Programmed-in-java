package MayorDeEdad;

import java.util.Scanner;

public class MayorDeEdad {

    // Definir el año actual como una constante global
    public static final int AÑO_ACTUAL = 2024;

    // Función para calcular la edad
    public static int calcularEdad(int añoNacimiento) {
        return AÑO_ACTUAL - añoNacimiento;
    }

    // Función para determinar si es mayor de edad
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el año de nacimiento del usuario
        System.out.print("Introduce tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        // Calcular la edad
        int edad = calcularEdad(añoNacimiento);

        // Determinar si es mayor de edad y mostrar el resultado
        if (esMayorDeEdad(edad)) {
            System.out.println("Tienes " + edad + " años, eres mayor de edad.");
        } else {
            System.out.println("Tienes " + edad + " años, no eres mayor de edad.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}