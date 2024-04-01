public class ControlBucleWhile {
    public static void main(String[] args) {
        // Ejemplo de bucle while
        int contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        } // La condición se evalúa al principio
        // Ejemplo de bucle do while
        contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3); // La condición se evalúa al final

        // Ejemplo de resultado distinto entre do while y while
        contador = 3;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3); // La condición se evalúa al final // Se ejecuta al menos una vez
        contador = 3;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        } // La condición se evalúa al principio // No se ejecuta
    }
}
