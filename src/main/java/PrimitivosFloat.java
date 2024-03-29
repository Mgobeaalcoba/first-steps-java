public class PrimitivosFloat {
    public static void main(String[] args) {
        // Primitivos flotantes
        // Si asigno un entero se imprimirá como float
        float numeroFloat = 10;
        // entre 1.4E-45 a 3.4028235E38
        float flotanteFloat = 3.4028235E38F;
        // entre 4.9E-324 a 1.7976931348623157E308
        double flotanteDouble = 1.7976931348623157E308;
        // numeros exponenciales
        float numeroExponencial = 3.1e3f; // 3100.0
        // numeros exponenciales negativos
        float numeroExponencialNegativo = 3.1e-3f; // 0.0031
        // Double declarado con D
        double numeroDouble = 3.1e3D; // 3100.0
        // Valores por defecto
        float numeroFloatDefault = 0.0f; // El valor por default solo aplica a variables de instancia
        int numeroInt = 0; // El valor por default solo aplica a variables de instancia
        System.out.println("numeroFloatDefault = " + numeroFloatDefault);
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numeroExponencialNegativo = " + numeroExponencialNegativo);
        System.out.println("numeroExponencial = " + numeroExponencial);
        System.out.println("flotanteFloat = " + flotanteFloat);
        System.out.println("El tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("El tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("El valor mínimo de un float es " + Float.MIN_VALUE);
        System.out.println("El valor máximo de un float es " + Float.MAX_VALUE);
        System.out.println("flotanteDouble = " + flotanteDouble);
        System.out.println("El tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("El tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("El valor mínimo de un double es " + Double.MIN_VALUE);
        System.out.println("El valor máximo de un double es " + Double.MAX_VALUE);
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("El tipo var corresponde en byte a " + Float.BYTES);
        System.out.println("El tipo var corresponde en bits a " + Float.SIZE);
        System.out.println("El valor mínimo de un float es " + Float.MIN_VALUE);
        System.out.println("El valor máximo de un float es " + Float.MAX_VALUE);
    }
}
