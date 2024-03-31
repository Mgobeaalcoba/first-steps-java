import java.util.Scanner;

public class VeinteNotasFinales {
    public static void main(String[] args) {
        int contadorMayoresCinco = 0;
        double sumaMayoresCinco = 0.0;
        int contadorMenoresCuatro = 0;
        double sumaMenoresCuatro = 0.0;
        int contadorNotasUno = 0;
        int contadorTotal = 0;
        double sumaTotal = 0.0;

        for (int i = 0; i < 20; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proporciona una nota: ");
            double nota = scanner.nextDouble();
            if (nota == 0) {
                System.out.println("La nota ingresada es 0, se termina el programa");
                System.exit(0); // Termina el programa
            }
            if (nota > 5) {
                contadorMayoresCinco++;
                sumaMayoresCinco += nota;
            } else if (nota < 4) {
                contadorMenoresCuatro++;
                sumaMenoresCuatro += nota;
            }
            if (nota == 1) {
                contadorNotasUno++;
            }
            contadorTotal++;
            sumaTotal += nota;
        }

        System.out.println("Cantidad de notas mayores a 5: " + contadorMayoresCinco);
        System.out.println("Promedio de notas mayores a 5: " + sumaMayoresCinco / contadorMayoresCinco);
        System.out.println("Cantidad de notas menores a 4: " + contadorMenoresCuatro);
        System.out.println("Promedio de notas menores a 4: " + sumaMenoresCuatro / contadorMenoresCuatro);
        System.out.println("Cantidad de notas iguales a 1: " + contadorNotasUno);
        System.out.println("Promedio de todas las notas: " + sumaTotal / contadorTotal);
    }
}
