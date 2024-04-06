import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento en el formato yyyy-MM-dd: ");
        String fechaNacimiento = scanner.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date fechaNac = df.parse(fechaNacimiento);
            System.out.println("fechaNac = " + fechaNac);
            long nacTimeMiliseconds = fechaNac.getTime();
            Date fechaActual =  new Date();
            long tiempoActualMiliseconds = fechaActual.getTime();
            long diferencia = tiempoActualMiliseconds - nacTimeMiliseconds;
            long anios = diferencia / 1000 / 60 / 60 / 24 / 365;
            System.out.println("años = " + anios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
