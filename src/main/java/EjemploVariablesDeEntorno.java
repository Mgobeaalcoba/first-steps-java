import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv(); // Obtiene las variables de entorno del sistema
        System.out.println("varEnv = " + varEnv); // Imprime las variables de entorno del sistema
        // Imprimo las variables de entorno del sistema una por una
        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        } // Imprime las variables de entorno del sistema una por una
        // Imprimo una variable de entorno en particular
        System.out.println("varEnv.get(\"JAVA_HOME\") = " + varEnv.get("JAVA_HOME")); // Imprime una variable de entorno en particular

        // System es una clase abstracta que contiene propiedades del sistema y métodos para manipularlas
        // No se puede instanciar, pero se puede acceder a sus métodos y propiedades estáticas
        // Podemos por ejemplo definir nuevos errores en el sistema
        try {
            System.err.println("Lanzando una excepción"); // Imprime un mensaje de error
            throw new RuntimeException("Excepción lanzada"); // Lanza una excepción
        } catch (RuntimeException e) {
            System.err.println("Ocurrió un error: " + e.getMessage()); // Imprime un mensaje de error
            e.printStackTrace(); // Imprime el stack trace del error
            // Despues del error podemos terminar el programa o reinvocar el metodo main
            // System.exit(1); // Termina el programa con un código de error 1
            // main(args); // Reinvoca el metodo main
        } // Podemos por ejemplo definir nuevos errores en el sistema

        // Recolección de basura: System.gc() es un método de la clase System que invoca al recolector de basura
        // La función del recolector de basura es liberar la memoria de los objetos que ya no se utilizan
        System.gc(); // Invoca al recolector de basura
    }
}
