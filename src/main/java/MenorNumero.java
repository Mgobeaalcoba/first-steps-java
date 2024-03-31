import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadValores;
        System.out.println("Proporciona la cantidad de valores a comparar: ");

        try {
            cantidadValores = scanner.nextInt();
            int[] valores = new int[cantidadValores];
            for (int i = 0; i < cantidadValores; i++) {
                System.out.println("Proporciona el valor " + (i + 1) + ": ");
                valores[i] = scanner.nextInt();
            }

            int menor;
            if (cantidadValores > 0) {
                menor = valores[0];
                for (int i = 1; i < cantidadValores; i++) {
                    if (valores[i] < menor) {
                        menor = valores[i];
                    }
                }
                if (menor < 10) {
                    System.out.println("El numero menor es menor que 10!");
                } else {
                    System.out.println("el numero menor es igual o mayor que 10!");
                }
            } else {
                System.out.println("No hay valores para comparar");
            }
        } catch (Exception e) {
            // Muestra el error en consola, corta la ejecución y vuelve a llamar al método main
            System.out.println("Error: Debes proporcionar un número entero");
            main(args);
            System.exit(0);
        }
    }
}
