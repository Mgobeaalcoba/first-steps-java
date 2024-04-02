import java.util.Random;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int numero = 9;
        double raiz = Math.sqrt(numero); // En este caso voy a calcular la raiz cuadrada de un número
        System.out.println("raiz = " + raiz); // Resultado = 3.0
        double base = 5;
        double exponente = 3;
        double resultado = Math.pow(base, exponente); // En este caso voy a calcular la potencia de un número
        System.out.println("resultado = " + resultado); // Resultado = 125.0
        double numeroAleatorio = Math.random(); // En este caso voy a generar un número aleatorio entre 0 y 1
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        int numeroAleatorioEntero = (int) (numeroAleatorio * 100); // En este caso voy a generar un número aleatorio entre 0 y 100. Para ello multiplico el número aleatorio por 100 y lo casteo a entero
        System.out.println("numeroAleatorioEntero = " + numeroAleatorioEntero);

        // Otros metodos de la clase Math:
        // Math.abs() devuelve el valor absoluto de un número
        // Math.ceil() devuelve el entero más pequeño mayor o igual que un número
        // Math.floor() devuelve el entero más grande menor o igual que un número
        // Math.rint() devuelve el número más cercano al entero más cercano
        // Math.round() devuelve el entero más cercano
        // Math.max() devuelve el número más grande de dos números
        // Math.min() devuelve el número más pequeño de dos números
        // Math.sin() devuelve el seno de un número
        // Math.cos() devuelve el coseno de un número
        // Math.tan() devuelve la tangente de un número
        // Math.asin() devuelve el arco seno de un número
        // Math.acos() devuelve el arco coseno de un número
        // Math.atan() devuelve el arco tangente de un número
        // Math.toDegrees() convierte un ángulo de radianes a grados
        // Math.toRadians() convierte un ángulo de grados a radianes
        // Math.PI es una constante que representa el número pi
        // Math.E es una constante que representa el número e
        // Math.exp() devuelve e elevado a la potencia de un número. Exponencial de euler
        // Math.log() devuelve el logaritmo natural de un número

        // Ejemplo de uso de los metodos de arriba
        double numero1 = -5.85;
        double numero2 = 5.85;
        System.out.println("Math.abs(numero1) = " + Math.abs(numero1)); // Resultado = 5.85
        System.out.println("Math.ceil(numero1) = " + Math.ceil(numero1)); // Resultado = -5.0
        System.out.println("Math.floor(numero1) = " + Math.floor(numero1)); // Resultado = -6.0
        System.out.println("Math.rint(numero1) = " + Math.rint(numero1)); // Resultado = -6.0
        System.out.println("Math.round(numero1) = " + Math.round(numero1)); // Resultado = -6
        System.out.println("Math.max(numero1, numero2) = " + Math.max(numero1, numero2)); // Resultado = 5.85
        System.out.println("Math.min(numero1, numero2) = " + Math.min(numero1, numero2)); // Resultado = -5.85
        System.out.println("Math.sin(Math.toRadians(90)) = " + Math.sin(Math.toRadians(90))); // Resultado = 1.0. Convierte de grados a radianes
        System.out.println("Math.cos(Math.toRadians(0)) = " + Math.cos(Math.toRadians(0))); // Resultado = 1.0
        System.out.println("Math.tan(Math.toRadians(45)) = " + Math.tan(Math.toRadians(45))); // Resultado = 1.0
        System.out.println("Math.asin(1) = " + Math.asin(1)); // Resultado = 1.5707963267948966
        System.out.println("Math.acos(1) = " + Math.acos(1)); // Resultado = 0.0
        System.out.println("Math.atan(1) = " + Math.atan(1)); // Resultado = 0.7853981633974483
        System.out.println("Math.toDegrees(Math.PI) = " + Math.toDegrees(Math.PI)); // Resultado = 180.0. Convierte de radianes a grados
        System.out.println("Math.toRadians(180) = " + Math.toRadians(180)); // Resultado = 3.141592653589793
        System.out.println("Math.PI = " + Math.PI); // Resultado = 3.141592653589793
        System.out.println("Math.E = " + Math.E); // Resultado = 2.718281828459045
        System.out.println("Math.exp(1) = " + Math.exp(1)); // Resultado = 2.718281828459045
        System.out.println("Math.log(2.718281828459045) = " + Math.log(2.718281828459045)); // Resultado = 1.0

        // Usar random para seleccionar un color de un array
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "violeta", "turquesa", "marron", "naranja", "rosa"};
        int indice = (int) (Math.random() * colores.length); // Genero un número aleatorio entre 0 y la longitud del array
        System.out.println("colores[indice] = " + colores[indice]); // Muestro el color que se ha seleccionado aleatoriamente

        // Random de Java Util. Ejemplo de uso
        Random random = new Random();
        // Random entero
        int numeroAleatorioRandom = random.nextInt(100); // Genero un número aleatorio entre 0 y 100
        System.out.println("numeroAleatorioRandom = " + numeroAleatorioRandom);
        // Random double
        double numeroAleatorioRandomDouble = random.nextDouble(); // Genero un número aleatorio entre 0 y 1
        System.out.println("numeroAleatorioRandomDouble = " + numeroAleatorioRandomDouble);
        // Random boolean
        boolean booleanAleatorio = random.nextBoolean(); // Genero un boolean aleatorio
        System.out.println("booleanAleatorio = " + booleanAleatorio);
        // Random con rango
        int rango = 50;
        int numeroAleatorioRango = random.nextInt(rango) + 50; // Genero un número aleatorio entre 50 y 100
        System.out.println("numeroAleatorioRango = " + numeroAleatorioRango);
        // Random con semilla
        Random randomSemilla = new Random(1234); // Creo un objeto Random con una semilla
        int numeroAleatorioSemilla = randomSemilla.nextInt(100); // Genero un número aleatorio entre 0 y 100
        System.out.println("numeroAleatorioSemilla = " + numeroAleatorioSemilla); // Siempre va a generar el mismo número aleatorio
        // Seleccion de colores con Random de Java Util
        int indiceRandom = random.nextInt(colores.length); // Genero un número aleatorio entre 0 y la longitud del array
        System.out.println("colores[indiceRandom] = " + colores[indiceRandom]); // Muestro el color que se ha seleccionado aleatoriamente

    }
}
