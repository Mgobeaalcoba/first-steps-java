public class Caracteres {
    public static void main(String[] args) {
        char caracter = 'a'; // 16 bits
        char caracterUnicode = '\u0021'; // ! en unicode. El char se declara siempre con comillas simples
        System.out.println("caracter = " + caracter);
        System.out.println("caracterUnicode = " + caracterUnicode);
        // Formas de escribir el @
        char caracterArroba = 64;
        char caracterArrobaSimbolo = '@';
        char caracterArrobaUnicode = '\u0040';
        System.out.println("caracterArroba = " + caracterArroba);
        System.out.println("caracterArrobaSimbolo = " + caracterArrobaSimbolo);
        System.out.println("caracterArrobaUnicode = " + caracterArrobaUnicode);
        // Comparación de caracteres
        System.out.println("caracterArroba == caracterArrobaSimbolo = " + (caracterArroba == caracterArrobaSimbolo));
        System.out.println("caracterArroba == caracterArrobaUnicode = " + (caracterArroba == caracterArrobaUnicode));
        System.out.println("caracterArrobaSimbolo == caracterArrobaUnicode = " + (caracterArrobaSimbolo == caracterArrobaUnicode));

        // Caracteres especiales
        char espacio = ' ';
        char espacioUnicode = '\u0020';
        System.out.println("espacio = " + espacio);
        System.out.println("espacioUnicode = " + espacioUnicode);
        System.out.println("espacio == espacioUnicode = " + (espacio == espacioUnicode));
        // Caracteres especiales
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("Hola" + retroceso + " Mundo");
        System.out.println("Hola" + tabulador + "Mundo");
        System.out.println("Hola" + nuevaLinea + "Mundo");
        System.out.println("Hola" + retornoCarro + "Mundo");
    }
}
