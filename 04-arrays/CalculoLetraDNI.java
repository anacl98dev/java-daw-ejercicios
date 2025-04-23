package arrays;

import java.util.Scanner;

/*
 * Cálculo del dígito de control del DNI
 * Mediante un array de tipo string de una dimensión
 * Para ello se divide el número del DNI entre 23
 * y el resto se sustituye por la letra correspondiente
 */

public class CalculoLetraDNI {

    public static void main(String[] args) {
        // Scanner para leer la entrada del usuario desde la consola
        Scanner teclado = new Scanner(System.in);

        // Array que almacena las letras del DNI correspondientes a los restos (0-22)
        String[] letraDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
                "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        // Imprime el tamaño del vector (23 letras en total)
        System.out.println("Tamaño del vector: " + letraDni.length);

        // Solicita al usuario que introduzca su número de DNI
        System.out.println("Introduce tu DNI");

        // Solicita al usuario que introduzca su número de DNI
        int dni = teclado.nextInt();

        // Solicita al usuario que introduzca su número de DNI
        int posLetra = dni % 23;

        // Solicita al usuario que introduzca su número de DNI
        System.out.println(dni + "-" + letraDni[posLetra]);
    }
}
