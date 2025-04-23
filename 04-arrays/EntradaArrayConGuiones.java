package arrays;

//Ejercicio con Arrays unidimensionales-Conjunto de variables

import java.util.Scanner;

/*
 * Rellenar un vector de 10 posiciones
 * con valores introducidos por teclado.
 * Deberá de mostrar los mensajes:
 * Introduce el número 1º, Introduce el número 2º...
 * e introduce el último número.
 * Posteriormente los mostrará todos por pantalla
 * en una misma línea separados por guiones.
 */
public class EntradaArrayConGuiones {

    public static void main(String[] args) {
        // Scanner para la entrada de datos por teclado
        Scanner teclado = new Scanner(System.in);

        // Declaración de un array unidimensional llamado "numeros"
        // Se reserva espacio en memoria para 10 posiciones de tipo double
        double[] numeros = new double[10]; // Vector de 10 posiciones

        /*
         * Bucle for: se usa para recorrer el array y rellenarlo con valores.
         * - El índice "pos" controla en qué posición del array estamos.
         * - El bucle se ejecuta desde "pos = 0" hasta "pos < numeros.length" (10 veces).
         */
        for (int pos = 0; pos < numeros.length; pos++) {
            // Condicional para el último número (última posición del array)
            if (pos == numeros.length - 1) {
                System.out.println("Introduce el último número: ");
            } else {
                // Mensaje para los demás números
                System.out.println("Introduce el número " + (pos + 1) + "º:");
            }
            // Se almacena el valor introducido en la posición correspondiente del array
            numeros[pos] = teclado.nextDouble();
        }

        /*
         * Mostrar los números almacenados en el array
         * El bucle recorre el array y muestra cada valor en una misma línea
         * Los valores se separan por un guion (" - ")
         * Se evita imprimir el guion después del último número
         */
        System.out.println("Números introducidos: ");
        for (int pos = 0; pos < numeros.length; pos++) {
            // Imprime el valor del array en la posición actual
            System.out.print(numeros[pos]);
            // Si no es el último número, añadir un guion (" - ") después
            if (pos < numeros.length - 1) {
                System.out.print(" - ");
            }
        }

        // Imprime un salto de línea al final para formatear la salida
        System.out.println();
    }
}
