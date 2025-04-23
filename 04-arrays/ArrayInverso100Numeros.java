package arrays;

/*
 * Hacer un programa que rellene un array
 * con los 100 primeros números enteros y los
 * muestre en pantalla en orden inverso a como
 * se han introducido (orden inverso).
 */

import java.util.Arrays;

public class ArrayInverso100Numeros {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println(Arrays.toString(numeros));

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + "-");
        }
    }
}
