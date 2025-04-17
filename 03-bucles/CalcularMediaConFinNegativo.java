package bucles;

import java.util.Scanner;

/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números
 * se introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 */

//No se puede usar el FOR, solo while o do while

public class CalcularMediaConFinNegativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0, acumulador = 0;
        double numero;

        do {
            System.out.println("Introduce un número para calcular la media, "
                    + "negativo para terminar");
            numero = teclado.nextInt();
            if (numero >= 0) {
                contador++;
                acumulador += numero;
            }
        } while (numero >= 0);//Ruputura-False: numero < 0 (lo contrario)
        double media = acumulador / contador;
        System.out.println("La media es: " + media);
    }
}
