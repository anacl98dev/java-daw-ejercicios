package bucles;

import java.util.Scanner;

/*Leer desde teclado una serie de números
Hasta que aparezca alguno menor que 1000*/
//Se usa DO WHILE

public class FinConNumeroMenorA1000 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        int numero;

        //Algoritmo
        do {
            System.out.println("Dime un número, con uno menor que 1000 sales");
            numero = teclado.nextInt();
            if (numero >= 1000) {
                System.out.println("Continúas en el bucle");
            }
        } while (numero >= 1000); //False/Ruptura: número <1000

        //Salida de datos
        System.out.println("Has salido del bucle");
        System.out.println("Fin del programa.");
    }
}