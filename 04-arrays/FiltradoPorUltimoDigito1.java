package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FiltradoPorUltimoDigito1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar el tamaño del array
        System.out.println("Dime el tamaño del vector:");
        int tam = teclado.nextInt();

        // Validar que el tamaño sea positivo
        while (tam <= 0) {
            System.out.println("El tamaño debe ser mayor a 0. Inténtalo de nuevo:");
            tam = teclado.nextInt();
        }

        // Crear el array con números aleatorios entre 1 y 300
        int[] numerosAleatorios = new int[tam];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 300) + 1;
        }

        // Mostrar el primer array
        System.out.println("Primer array (AV): " + Arrays.toString(numerosAleatorios));

        // Crear el ArrayList para almacenar los números filtrados
        ArrayList<Integer> numerosDigito = new ArrayList<>();

        // Solicitar el último dígito con validación
        int digito;
        do {
            System.out.println("Introduce un dígito entre 0 y 9:");
            digito = teclado.nextInt();
        } while (digito < 0 || digito > 9);

        // Filtrar los números cuyo último dígito coincide con el introducido
        for (int numero : numerosAleatorios) {
            if (numero % 10 == digito) {
                numerosDigito.add(numero);
            }
        }

        // Mostrar ambos arrays claramente
        System.out.println("\n--- Resultados Finales ---");
        System.out.println("Primer array (numerosAleatorios): " + Arrays.toString(numerosAleatorios));
        System.out.println("Segundo array (filtrado, números con último dígito " + digito + "): " + numerosDigito);
    }
}