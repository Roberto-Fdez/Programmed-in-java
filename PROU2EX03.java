/***************************************/
/* Nom:   Roberto Fernández del Barrio */
/* DNI/NIE: 432 328 19H 			*/
/* Data: 08 11 2024 				*/
/* Exercici: PROU2EX03  			*/
/***************************************/
package monedas;

import java.util.Scanner;

public class PROU2EX03 {
    public static void main(String[] args) {
        // Creamos el "Scanner" así de esta manera podremos hacer el usuario ponga una
        // serie de ordenes que le enseñaremos mediante un menú y así el programa pueda
        // funcionar.
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        // Creamos un while para que marque y muestre el menú que estamos a punto de
        // enseñarle al usuario.
        while (!salir) {
            // Muestra el menú de opciones para que pueda el usuario escoger una opción de
            // la que hacer uso.
            System.out.println("\nEscribe la opción del menú que quieres que se realice: ");
            System.out.println("1. Dólares a Euros");
            System.out.println("2. Dólares a Pesos Mexicanos");
            System.out.println("3. Dólares a Dirhams");
            System.out.println("4. Euros a Dólares");
            System.out.println("5. Euros a Pesos Mexicanos");
            System.out.println("6. Euros a Dirhams");
            System.out.println("7. Pesos Mexicanos a Dólares");
            System.out.println("8. Pesos Mexicanos a Euros");
            System.out.println("9. Pesos Mexicanos a Dirhams");
            System.out.println("10. Dirhams a Euros");
            System.out.println("11. Dirhams a Dólares");
            System.out.println("12. Dirhams a Pesos Mexicanos");
            System.out.println("13. Salir");

            // Creamos una variable llamada "opcion" que será literalmente la opción que
            // escoja el usuario.
            int opcion = scanner.nextInt();

            // Si el usuario escoge la opción número "7" se acabará el programa.
            if (opcion == 13) {
                salir = true;
                System.out.println("Cerrando el programa...");
                break;
            }

            // Creamos un error para que se muestre en caso de que el valor añadido del menú
            // no sea válido y así pueda volver a poner una opción nueva.
            if (opcion < 1 || opcion > 13) {
                System.out.println("Error en la opción, añadela de nuevo: ");
                continue;
            }

            // Le pedimos al usuario que ponga una cantidad de dinero para realizar la
            // conversión.
            System.out.print("Introduce una cantidad: ");
            double cantidad = scanner.nextDouble();

            // De nuevo creamos una especie de error y así le mostramos al usuario para que
            // pueda añadir de nuevo la cantidad correspondiente, positiva y correcta.
            if (cantidad <= 0) {
                System.out.println("La cantidad ha de ser en un valor positivo, porfavor introducela de nuevo.");
                continue;
            }
            // Realizamos las conversiones de todas la monedas que permita el menú.
            final double USD_A_EUR = 0.85;
            final double USD_A_MXN = 20.0;
            final double EUR_A_MXN = 23.50;
            final double DIR_A_MXN = 0.24;
            final double DIR_A_EUR = 10.58;
            final double USD_A_DIR = 9.79;

            // Creamos las variables para que se puedan realizar las conversiones mostradas
            // anteriormente.
            double resultado = 0;
            String monedaorigen = "";
            String monedadestino = "";

            // Realizamos las conversiones según lo que haya añadido el usuario en la opción
            // del menú.
            switch (opcion) {
                case 1: // Dólares a Euros.
                    resultado = cantidad * USD_A_EUR;
                    monedaorigen = "dólares";
                    monedadestino = "euros";
                    break;
                case 2: // Dólares a Pesos Mexicanos.
                    resultado = cantidad * USD_A_MXN;
                    monedaorigen = "dólares";
                    monedadestino = "pesos mexicanos";
                    break;
                case 3: // Dólares a Dirhams.
                    resultado = cantidad * USD_A_DIR;
                    monedaorigen = "dólares";
                    monedadestino = "dirhams";
                    break;
                case 4: // Euros a Dólares.
                    resultado = cantidad / USD_A_EUR;
                    monedaorigen = "euros";
                    monedadestino = "dólares";
                    break;
                case 5: // Euros a Pesos Mexicanos.
                    resultado = cantidad * EUR_A_MXN;
                    monedaorigen = "euros";
                    monedadestino = "pesos mexicanos";
                    break;
                case 6: // Euros a Dirhams.
                    resultado = cantidad * DIR_A_EUR;
                    monedaorigen = "euros";
                    monedadestino = "dirhams";
                    break;
                case 7: // Pesos Mexicanos a Dólares.
                    resultado = cantidad / USD_A_MXN;
                    monedaorigen = "pesos mexicanos";
                    monedadestino = "dólares";
                    break;
                case 8: // Pesos Mexicanos a Euros.
                    resultado = cantidad / EUR_A_MXN;
                    monedaorigen = "pesos mexicanos";
                    monedadestino = "euros";
                    break;
                case 9: // Pesos Mexicanos a Dirhams.
                    resultado = cantidad * DIR_A_MXN;
                    monedaorigen = "pesos mexicanos";
                    monedadestino = "dirhams";
                    break;
                case 10: // Dirhams a Euros.
                    resultado = cantidad / DIR_A_EUR;
                    monedaorigen = "dirhams";
                    monedadestino = "euros";
                    break;
                case 11: // Dirhams a Dólares.
                    resultado = cantidad / USD_A_DIR;
                    monedaorigen = "dirhams";
                    monedadestino = "dólares";
                    break;
                case 12: // Dirhams a Pesos Mexicanos.
                    resultado = cantidad / DIR_A_MXN;
                    monedaorigen = "dirhams";
                    monedadestino = "pesos mexicanos";
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println("El resultado de convertir " + cantidad + " " + monedaorigen + " a " + monedadestino
                    + " es: " + resultado);

        }
        // Cerramos el "Scanner" para que así se pueda acabar el programa correctamente.
        scanner.close();
    }
}
// Fin del programa.