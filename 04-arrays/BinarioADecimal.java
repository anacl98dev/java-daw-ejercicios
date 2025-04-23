package arrays;

/*
* Programa que realice una conversión de números
* binarios a decimales, para ello se introducirá
* el número binario es un array en el que cada
* posición es el valor 0 o 1. El tamaño del binario
* es 8.
*/

import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número binario:");
        String numeroString = teclado.next();

        int[] binario = new int[8];
        for (int i = 0; i < numeroString.length(); i++) {
            binario[i] = Integer.parseInt(String.valueOf(numeroString.charAt(i)));
        }

        System.out.println("");
        int acumulador = 0;
        int exponente = 0;

        for (int i = binario.length - 1; i >= 0; i--) {
            // Calcula el valor del bit multiplicado por su potencia de 2
            int oper = binario[i] * (int) Math.pow(2, exponente);
            acumulador += oper; // Suma al acumulador
            System.out.print(oper + " "); // Imprime el resultado de cada operación
            exponente++; // Incrementa el exponente
        }

        System.out.println("");
        System.out.println(acumulador); // Imprime el resultado final en decimal
    }
}