public class MetodosString {
    public static void main(String[] args) {
        // Métodos de la clase String
        String nombre = "Juan";
        System.out.println("nombre.length() = " + nombre.length()); // 4 caracteres
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // JUAN
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // juan
        System.out.println("nombre.equals(\"Juan\") = " + nombre.equals("Juan")); // true
        System.out.println("nombre.equals(\"juan\") = " + nombre.equals("juan")); // false
        System.out.println("nombre.equalsIgnoreCase(\"juan\") = " + nombre.equalsIgnoreCase("juan")); // true
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); // -4 porque J - A = -4 en ASCII (J = 74, A = 65)
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // J en la posición 0 (la primera)
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); // u en la posición 1
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1)); // n en la última posición
        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // uan
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3)); // ua
        System.out.println("nombre.substring(0, nombre.length() - 1) = " + nombre.substring(0, nombre.length() - 1)); // Jua
        // char[] toCharArray()
        char[] arreglo = nombre.toCharArray(); // [J, u, a, n]
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        } // J, u, a, n
        // indexOf(String str)
        System.out.println("nombre.indexOf('a') = " + nombre.indexOf('a')); // 2 porque la primera 'a' está en la posición 2
        // lastIndexOf(String str)
        System.out.println("nombre.lastIndexOf('a') = " + nombre.lastIndexOf('a')); // 2 porque la última 'a' está en la posición 2
        // startsWith(String str)
        System.out.println("nombre.startsWith(\"Ju\") = " + nombre.startsWith("Ju")); // true porque empieza con "Ju"
        // endsWith(String str)
        System.out.println("nombre.endsWith(\"an\") = " + nombre.endsWith("an")); // true porque termina con "an"
        // contains(String str)
        System.out.println("nombre.contains(\"ua\") = " + nombre.contains("ua")); // true porque "ua" está en "Juan"
        // isEmpty()
        System.out.println("nombre.isEmpty() = " + nombre.isEmpty()); // false porque no está vacío
        // concat(String str)
        String nombre2 = "Juan";
        System.out.println("nombre.concat(nombre2) = " + nombre.concat(nombre2)); // JuanJuan
        // replace(char oldChar, char newChar)
        System.out.println("nombre.replace('a', 'A') = " + nombre.replace('a', 'A')); // JuAn
        // split(String regex)
        String[] arreglo2 = nombre.split("a"); // [J, un]
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("arreglo2[" + i + "] = " + arreglo2[i]);
        } // J, un
        // trim()
        String nombre3 = "  Juan  ";
        System.out.println("nombre3.trim() = " + nombre3.trim()); // Juan
    }
}
