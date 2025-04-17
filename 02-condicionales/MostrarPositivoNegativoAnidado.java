package condicionales;

import java.util.Scanner;

//(Ejercicio01 anidado)
//Pedir al usuario un número
// Que el programa muestre si es negativo, 0 o positivo

public class MostrarPositivoNegativoAnidado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Introduce un número");
        double num = teclado.nextDouble();

        //Algoritmo
        String salida = " ";
        if (num < 0) {
            salida = "El número " + num + " es un número negativo";
        } else if (num == 0) {
            salida = "El número es 0";
        } else {
            salida = "El número " + num + " es positivo";
        }

        //Salida de datos
        System.out.println(salida);
    }
}