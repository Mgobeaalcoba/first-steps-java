import java.lang.reflect.Array;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Mariano";
        System.out.println("nombre.length() = " + nombre.length()); // 7
        System.out.println("nombre.isEmpty() = " + nombre.isEmpty()); // false
        System.out.println("nombre.isBlank() = " + nombre.isBlank()); // false
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // M en la posición 0
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1)); // o en la última posición
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // ariano
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3)); // ar
        System.out.println("nombre.substring(0, nombre.length() - 1) = " + nombre.substring(0, nombre.length() - 1)); // Marian
        System.out.println("nombre.indexOf('a') = " + nombre.indexOf('a')); // 1 porque la primera 'a' está en la posición 1
        System.out.println("nombre.lastIndexOf('a') = " + nombre.lastIndexOf('a')); // 5 porque la última 'a' está en la posición 5
        System.out.println("nombre.startsWith(\"Ma\") = " + nombre.startsWith("Ma")); // true porque empieza con "Ma"
        System.out.println("nombre.endsWith(\"no\") = " + nombre.endsWith("no")); // true porque termina con "no"
        System.out.println("nombre.contains(\"ria\") = " + nombre.contains("ria")); // true porque "ria" está en "Mariano"
        System.out.println("nombre.concat(\" Gobea\") = " + nombre.concat(" Gobea")); // Mariano Gobea
        System.out.println("nombre.replace('a', 'A') = " + nombre.replace('a', 'A')); // MAriAno
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // MARIANO
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // mariano
        String nombreApellido = " ".concat(nombre).concat(" Gobea "); // " Mariano Gobea "
        System.out.println("nombreApellido.trim() = " + nombreApellido.trim()); // Mariano Gobea sin espacios al principio ni al final
        String[] nombreApellidoArray = nombreApellido.trim().split(" ");
        System.out.println("nombreApellidoArray = " + nombreApellidoArray); // [Ljava.lang.String;@1b6d3586 (dirección de memoria)
        // Imprimo el contenido del arreglo
        for (int i = 0; i < nombreApellidoArray.length; i++) {
            System.out.println("nombreApellidoArray[" + i + "] = " + nombreApellidoArray[i]);
        } // Mariano, Gobea
        // Replace
        String mensaje = "Si trabajas mucho con tecnologías, eventualmente encontrarás un error.";
        String mensaje2 = mensaje.replace("tecnologías", "computadoras");
        System.out.println("mensaje = " + mensaje);
        System.out.println("mensaje2 = " + mensaje2);
        // Split
        String[] palabras = mensaje.split(" ");
        System.out.println("palabras.length = " + palabras.length); // 8
        System.out.println("palabras[0] = " + palabras[0]); // Si
        System.out.println("palabras[1] = " + palabras[1]); // trabajas
        System.out.println("palabras[2] = " + palabras[2]); // mucho
        System.out.println("palabras[3] = " + palabras[3]); // con
        System.out.println("palabras[4] = " + palabras[4]); // tecnologías,
        System.out.println("palabras[5] = " + palabras[5]); // eventualmente
        System.out.println("palabras[6] = " + palabras[6]); // encontrarás
        System.out.println("palabras[7] = " + palabras[7]); // un
        System.out.println("palabras[8] = " + palabras[8]); // error.
        // indexOf
        String mensaje3 = "Si trabajas mucho con tecnologías, eventualmente encontrarás un error.";
        int indice = mensaje3.indexOf("error");
        System.out.println("indice = " + indice); // 52
        // lastIndexOf
        int indice2 = mensaje3.lastIndexOf("tecnologías");
        System.out.println("indice2 = " + indice2); // 30
        // startsWith
        boolean resultado = mensaje3.startsWith("Si");
        System.out.println("resultado = " + resultado); // true
        // endsWith
        boolean resultado2 = mensaje3.endsWith("error.");
        System.out.println("resultado2 = " + resultado2); // true
        // contains
        boolean resultado3 = mensaje3.contains("tecnologías");
        System.out.println("resultado3 = " + resultado3); // true
        // equals
        String mensaje4 = "Hola";
        String mensaje5 = "Hola";
        System.out.println("mensaje4.equals(mensaje5) = " + mensaje4.equals(mensaje5)); // true
    }
}
