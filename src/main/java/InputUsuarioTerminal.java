import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUsuarioTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner
        System.out.println("Ingrese un número entero: ");
        // String numeroStr = scanner.nextLine(); // Solicitar un número entero como String
        try {
            int numero = scanner.nextInt(); // Convertir el String a int
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("El valor ingresado no es un número entero.");
            main(args); // Llamada recursiva a main si falla la conversión
            System.exit(0);
        } finally {
            scanner.close(); // Cerrar el objeto Scanner
        }
    }
}
