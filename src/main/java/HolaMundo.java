public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java!"; // Instanciación de un objeto de tipo String que no necesita new
        System.out.println(saludar.toUpperCase()); // Tiene métodos porque es un objeto

        int numero = 10; // variable primitiva de tipo entero
        Integer numero2 = 10; // variable de referencia de tipo Integer
        boolean verificacion = numero2.equals(numero); // Tiene métodos porque es un objeto
        System.out.println(verificacion);

        boolean valor = true;
        int numero3 = 15;
        if(valor) {
            System.out.println("El valor es verdadero");
            numero3 = 20;
        } else {
            System.out.println("El valor es falso");
            numero3 = 25;
        }
        System.out.println("El valor de numero3 es: " + numero3); // 20

        // Desde Java 10 constamos con variables de tipado estático pero implicito.
        var numero4 = 10;
        System.out.println(numero4);
        // numero4 = "Diez"; // Error de compilación

        // Primitivos enteros
        // entre -128 a 127
        byte enteroByte = 127;
        // entre -32768 a 32767
        short enteroShort = 32767;
        // entre -2147483648 a 2147483647
        int enteroInt = 2147483647;
        // entre -9223372036854775808 a 9223372036854775807
        long enteroLong = 9223372036854775807L;

        // Primitivos booleanos
        boolean a = true;


        // Primitivos char
        //char a = 'a';
        //char b = '\u0061'; // 'a' en unicode
        //char c = '\n'; // salto de línea
        //char d = '\t'; // tabulación
        //char e = '\r'; // retorno de carro
        //char f = '\''; // comilla simple
        //char g = '\"'; // comilla doble
        //char h = '\\'; // barra invertida
        //char i = '\u0041'; // 'A' en unicode

        // Primitivos flotantes
        // entre 1.4E-45 a 3.4028235E38
        float flotanteFloat = 3.4028235E38F;
        // entre 4.9E-324 a 1.7976931348623157E308
        double flotanteDouble = 1.7976931348623157E308;


    }
}
