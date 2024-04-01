import java.util.Scanner;

public class MultiplicacionSinSigno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el primer número: ");
        int a = scanner.nextInt();
        System.out.println("Proporciona el segundo número: ");
        int b = scanner.nextInt();
        int resultado = 0;
        if (b < 0) {
            b = -b;
            for (int i = 0; i < b; i++) {
                resultado += a;
            }
            resultado = -resultado;
        } else {
            for (int i = 0; i < b; i++) {
                resultado += a;
            }
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
