public class WrapperInteger {
    public static void main(String[] args) {
        // Clases envolventes de tipos primitivos
        // int - Integer
        // long - Long
        // float - Float
        // double - Double
        // boolean - Boolean
        // byte - Byte
        // char - Character
        // short - Short
        // Las clases envolventes permiten trabajar con tipos primitivos como si fueran objetos
        // Autoboxing: Conversión de un tipo primitivo a su correspondiente clase envolvente
        // Unboxing: Conversión de una clase envolvente a su correspondiente tipo primitivo
        Integer entero = Integer.valueOf(10); // Boxing
        Integer entero2 = 10; // Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero2 = " + entero2);
        System.out.println("entero double = " + entero.doubleValue()); // Unboxing (Método de la clase Integer) Impresión: 10.0
        System.out.println("entero byte = " + entero.byteValue()); // Unboxing (Método de la clase Number) Impresión: 10
        System.out.println("entero short = " + entero.shortValue()); // Unboxing (Método de la clase Number) Impresión: 10
        System.out.println("entero long = " + entero.longValue()); // Unboxing (Método de la clase Number) Impresión: 10
        System.out.println("entero float = " + entero.floatValue()); // Unboxing (Método de la clase Number) Impresión: 10.0
        System.out.println("entero binario = " + Integer.toBinaryString(entero)); // Método estático de la clase Integer Impresión: 1010
        System.out.println("entero hexadecimal = " + Integer.toHexString(entero)); // Método estático de la clase Integer Impresión: a
        System.out.println("entero octal = " + Integer.toOctalString(entero)); // Método estático de la clase Integer Impresión: 12
        System.out.println("Valor mínimo de un entero: " + Integer.MIN_VALUE); // Valor mínimo de un entero Impresión: -2147483648
        System.out.println("Valor máximo de un entero: " + Integer.MAX_VALUE);  // Valor máximo de un entero Impresión: 2147483647
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor); // 67000
        // Integer valor = Integer.valueOf("67000"); // NumberFormatException
        // int valor = Integer.parseInt("67000"); // NumberFormatException
        int valorPrimitivo = Integer.parseInt("67000");
        int valorPrimitivo2 = entero; // Unboxing
        int valorPrimitivo3 = entero.intValue(); // Unboxing
        System.out.println("valorPrimitivo = " + valorPrimitivo); // 67000
        String valorBinario = "1010";
        System.out.println("valor binario = " + Integer.parseInt(valorBinario, 2)); // 10
        String valorOctal = "10";
        System.out.println("valor octal = " + Integer.parseInt(valorOctal, 8)); // 8
        String valorHex = "A";
        System.out.println("valor hexadecimal = " + Integer.parseInt(valorHex, 16)); // 10
        // Integer valor = Integer.valueOf("A"); // NumberFormatException
        // int valor = Integer.parseInt("A"); // NumberFormatException
        // int valor = Integer.parseInt("A", 16); // NumberFormatException
        // int valor = Integer.parseInt("A", 10); // NumberFormatException
    }
}
