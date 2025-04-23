package arrays;

/*
 * Hacer un programa que cree un array cuyo
 * tamaño se pedirá por teclado y cuyo
 * contenido serán números aleatorios entre
 * 1 y 300. Posteriormente se creara otro array
 * que guardara aquellos números del primer
 * array que acaben en un dígito que se indicara
 * por teclado (se debe controlar que se introduce
 * un numero correcto). Finalmente, mostrar por
 * pantalla los dos arrays. (Mejora con ArrayList)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FiltradoPorUltimoDigito {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el tamaño del vector");
        int tam = teclado.nextInt();
        int[] numerosAleatorios = new int[tam]; // El tamaño del Array no se modifica
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 301);
        }
        System.out.println("AV: " + Arrays.toString(numerosAleatorios));
        // Array dinamico (son listas)
        ArrayList<Integer> numerosDigito = new ArrayList();
        System.out.println("AL: " + numerosDigito);
        System.out.println("Dime el ultimo digito");
        int digito = teclado.nextInt();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] % 10 == digito) {
                numerosDigito.add(numerosAleatorios[i]);
                System.out.println("AL: " + numerosDigito);
            }
        }
        System.out.println("AL: " + numerosDigito);
    }
}
