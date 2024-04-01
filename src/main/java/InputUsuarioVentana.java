public class InputUsuarioVentana {
    public static void main(String[] args) {
        // Ejemplo de entrada de datos por ventana emergente
        String numeroStr = javax.swing.JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
        // La conversión puede lanzar una excepción en tiempo de ejecución
        try {
            int numeroDecimalInput = Integer.parseInt(numeroStr);
            // Imprimir el número ingresado por consola
            System.out.println("El numero ingresado es: = " + numeroDecimalInput);
            // Imprimir el número ingresado por ventana emergente
            javax.swing.JOptionPane.showMessageDialog(null, "El número ingresado es: " + numeroDecimalInput);
        } catch (NumberFormatException e) {
            System.out.println("El valor ingresado no es un número entero.");
            javax.swing.JOptionPane.showMessageDialog(null, "El valor ingresado no es un número entero.");
            main(args); // Llamada recursiva a main si falla la conversión
            System.exit(0);
        }
    }
}
