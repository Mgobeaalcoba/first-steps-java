public class SistemasNumericos {
    public static void main(String[] args) {
        // Números decimales
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        // convertimos a binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        // convertimos a octal
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        // convertimos a hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        // Numeros binarios
        int numeroBinario = 0b111110100;
        // Si imprimo un número binario, Java lo imprime como decimal
        System.out.println("numeroBinario = " + numeroBinario);
        // Imprimo el binario como binario
        System.out.println("numeroBinario = " + Integer.toBinaryString(numeroBinario));
        // Convertimos el binario a decimal
        System.out.println("numero binario " + Integer.toBinaryString(numeroBinario) + " convertido a decimal = " + numeroBinario);
        // Convertimos el binario a octal
        System.out.println("numero binario " + Integer.toBinaryString(numeroBinario) + " convertido a octal = " + Integer.toOctalString(numeroBinario));
        // Convertimos el binario a hexadecimal
        System.out.println("numero binario " + Integer.toBinaryString(numeroBinario) + " convertido a hexadecimal = " + Integer.toHexString(numeroBinario));

        // Números octales
        int numeroOctal = 0_764;
        System.out.println("numeroOctal = " + numeroOctal);
        // Convertimos el octal a decimal
        System.out.println("numero octal " + Integer.toOctalString(numeroOctal) + " convertido a decimal = " + numeroOctal);
        // Convertimos el octal a binario
        System.out.println("numero octal " + Integer.toOctalString(numeroOctal) + " convertido a binario = " + Integer.toBinaryString(numeroOctal));
        // Convertimos el octal a hexadecimal
        System.out.println("numero octal " + Integer.toOctalString(numeroOctal) + " convertido a hexadecimal = " + Integer.toHexString(numeroOctal));

        // Números hexadecimales
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        // Convertimos el hexadecimal a decimal
        System.out.println("numero hexadecimal " + Integer.toHexString(numeroHex) + " convertido a decimal = " + numeroHex);
        // Convertimos el hexadecimal a binario
        System.out.println("numero hexadecimal " + Integer.toHexString(numeroHex) + " convertido a binario = " + Integer.toBinaryString(numeroHex));
        // Convertimos el hexadecimal a octal
        System.out.println("numero hexadecimal " + Integer.toHexString(numeroHex) + " convertido a octal = " + Integer.toOctalString(numeroHex));
    }
}
