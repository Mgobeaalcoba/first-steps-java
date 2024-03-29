import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura: ");
        try {
            String descripcion = scanner.nextLine();
            System.out.println("Ingrese el precio del primer producto: ");
            double primerPrecio = scanner.nextDouble();
            System.out.println("Ingrese el precio del segundo producto: ");
            double segundoPrecio = scanner.nextDouble();
            double total = primerPrecio + segundoPrecio;
            double impuesto = total * 0.19;
            double totalConImpuesto = total + impuesto;
            System.out.println("La factura " + descripcion + " tiene un total bruto de " + total + " con un impuesto de " + impuesto + " para un total de " + totalConImpuesto + " pesos.");
        } catch (Exception e) {
            System.out.println("Ha ingresado un valor incorrecto y esto ha generado un error de tipo " + e.getMessage());
            main(args);
            System.exit(0);
        } finally {
            scanner.close();
        }
    }
}
