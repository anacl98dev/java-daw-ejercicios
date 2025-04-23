package arrays;

//Ejercicio02 OPTIMIZADO

import java.util.Arrays;

public class HistogramaFrecuenciasAleatorias1 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int[] frecuencias = new int[11]; // Array para frecuencias (0 a 10)

        // Generar números aleatorios y calcular frecuencias
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            frecuencias[numeros[i]]++; // Incrementar frecuencia
        }

        // Imprimir números generados
        System.out.println("Números generados: " + Arrays.toString(numeros));

        // Generar histograma
        System.out.println("\nHistograma:");
        for (int valor = 0; valor <= 10; valor++) {
            System.out.print(valor + ": " + "*".repeat(frecuencias[valor]) + " (" + frecuencias[valor] + ")");
            System.out.println();
        }
    }
}