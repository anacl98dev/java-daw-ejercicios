package condicionales;

/*Pedir un número entero
Decir si es par o impar
(Es par cuando es divisible entre 2, es decir, que su resto es 0)
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos:
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        // Algoritmo:
        String salida = "";
        if (num % 2 == 0) {
            salida = "Número par";
        } else {
            salida = "Número impar";
        }

        // Salida de datos:
        System.out.println(salida);
    }
}
