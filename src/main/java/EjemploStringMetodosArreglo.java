public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; // Atributo del arreglo
        for (int i = 0; i < largo; i ++) {
            System.out.println("arreglo["+i+"]: " + arreglo[i]);
        }
        int largoStr = trabalenguas.length(); // Método de la clase String
        boolean isEquals = largo == largoStr; // Método de la clase String
        System.out.println("isEquals = " + isEquals);

        // Si quiero escribir el contenido de mi array en la misma línea
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]); // uso print en lugar de println. print no agrega un salto de línea
        }

        // Split divide un string en un arreglo de strings
        String[] arreglo2 = trabalenguas.split("a");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("arreglo2[" + i + "] = " + arreglo2[i]);
        } // tr, b, lengu, s

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); // Necesito escapar el punto o [.] es lo mismo
        int l = archivoArr.length;
        System.out.println("archivoArr[" + (l - 1) + "] = " + archivoArr[l - 1]); // pdf
        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println("archivoArr[" + i + "] = " + archivoArr[i]);
        } // alguna, imagen, pdf
    }
}
