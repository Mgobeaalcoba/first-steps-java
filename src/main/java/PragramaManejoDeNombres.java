import java.util.Scanner;

public class PragramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el primer nombre de tu familia: ");
        String nombre1 = scanner.nextLine();
        String codigo1 = obtenerCodigo(nombre1);
        System.out.println("Proporciona el segundo nombre de tu familia: ");
        String nombre2 = scanner.nextLine();
        String codigo2 = obtenerCodigo(nombre2);
        System.out.println("Proporciona el tercer nombre de tu familia: ");
        String nombre3 = scanner.nextLine();
        String codigo3 = obtenerCodigo(nombre3);
        System.out.println("Proporciona el cuarto nombre de tu familia: ");
        String nombre4 = scanner.nextLine();
        String codigo4 = obtenerCodigo(nombre4);
        String[] listCodigos = {codigo1, codigo2, codigo3, codigo4};
        String codigoConcatenado = obtenerCodigoConcatenado(listCodigos);
        System.out.println("Codigo concatenado: " + codigoConcatenado);
    }
    // Metodo para obtener el codigo de un nombre
    public static String obtenerCodigo(String nombre) {
        return nombre.substring(1, 2).toUpperCase().concat(".").concat(nombre.substring(nombre.length() -2));
    }
    // Metodo para la impresion concatenada de los codigos
    public static String obtenerCodigoConcatenado(String[] codigos) {
        return codigos[0] + "_" + codigos[1] + "_" + codigos[2] + "_" + codigos[3];
    }
}
