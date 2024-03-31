public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java"; // String literal. Es un objeto de la clase String. No es un primitivo.
        String profesor = "Andrés Guzmán";

        curso.concat(profesor); // No modifica el valor de curso
        System.out.println("curso = " + curso); // El resultado es "Programación Java"

        curso = curso.concat(profesor); // Asigna el nuevo valor de curso
        System.out.println("curso = " + curso); // El resultado es "Programación JavaAndrés Guzmán"

        String transformado = curso.transform(c -> { // Función lambda que recibe un String y retorna un String
            return c.concat(" con ").concat(profesor); // Concatenación con el método concat
        }); // No modifica el valor de curso
        System.out.println("curso = " + curso); // El resultado es "Programación JavaAndrés Guzmán"
        System.out.println("transformado = " + transformado); // El resultado es "Programación JavaAndrés Guzmán con Andrés Guzmán"

        // Replace
        String nuevoCurso = curso.replace("Java", "Python"); // Reemplaza Java por Python
        System.out.println("nuevoCurso = " + nuevoCurso); // El resultado es "Programación PythonAndrés Guzmán". No modifica el valor de curso
        System.out.println("curso = " + curso); // El resultado es "Programación JavaAndrés Guzmán". No modifica el valor de curso
    }
}
