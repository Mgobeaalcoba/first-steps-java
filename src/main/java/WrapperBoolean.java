public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;
        boolean primBoolean = num1 > num2; // Booleano primitivo
        Boolean objBoolean = Boolean.valueOf(primBoolean); // Objeto Boolean
        Boolean objBoolean2 = false; // Autoboxing
        System.out.println("primBoolean = " + primBoolean); // false
        System.out.println("objBoolean = " + objBoolean); // false
        System.out.println("objBoolean2 = " + objBoolean2); // false
        System.out.println("Comparamos 2 objetos Boolean");
        System.out.println(objBoolean == objBoolean2); // true // Compara las referencias de los objetos Boolean. No se comporta igual que los Integer.
    }
}
