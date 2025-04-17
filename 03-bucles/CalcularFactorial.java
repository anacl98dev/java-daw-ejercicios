package bucles;

import java.util.Scanner;

/* Escribe un programa que calcule el factorial de un número entero leído por teclado.
Ejemplo: Por favor, introduzca un número entero:
4! = 4*3*2*1 = 1*2*3*4 = ACUMULADOR
6! = 720 */

public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número y calculamos el factorial: ");
        int num = teclado.nextInt();
        int acumuladorFactorial = 1;
        for (int numeroIntermedio = 1; numeroIntermedio <= num; numeroIntermedio++) {
            acumuladorFactorial *= numeroIntermedio; //Forma acotada de = acumuladorFactorial * numeroIntermedio
        }//Romper - False -> numeroIntermedio > 4
        System.out.println(acumuladorFactorial);
    }
}
