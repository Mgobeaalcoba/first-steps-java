public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10; // Siempre se pasa por valor porque no es un objeto. Si otro metodo cambia el valor da lo mismo para el metodo que lo llamo.
        System.out.println("Valor de i = " + i); // 10
        test(i);
        System.out.println("Valor de i = " + i); // 10. No se modifica el valor de i porque se paso por valor.

        // Si paso un Integer por valor, no se modifica el valor del objeto. Dado que el objeto Integer es inmutable.
        Integer j = 10;
        System.out.println("Valor de j = " + j); // 10
        test(j);
        System.out.println("Valor de j = " + j); // 10. No se modifica el valor de j porque se paso por valor.
    }
    
    public static void test(int i) { // void no retorna nada. Siempre se pasa por valor porque no es un objeto. Si otro metodo cambia el valor da lo mismo para el metodo que lo llamo.
        System.out.println("i o j o k = " + i); // 10
        i = 33;
        System.out.println("i o j o k = " + i); // 33
    }
}
