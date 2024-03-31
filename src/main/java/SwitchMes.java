public class SwitchMes {
    public static void main(String[] args) {
        int mes = 2;
        String diasMes = "";

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = "Tiene 31 días";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = "Tiene 30 días";
                break;
            case 2:
                diasMes = "Tiene 28 o 29 días";
                break;
            default:
                diasMes = "Mes no válido";
        }

        System.out.println("diasMes = " + diasMes); // Tiene 28 o 29 días
    }
}
