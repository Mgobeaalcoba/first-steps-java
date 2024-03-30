public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.pdf";
        int i = archivo.lastIndexOf("."); // Obtiene la última posición del punto
        System.out.println("archivo.substring(" + (i + 1) + ") = " + archivo.substring(i + 1)); // pdf
    }
}
