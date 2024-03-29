public class CompararStrings {
    public static void main(String[] args) {
        // Comparación de Strings
        String nombre = "Juan";
        String nombre2 = new String("Juan");
        System.out.println("nombre == nombre2 = " + (nombre == nombre2)); // false porque son dos objetos distintos
        System.out.println("nombre.equals(nombre2) = " + nombre.equals(nombre2)); // true porque el contenido es el mismo
    }
}
