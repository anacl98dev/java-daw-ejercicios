package arrays;

//Ejercicio01 OPTIMIZADO

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAleatorioConsultaPosicion1 {

    public static void main(String[] args) {
        // Crear un array de 10 números aleatorios entre 1 y 100
        int[] vectorNumeros = new int[10];
        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = (int) (Math.random() * 100) + 1;
        }

        // Mostrar el array generado
        System.out.println("Array generado: " + Arrays.toString(vectorNumeros));

        // Leer la posición deseada desde el teclado
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce la posición (1-10): ");
            int pos = teclado.nextInt();

            // Validar la posición ingresada
            if (pos < 1 || pos > 10) {
                System.out.println("Error: La posición debe estar entre 1 y 10.");
            } else {
                System.out.println("El contenido en la posición " + pos + " es: " + vectorNumeros[pos - 1]);
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Por favor, introduce un número entero.");
        }
    }
}