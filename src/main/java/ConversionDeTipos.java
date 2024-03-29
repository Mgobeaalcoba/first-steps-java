public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        // Conversión usando clase envolvente Integer
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // Conversión de String a double
        String numeroStr2 = "3.1416";
        double numeroDouble = Double.parseDouble(numeroStr2);
        System.out.println("numeroDouble = " + numeroDouble);
        String realStr = "3.1416e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        // Conversion de String a boolean
        String boolStr = "true";
        boolean bool = Boolean.parseBoolean(boolStr);
        System.out.println("bool = " + bool);

        // Conversion de primitivo a String
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        String otroNumeroStr2 = String.valueOf(otroNumeroInt + 100);
        System.out.println("otroNumeroStr2 = " + otroNumeroStr2);
        double otroNumeroDouble = 1.23456e2;
        String otroNumeroStr3 = Double.toString(otroNumeroDouble);
        System.out.println("otroNumeroStr3 = " + otroNumeroStr3);
        String otroNumeroStr4 = String.valueOf(otroNumeroDouble);
        System.out.println("otroNumeroStr4 = " + otroNumeroStr4);

        // Conversion de primitivo a primitive wrapper
        int i = 33000;
        short s = (short) i; // cast forzado a short más allá de que puede haber pérdida de información
        System.out.println("s = " + s); // -32536
        System.out.println("i = " + i); // 33000
    }
}
