public class OperadoresLogicos {
    public static void main(String[] args) {
        // Ejemplos de & y && y sus diferencias
        int i = 3;
        boolean b = false;
        b = i > 3 & i < 7; // b = false porque i > 3 es false
        System.out.println("b = " + b); // false
        b = i > 3 && i < 7; // b = false porque i > 3 es false
        System.out.println("b = " + b); // false
        // La diferencia entre & y && es que & evalúa ambos lados de la expresión y && solo evalúa el segundo si el primero es verdadero

        // Ejemplos de | y || y sus diferencias
        b = i > 3 | i < 7; // b = true porque i > 3 es false pero i < 7 es true
        System.out.println("b = " + b); // true
        b = i > 3 || i < 7; // b = true porque i > 3 es false pero i < 7 es true
        System.out.println("b = " + b); // true
        // La diferencia entre | y || es que | evalúa ambos lados de la expresión y || solo evalúa el segundo si el primero es falsoxs
    }
}
