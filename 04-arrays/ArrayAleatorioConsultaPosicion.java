package arrays;

/*
 * Hacer un programa que cree un array de 10 posiciones
 * de números aleatorios entre 1 y 100. Posteriormente
 * se pedirá por teclado una posición y se mostrara en
 * pantalla qué valor tiene esa posición.
 * Math.random () → Devuelve un numero entre 0.0 y 1.0
 * (int) (Math.random ()*7) → Devuelve un numero entre O y 6
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAleatorioConsultaPosicion {

    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];
        System.out.println(Arrays.toString(vectorNumeros));
        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(vectorNumeros));
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la posicion: ");
        int pos = teclado.nextInt();
        System.out.println("El contenido es: " + vectorNumeros[pos - 1]);
    }
}
