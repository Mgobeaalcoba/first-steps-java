public class EjemploArreglos {
    public static void main(String[] args) {
        // Ejemplos de arreglos de referencia y primitivos
        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Karla";
        nombres[2] = "Carlos";

        Persona personas[] = new Persona[2];
        personas[0] = new Persona();
        personas[1] = new Persona();
        personas[0].cambiarNombre("Juan");
        personas[1].cambiarNombre("Karla");

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Recorrer arreglos 1° forma
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombres[" + i + "] = " + nombres[i]);
        }
        // Recorrer arreglos 2° forma
        for (Persona persona : personas) {
            System.out.println("persona = " + persona.getNombre());
        }
        // Recorrar numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
