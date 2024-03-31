import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        // Definir la capacidad del estanque de gasolina
        double capacidadEstanque = 70.0;
        // Definir la cantidad de gasolina en el estanque
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona la cantidad de gasolina en el estanque: ");
        double cantidadGasolina = scanner.nextDouble();
        extracted(cantidadGasolina);
    }

    private static void extracted(double cantidadGasolina) {
        if (cantidadGasolina == 70.0) {
            System.out.println("Estanque lleno");
        } else if (cantidadGasolina >= 60.0) {
            System.out.println("Estanque casi lleno");
        } else if (cantidadGasolina >= 40.0) {
            System.out.println("Estanque 3/4");
        } else if (cantidadGasolina >= 35.0) {
            System.out.println("Medio Estanque");
        } else if (cantidadGasolina >= 20.0) {
            System.out.println("Suficiente");
        } else if (cantidadGasolina >= 1.0) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Estanque vacío");
        }
    }
}
