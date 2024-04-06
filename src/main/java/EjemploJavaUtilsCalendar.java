import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilsCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(); // Es una clase abstracta, no se puede instanciar con new. Solo se puede obtener una instancia con el método estático getInstance()
        System.out.println("calendario = " + calendario); // calendario = java.util.GregorianCalendar[time=1617262920734,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/Argentina/Buenos_Aires",offset=-10800000,dstSavings=0,useDaylight=false,transitions=52,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=31,DAY_OF_YEAR=90,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=35,SECOND=20,MILLISECOND=734,ZONE_OFFSET=-10800000,DST_OFFSET=0]

        // Obtenemos el valor de un campo específico del calendario
        calendario.set(
                2020,
                0,
                1,
                1,
                0,
                0); // Año, mes, día, hora, minuto, segundo. Los meses empiezan en 0, por lo que enero es 0

        Date fecha = calendario.getTime(); // Convertimos un objeto de tipo Calendar a Date
        System.out.println("fecha = " + fecha); // fecha = Wed Jan 01 00:00:00 ART 2020

        // Customizamos el formato de la fecha
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy 'Hora:' hh:mm:ss:SSS a z"); // yyyy-MM-dd es otra opción. hh:mm:ss a es para el formato de 12 horas y HH:mm:ss es para el formato de 24 horas
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 01 enero, 2020 Hora: 00:00:00 ART

        // Sumamos 5 días a la fecha
        calendario.add(Calendar.DAY_OF_YEAR, 5);
        fecha = calendario.getTime();
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 06 enero, 2020 Hora: 00:00:00 ART

        // Restamos 2 meses a la fecha
        calendario.add(Calendar.MONTH, -2);
        fecha = calendario.getTime();
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 06 noviembre, 2019 Hora: 00:00:00 ART

        // Seteo de una nueva fecha usando las constantes de Calendar
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, 11);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR_OF_DAY, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM); // PM es la tarde
        calendario.set(Calendar.MINUTE, 59);
        calendario.set(Calendar.SECOND, 59);
        calendario.set(Calendar.MILLISECOND, 999);
        Date fecha2 = calendario.getTime();
        String fechaStr2 = df.format(fecha2);
        System.out.println("fechaStr = " + fechaStr2); // fechaStr = 25 diciembre, 2023 Hora: 23:59:59 ART

        // Calculo la diferencia entre la fecha2 y la fecha
        long diferencia = fecha2.getTime() - fecha.getTime();
        System.out.println("diferencia = " + diferencia); // diferencia = 946944599999
        // Formateo la diferencia en días
        long dias = diferencia / (1000 * 60 * 60 * 24);
        System.out.println("dias = " + dias); // dias = 10957
        // Formateo la diferencia en meses
        long meses = dias / 30;
        System.out.println("meses = " + meses); // meses = 365
        // Calculo la diferencia en horas
        long horas = diferencia / (1000 * 60 * 60);
        System.out.println("horas = " + horas); // horas = 26206
    }
}
