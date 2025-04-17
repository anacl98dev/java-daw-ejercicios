package bucles;

import java.util.Scanner;

/*
 * Realiza un programa que nos diga
 * cuántos dígitos tiene un número
 * introducido por teclado
 */

//367--> 300 + 60 + 7 --> 3 * 100 + 6 * 10 + 7 * 1

public class ContadorDigitos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();

        //Algoritmo
        int cociente = numero / 10;
        int contador = 1;
        while (cociente != 0) {
            cociente = cociente / 10;
            contador++;
        }//Ruptura-False: Cociente exactamente igual a 0

        //Salida de datos
        System.out.println("Dígitos: " + contador);
        //System.out.println(Integer.MAX_VALUE); Para ver el máximo de números que tolera el integer
    }
}
