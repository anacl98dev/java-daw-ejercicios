package condicionales;

import java.util.Scanner;

/*Pedir al usuario dos números
y mostrar por consola cuál es
el mayor o si son iguales*/

public class MayorOMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Introduce los dos números: ");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();

        //Algoritmo
        String salida;
        if (num1 > num2) {
            salida = num1 + " es mayor que " + num2;
        } else if (num2 > num1) {
            salida = num2 + " es mayor que " + num1;
        } else {
            salida = "Los números son iguales";
        }
        //Salida de datos
        System.out.println(salida);
    }
}
