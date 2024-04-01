public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola";
        Class clase = texto.getClass();
        System.out.println("clase.getName() = " + clase.getName()); // Nombre completo de la clase
        System.out.println("clase.getSimpleName() = " + clase.getSimpleName()); // Nombre de la clase
        System.out.println("clase.getCanonicalName() = " + clase.getCanonicalName()); // Nombre canónico de la clase
    }
}
