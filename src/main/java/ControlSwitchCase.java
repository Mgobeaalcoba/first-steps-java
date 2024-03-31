public class ControlSwitchCase {
    public static void main(String[] args) {
        // Ejemplo de uso de Switch
        int dia = 3;
        String nombreDia = "";

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3: // Si dia es 3
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "";
        };
        System.out.println("nombreDia = " + nombreDia); // Miércoles

    }
}
