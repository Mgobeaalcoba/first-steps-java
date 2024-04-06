public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // String literal. Es un objeto de la clase String. No es un primitivo.
        String curso2 = new String("Programación Java"); // String como objeto. Es un objeto de la clase String. No es un primitivo.
        boolean esIgual = curso == curso2; // Compara las referencias de los objetos
        System.out.println("esIgual = " + esIgual);
        esIgual = curso.equals(curso2); // Compara el contenido de los objetos
        System.out.println("esIgual = " + esIgual);
        String curso3 = "programación java"; // String literal. Es un objeto de la clase String. No es un primitivo.
        esIgual = curso.equalsIgnoreCase(curso3); // Compara el contenido de los objetos ignorando mayúsculas y minúsculas
        System.out.println("esIgual = " + esIgual);
        String curso4 = curso; // Asigna la referencia del objeto curso a curso4
        esIgual = curso == curso4; // Compara las referencias de los objetos curso y curso4 (son iguales)
        System.out.println("esIgual = " + esIgual);
    }
}
