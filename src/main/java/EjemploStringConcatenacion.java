public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java"; // String literal. Es un objeto de la clase String. No es un primitivo.
        String profesor = "Andrés Guzmán";
        String detalle = "El mejor curso de Java";
        String detalleCurso = curso + " con el profesor " + profesor + " " + detalle;
        System.out.println("detalleCurso = " + detalleCurso);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + numeroA + numeroB); // El resultado es "El mejor curso de Java105"
        System.out.println(detalle + (numeroA + numeroB)); // El resultado es "El mejor curso de Java15"
        System.out.println(numeroA + numeroB + detalle); // El resultado es "15El mejor curso de Java"

        String detalleCurso2 = curso.concat(profesor).concat(detalle); // Concatenación con el método concat
        System.out.println("detalleCurso2 = " + detalleCurso2); // El resultado es "Programación JavaAndrés GuzmánEl mejor curso de Java"
        // Los Strings son inmutables, por lo que no se modifica el valor de curso, profesor ni detalle. Retorna un nuevo objeto que debe ser asignado a una nueva variable.

        String detalleCurso3 = curso.concat(" con el profesor ").concat(profesor).concat(" ").concat(detalle); // Concatenación con el método concat
        System.out.println("detalleCurso3 = " + detalleCurso3); // El resultado es "Programación Java con el profesor Andrés Guzmán El mejor curso de Java"
    }
}
