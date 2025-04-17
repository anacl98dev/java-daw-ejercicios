package bucles;

import java.util.Scanner;

//Ejercicio Fibonacci (con 13 números)
//1 1 2 3 5 8 13 21...
//numero = último + penúltimo

public class Fibonacci {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Inicializamos las variables
        int fibonacci = 1; // Número actual de la serie
        int penultimo = 1; // Penúltimo número de la serie
        int ultimo = 1; // Último número de la serie
        // Bucle que genera los primeros 13 números de Fibonacci
        for (int serieNumeros = 1; serieNumeros <= 13; serieNumeros++) {
            System.out.print(fibonacci + " "); // Imprime el número actual de la serie
            // Calcula el siguiente número de Fibonacci
            fibonacci = ultimo + penultimo;
            // Actualiza los valores para la siguiente iteración
            penultimo = ultimo;
            ultimo = fibonacci;
        }
    }
}
