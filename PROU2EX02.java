/***************************************/
/* Nom:   Roberto Fernández del Barrio */
/* DNI/NIE: 432 328 19H 			*/
/* Data: 25 10 2024 				*/
/* Exercici: PROU2EX02  			*/
/***************************************/
package menu;

//Importo la clase "Scanner"
import java.util.Scanner;

public class PROU2EX02 {
    public static void main(String[] args) {
        // Creación de todas las variables de las que se les dará uso más tarde.
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado = 0;

        // Bucle "for" que permitirá hasta 5 operaciones o menos si elige "Salir".
        for (int i = 0; i < 5; i++) {
            // Mostrar menú de opciones con: Suma, Resta, Multiplicación, División y como se
            // explicó antes, una opción de Salir.
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción seleccionada anteriormente en el "for".
            opcion = sc.nextInt();

            // Salir del programa si elige la opción 5.
            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Solicitar los números al usuario. Introducirá 2, uno tras otro que formarán
            // la operación que haya solicitado anteriormente.
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextDouble();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextDouble();

            // Realizar la operación según la opción seleccionada usando switch.
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado de la multiplicación: " + resultado);
                    break;
                case 4:
                    // Manejar la división por cero.
                    if (num2 == 0) {
                        // Si el segundo número (divisor) es 0, se muestra un mensaje de error.
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        // Si el divisor no es 0, se realiza la división.
                        resultado = num1 / num2;

                        // Se imprime el resultado de la división.
                        System.out.println("Resultado de la división: " + resultado);
                    }

                    // Termina la ejecución en este caso del switch, evitando que el código continúe
                    // con el siguiente caso.
                    break;

                default:
                    // En caso de que el valor de la opción no coincida con ninguna de las opciones
                    // previstas en el switch, se muestra un mensaje indicando que la opción no es
                    // válida.
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
                    break;
            }

            // Preguntar si desea realizar otra operación (hasta 5 veces como máximo).
            if (i < 4) { // No pregunta si es la última iteración, sino pide si necesita el usuario
                         // alguna operación más.
                System.out.println("¿Alguna operación más? (sí/no)");
                String continuar = sc.next();
                if (continuar.equalsIgnoreCase("no")) {
                    System.out.println("Cerrando menú...");
                    break;
                }
            }
        }
        // Cerramos el programa y se finaliza.
        sc.close();
    }
}
// Fin del código.