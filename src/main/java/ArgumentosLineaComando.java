public class ArgumentosLineaComando {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe ingresar argumentos en la línea de comandos");
            System.exit(-1); // Sale del programa arrojando una excepción
        }
        // Imprime los argumentos que se pasan por la línea de comandos
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento n°" + i + " = " + args[i]);
        }
        // Para compilar por terminal:  mgobea@AR000YWM26MXXVP  ~/Documents/Personal_Develop/Udemy_Courses/masterJava/primeraApp/src/main/java   main ?  javac ArgumentosLineaComando.java
        // Genera el archivo ArgumentosLineaComando.class dentro de la misma carpeta java
        // Para ejecutar por terminal:  mgobea@AR000YWM26MXXVP  ~/Documents/Personal_Develop/Udemy_Courses/masterJava/primeraApp/src/main/java   main ?  java ArgumentosLineaComando arg1 arg2 arg3 "arg4 compuesto"
    }
}
