import java.util.Scanner;

public class CalculadoraAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el radio de su circulo: ");
        try {
            double radio = scanner.nextDouble();
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area del circulo es: " + area);
        } catch (Exception e) {
            System.out.println("Error al ingresar datos, por favor ingrese un numero valido");
        }
    }
}
