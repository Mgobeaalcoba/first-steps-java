public class EtiquetasEnBucles {
    public static void main(String[] args) {
        // Ejemplo de etiquetas en bucles
        bucle1:
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            bucle2:
            for (int j = 0; j < 3; j++) {
                System.out.println("j = " + j);
                if (i == 1) {
                    break bucle1; // Sale del bucle1 y no se ejecuta más el bucle2 ni el bucle1. Sin etiqueta solo saldría del bucle2
                }
            }
        }
        // Ejemplo de etiquetas en bucles while
        int contador = 0;
        bucle1:
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
            bucle2:
            while (contador < 3) {
                System.out.println("contador = " + contador);
                contador++;
                if (contador == 2) {
                    break bucle1; // Sale del bucle1 y no se ejecuta más el bucle2 ni el bucle1. Sin etiqueta solo saldría del bucle2
                }
            }
        }
        // Ejemplo de etiquetas en bucles con continue
        bucle1:
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            bucle2:
            for (int j = 0; j < 3; j++) {
                System.out.println("j = " + j);
                if (j == 1) {
                    continue bucle1; // Continua con la siguiente iteración del bucle1. Sin etiqueta solo continuaría con la siguiente iteración del bucle2
                }
            }
        }
    }
}
