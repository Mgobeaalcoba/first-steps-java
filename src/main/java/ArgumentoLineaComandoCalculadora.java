public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Debe ingresar 3 argumentos: operación, a y b");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        System.out.println("resultado = " + operation(operacion, a, b));
    }

    private static double operation(String operacion, int a, int b) {
        double resultado = 0;
        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if (b == 0) {
                    System.out.println("No se puede dividir por cero");
                    System.exit(1);
                } else {
                    resultado = (double) a / b;
                }
                break;
            default:
                System.out.println("Operación no reconocida");
                System.exit(-1);
        }
        return resultado;
    }
}
