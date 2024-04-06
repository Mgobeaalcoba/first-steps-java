import java.util.Scanner;

public class OrdenadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el primer número: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el segundo número: ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        int max = obtenerNumeroMayor(numero1, numero2);
        System.out.println("El número mayor es: " + max);
    }
    // Metodo para obtener el número mayor
    public static int obtenerNumeroMayor(int numero1, int numero2) {
        return (numero1 > numero2) ? numero1 : numero2;
    }
}
