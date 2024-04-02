public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j; // Declaración de variables e inicialización conjunta.
        System.out.println("suma = " + suma);

        // Si dividimos dos enteros, el resultado es un entero. Si queremos un resultado con decimales, debemos convertir al menos uno de los operandos a un tipo de dato que contenga decimales.
        double division = (double) i / j; // Convertimos i a double para que el resultado sea double.
        System.out.println("division = " + division);
        // También funciona si convertimos a float.
        float division2 = (float) i / j; // Convertimos i a float para que el resultado sea float.
        System.out.println("division2 = " + division2);

    }
}
