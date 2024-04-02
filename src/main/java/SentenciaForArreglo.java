public class SentenciaForArreglo {
    public static void main(String[] args) {
        // Ejemplo de bucle for con arreglos
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombre = " + nombres[i]);
        } // La condición se evalúa al principio y se sabe cuántas veces se va a ejecutar

        // Ejemplo de bucle for ignorando algunos casos del arreglo
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals("Maria")) {
                continue;
            }
            System.out.println("nombre = " + nombres[i]);
        } // La condición se evalúa al principio y se sabe cuántas veces se va a ejecutar

        // Ejemplo de bucle for que se interrumpe al encontrar un caso en el arreglo
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals("Maria")) {
                break;
            }
            System.out.println("nombre = " + nombres[i]);
        } // La condición se evalúa al principio y se sabe cuántas veces se va a ejecutar
    }
}
