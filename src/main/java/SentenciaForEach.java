public class SentenciaForEach {
    public static void main(String[] args) {
        String[] nombres = {"Andrés", "Pepe", "María", "Paco"};
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        } // La condición se evalúa al principio y se sabe cuántas veces se va a ejecutar

    }
}
