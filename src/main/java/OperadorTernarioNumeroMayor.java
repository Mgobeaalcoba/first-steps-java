public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        // Ejemplo de operador ternario
        int a = 10;
        int b = 20;
        int c = 30;
        int mayor = (a > b) ? a : b;
        mayor = (mayor > c) ? mayor : c;
        System.out.println("mayor = " + mayor); // 30
    }
}
