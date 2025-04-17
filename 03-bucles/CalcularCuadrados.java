package bucles;

import java.util.Scanner;

/*
 * Calcular y escribir los cuadrados
 * de una serie de números hasta que
 * se introduzca el 0 desde teclado
 */

public class CalcularCuadrados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Introduzca un número: ");
        double numero = teclado.nextDouble();

        //Algoritmo
        while (numero != 0) {
            double cuadrado = Math.pow(numero, 2);

            //Salida de datos
            System.out.println("El cuadrado es: " + cuadrado);
            System.out.println("Introduce un número");
            numero = teclado.nextDouble();
        }//Rompe número == 0
    }
}
