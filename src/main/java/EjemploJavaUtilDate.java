import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date(); // Es un datetime actual en realidad
        System.out.println("fecha = " + fecha); // fecha = Mon Apr 01 12:22:20 ART 2024

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy 'Hora:' HH:mm:ss z"); // yyyy-MM-dd es otra opción
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 01 abril, 2024 Hora: 12:27:03 ART

        // Contabilizamos la cantidad de milisegundos transcurridos durante un ciclo for:
        long tiempoInicial = System.currentTimeMillis();
        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Valor de j = " + j);
        long tiempoTotal = tiempoFinal - tiempoInicial;
        System.out.println("tiempo total: " + tiempoTotal + " milisegundos");

        // Hacemos lo mismo con el metodo getTime() de la clase Date:
        Date fecha2 = new Date();
        long tiempoInicial2 = fecha2.getTime();
        long k = 0;
        for (int i = 0; i < 10000000; i++) {
            k += i;
        }
        Date fecha3 = new Date();
        long tiempoFinal2 = fecha3.getTime();
        System.out.println("Valor de k = " + k);
        long tiempoTotal2 = tiempoFinal2 - tiempoInicial2;
        System.out.println("tiempo total 2: " + tiempoTotal2 + " milisegundos");
    }
}
