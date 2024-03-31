public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null; // Compara si la referencia de curso es nula
        System.out.println("esNulo = " + esNulo); // El resultado es true
        if (esNulo) {
            curso = "Programación Java";
        } // Asigna un valor a curso si es nulo
        try {
            int longitud = curso.length(); // Lanza NullPointerException
            System.out.println("longitud = " + longitud);
        } catch (NullPointerException e) {
            System.out.println("Error de NullPointerException: " + e.getMessage());
        }

        // Validar si un String es vacío con isEmpty
        String texto = "";
        boolean esVacio = texto.isEmpty(); // Compara si el String es vacío
        System.out.println("esVacio = " + esVacio); // El resultado es true
        if (esVacio) {
            texto = "Hola";
        } // Asigna un valor a texto si es vacío
        System.out.println("texto = " + texto); // El resultado es "Hola"
        // Validar si un String es vacio usando length
        boolean esVacio2 = texto.length() == 0; // Compara si la longitud del String es 0
        System.out.println("esVacio2 = " + esVacio2); // El resultado es false
        // Validar si un String es vacío usando equals
        boolean esVacio3 = texto.equals(""); // Compara si el String es igual a ""
        System.out.println("esVacio3 = " + esVacio3); // El resultado es false

        // Validar si un String es blanco con isBlank
        String texto2 = "  ";
        boolean esBlanco = texto2.isBlank(); // Compara si el String es blanco
        System.out.println("esBlanco = " + esBlanco); // El resultado es true
        if (esBlanco) {
            texto2 = "Hola";
        } // Asigna un valor a texto2 si es blanco
        System.out.println("texto2 = " + texto2); // El resultado es "Hola"
        // Validar si un String es blanco usando trim
        boolean esBlanco2 = texto2.trim().isEmpty(); // Compara si el String es vacío después de quitar los espacios en blanco
        System.out.println("esBlanco2 = " + esBlanco2); // El resultado es false
        // Validar si un String es blanco usando replaceAll
        boolean esBlanco3 = texto2.replaceAll("\\s", "").isEmpty(); // Compara si el String es vacío después de reemplazar los espacios en blanco
        System.out.println("esBlanco3 = " + esBlanco3); // El resultado es false
    }
}
