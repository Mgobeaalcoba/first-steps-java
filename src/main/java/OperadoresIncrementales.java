public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Preincremento (el operador ++ antes de la variable)
        int i = 1;
        int j = ++i; // i se incrementa en uno y luego se asigna a j
        System.out.println("i = " + i); // 2
        System.out.println("j = " + j); // 2

        // Postincremento (el operador ++ después de la variable)
        i = 1;
        j = i++; // j se asigna con el valor de i y luego i se incrementa en uno
        System.out.println("i = " + i); // 2
        System.out.println("j = " + j); // 1
    }
}
