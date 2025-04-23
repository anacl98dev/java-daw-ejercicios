package arrays;

/*
 * Hacer un programa que genere 100 números
 * aleatorios entre 0 y10 y genere un
 * histograma con las frecuencias de cada
 * numero. Para representar las barras del
 * histograma se utilizaran secuencias **.
 * Por ejemplo, la secuencia: 1, 1, 3, 4, 1, 3, 1, 2,.
 * generaría la siguiente s a l i d a :
 * 1: ****
 * 2: *
 * 3: **
 * 4: *
 */

import java.util.Arrays;

public class HistogramaFrecuenciasAleatorias {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(numeros));

        for (int valor = 0; valor <= 10; valor++) {
            int contador = 0;
            System.out.print(valor + ": ");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == valor) {
                    System.out.print("*");
                    contador++;
                }
            }
            System.out.print("(" + contador + ") ");
            System.out.println();
        }
    }
}
