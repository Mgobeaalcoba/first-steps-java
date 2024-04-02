public class OperadorInstanceOf {
    public static void main(String[] args) {

            String texto = "Creando un objeto de la clase String...";

            Integer num = 7;

            boolean b1 = texto instanceof String;
            System.out.println("texto es del tipo String: " + b1); // true

            boolean b2 = num instanceof Integer;
            System.out.println("num es del tipo Integer: " + b2); // true

            boolean b3 = num instanceof Number;
            System.out.println("num es del tipo Number: " + b3); // true

            boolean b4 = num instanceof Object;
            System.out.println("num es del tipo Object: " + b4); // true

            // 4 validaciones false
            /*
            boolean b5 = num instanceof String;
            System.out.println("num es del tipo String: " + b5); // false

            boolean b6 = texto instanceof Integer;
            System.out.println("texto es del tipo Integer: " + b6); // false

            boolean b7 = texto instanceof Number;
            System.out.println("texto es del tipo Number: " + b7); // false
            */
            boolean b8 = texto instanceof Object;
            System.out.println("texto es del tipo Object: " + b8); // true

    }
}
