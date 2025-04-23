package arrays;

//Ejercicio03 OPTIMIZADO

import java.util.Scanner;

public class ArrayEsCapicua1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String numero = sc.nextLine();

        boolean esCapicua = true;
        int longitud = numero.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (numero.charAt(i) != numero.charAt(longitud - 1 - i)) {
                esCapicua = false;
                break;
            }
        }

        if (esCapicua) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }

        sc.close();
    }
}