public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1; // Se asigna la referencia del objeto num1 a num2

        System.out.println("num1 = " + num1); // 1000
        System.out.println("num2 = " + num2 ); // 1000

        System.out.println("¿num1 == num2? = " + (num1 == num2)); // true

        num2 = 1000; // Se crea un nuevo objeto Integer, por lo que num2 ya no apunta al mismo objeto que num1

        System.out.println("num1 = " + num1); // 1000
        System.out.println("num2 = " + num2 ); // 1000

        System.out.println("¿num1 == num2? = " + (num1 == num2)); // false // Se comparan las referencias de los objetos
        System.out.println("¿num1.equals(num2)? = " + num1.equals(num2)); // true // Se comparan los valores de los objetos
        // Otra forma es comparar los primitivos de cada objeto
        System.out.println("¿num1.intValue() == num2.intValue()? = " + (num1.intValue() == num2.intValue())); // true

        // Hasta el número 127, los objetos Integer son iguales si se comparan con == o equals debido a que se almacenan en un caché

        // Unboxing de un objeto Integer a un primitivo int
        num1 = 1000;
        num2 = 2000;
        boolean condicion = num1 > num2; // Unboxing de num1 y num2 a primitivos int
        System.out.println("condicion = " + condicion); // false
        condicion = num1 < num2; // Unboxing de num1 y num2 a primitivos int
        System.out.println("condicion = " + condicion); // true
        num1 = 500;
        num2 = 500;
        condicion = num1 >= num2; // Unboxing de num1 y num2 a primitivos int
        System.out.println("condicion = " + condicion); // true
    }
}
