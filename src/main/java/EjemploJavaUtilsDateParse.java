import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilsDateParse {
    public static void main(String[] args) {
        // Convertir un String a un objeto Date
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una fecha con formato yyyy-MM-dd:");
        String fecha = scanner.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); // El formato del string debe coincidir con el formato del SimpleDateFormat

        try {
            Date fechaDate = df.parse(fecha);
            System.out.println("fechaDate = " + fechaDate);

            Date fechaDate2 = new Date();

            if (fechaDate.after(fechaDate2)) { // after() y before() son metodos de la clase Date que permiten comparar fechas y devuelven un booleano
                System.out.println("fechaDate es después de fechaDate2");
            } else if (fechaDate.before(fechaDate2)) {
                System.out.println("fechaDate es antes de fechaDate2");
            } else { // equals() es un metodo de la clase Date que permite comparar fechas y devuelven un booleano
                System.out.println("fechaDate es igual a fechaDate2");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
