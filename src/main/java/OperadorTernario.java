public class OperadorTernario {
    public static void main(String[] args) {

        // Ejemplo de operador ternario
        int a = 10;
        int valorMaximo = (a > 0) ? a : 0;
        System.out.println("valorMaximo = " + valorMaximo); // 10

        // Ejemplo de operador ternario
        boolean par = (a % 2 == 0) ? true : false;
        System.out.println("par = " + par); // true

        // Ejemplo de operador ternario
        boolean impar = (a % 2 != 0) ? true : false;
        System.out.println("impar = " + impar); // false
    }
}
