import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona su nombre y apellido: ");
        String nombreApellido = scanner.nextLine();
        String nombre = nombreApellido.split(" ")[0];
        System.out.println("Proporciona otro nombre y apellido: ");
        String nombreApellido2 = scanner.nextLine();
        String nombre2 = nombreApellido2.split(" ")[0];
        String nombreYApellidoMasLargo = (nombre.length() > nombre2.length()) ? nombreApellido : nombreApellido2;
        String nombreMasLargo = nombreYApellidoMasLargo.split(" ")[0];
        System.out.println("Proporcione otro nombre y apellido: ");
        String nombreApellido3 = scanner.nextLine();
        String nombre3 = nombreApellido3.split(" ")[0];
        nombreYApellidoMasLargo = (nombreMasLargo.length() > nombre3.length()) ? nombreYApellidoMasLargo : nombreApellido3;
        System.out.println("El nombre más largo es: " + nombreYApellidoMasLargo);
    }
}
