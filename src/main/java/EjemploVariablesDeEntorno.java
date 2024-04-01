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
    }
}
