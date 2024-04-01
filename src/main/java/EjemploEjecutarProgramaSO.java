public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime(); // Obtiene el objeto Runtime que permite interactuar con el sistema operativo
        Process proceso; // Declara una variable de tipo Process

        try {
            // Abro Spotify desde mi macbook
            proceso = rt.exec("open -a Spotify"); // Ejecuta el comando open -a Spotify en la terminal
            // Espera a que el proceso termine
            proceso.waitFor();
        } catch (Exception e) {
            System.err.println("Error al ejecutar el programa: " + e.getMessage());
        }
    }
}
