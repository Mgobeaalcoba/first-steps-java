import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        // Supongamos que tenemos un sistema de login
        String[] usuarios = {"Mariano", "Pedro", "Juan", "Maria", "Luis", "Ana"};
        String[] passwords = {"123", "456", "789", "abc", "def", "ghi"};
        String[] roles = {"admin", "editor", "reader", "admin", "editor", "reader"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el usuario: ");
        String usarioInput = scanner.nextLine();
        System.out.println("Proporciona el password: ");
        String passwordInput = scanner.nextLine();
        boolean sesionOtorgada = false;
        String rol = "";

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usarioInput) && passwords[i].equals(passwordInput)) {
                sesionOtorgada = true;
                System.out.println("Rol: " + roles[i]);
                rol = roles[i];
                break;
            } else {
                sesionOtorgada = false;
            }
        }

        System.out.println("sesionOtorgada = " + sesionOtorgada); // true

        if (sesionOtorgada) {
            System.out.println("Bienvenido " + usarioInput);
        } else {
            System.out.println("Usuario o password incorrectos");
        }

        // Supongamos que queremos verificar si el usuario es admin o editor

        boolean esAdmin = sesionOtorgada && rol.equals("admin");
        System.out.println("esAdmin = " + esAdmin); // true
    }
}
