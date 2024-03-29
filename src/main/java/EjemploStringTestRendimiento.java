public class EjemploStringTestRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        // Concatenación con el método concat: más lento que el StringBuilder (88 ms)
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            c = c.concat(a).concat(b).concat("\n");
        };
        long fin = System.currentTimeMillis();
        System.out.println("Método concat: " + (fin - inicio) + " ms");

        // Concatenación con el operador +: más lento que concat y StringBuilder (115 ms)
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            c = c + a + b + "\n";
        };
        fin = System.currentTimeMillis();
        System.out.println("Operador +: " + (fin - inicio) + " ms");

        // Concatenación con StringBuilder: más rápido que concat y el operador + (4 ms)
        StringBuilder sb = new StringBuilder(c);
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(a).append(b).append("\n");
        };
        fin = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (fin - inicio) + " ms");
        String sbStr = sb.toString(); // Convertir el StringBuilder a String
        System.out.println("sb.toString() = " + sbStr); // Imprimir el resultado
    }
}
