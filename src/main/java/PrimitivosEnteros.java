public class PrimitivosEnteros {
    public static void main(String[] args) {
        // Primitivos enteros
        // entre -128 a 127
        byte enteroByte = 127;
        // entre -32768 a 32767
        short enteroShort = 32767;
        // entre -2147483648 a 2147483647
        int enteroInt = 2147483647;
        // entre -9223372036854775808 a 9223372036854775807
        long enteroLong = 9223372036854775807L;
        // var con un numero será un int hasta que nos pasemos de 2.147.483.647 que es el valor máximo de un int
        var numero = 10;

        // Primitivos booleanos
        boolean cc = true;
        System.out.println("cc = " + cc);
        System.out.println("enteroByte = " + enteroByte);
        System.out.println("El tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("El tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("El valor mínimo de un byte es " + Byte.MIN_VALUE);
        System.out.println("El valor máximo de un byte es " + Byte.MAX_VALUE);
        System.out.println("enteroShort = " + enteroShort);
        System.out.println("El tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("El tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("El valor mínimo de un short es " + Short.MIN_VALUE);
        System.out.println("El valor máximo de un short es " + Short.MAX_VALUE);
        System.out.println("enteroInt = " + enteroInt);
        System.out.println("El tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("El tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("El valor mínimo de un int es " + Integer.MIN_VALUE);
        System.out.println("El valor máximo de un int es " + Integer.MAX_VALUE);
        System.out.println("enteroLong = " + enteroLong);
        System.out.println("El tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("El tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("El valor mínimo de un long es " + Long.MIN_VALUE);
        System.out.println("El valor máximo de un long es " + Long.MAX_VALUE);
        System.out.println("numero = " + numero);
        System.out.println("El tipo var corresponde en byte a " + Integer.BYTES);
        System.out.println("El tipo var corresponde en bits a " + Integer.SIZE);
        System.out.println("El valor mínimo de un int es " + Integer.MIN_VALUE);
        System.out.println("El valor máximo de un int es " + Integer.MAX_VALUE);

    }
}
