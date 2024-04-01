public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola";
        Class clase = texto.getClass();
        System.out.println("clase.getName() = " + clase.getName()); // Nombre completo de la clase
        System.out.println("clase.getSimpleName() = " + clase.getSimpleName()); // Nombre de la clase
        System.out.println("clase.getCanonicalName() = " + clase.getCanonicalName()); // Nombre canónico de la clase
        System.out.println("clase.getTypeName() = " + clase.getTypeName()); // Nombre de la clase
        System.out.println("clase.getPackageName() = " + clase.getPackageName()); // Paquete de la clase
        System.out.println("clase.isInterface() = " + clase.isInterface()); // ¿Es una interfaz?
        System.out.println("clase.isArray() = " + clase.isArray()); // ¿Es un array?
        System.out.println("clase.isPrimitive() = " + clase.isPrimitive()); // ¿Es un tipo primitivo?
        System.out.println("clase.isAnnotation() = " + clase.isAnnotation()); // ¿Es una anotación?

        // Conocer los métodos de la clase
        java.lang.reflect.Method[] metodos = clase.getMethods();
        for (java.lang.reflect.Method metodo : metodos) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
