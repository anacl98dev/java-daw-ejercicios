package bucles;

import java.util.Scanner;

/* Ejercicio de números primos
Los números primos son aquellos
divisibles entre sí mismos y
entre 1 siendo el resto 0 */

//Es decir, si hay más de 2 resultados = 0, no es primo
//!=2 NO ES PRIMO

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Dime un numero: ");
        int numero = teclado.nextInt();

        //Algoritmo
        // numero = 6 -> 6 5 4 3 2 1
        // Cuenta numeros en orden decreciente
        int contadorDivisibles = 0;
        for (int numIntermedio = numero; numIntermedio >= 1; numIntermedio--) {
            if (numero % numIntermedio == 0) { //Es divisible
                contadorDivisibles++;
            }
        }
        if (contadorDivisibles <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }//rompe -- false -- numeroIntermedio <1 (lo contrario a esto)

        //Salida de datos integrada en el algpritmo
    }
}
