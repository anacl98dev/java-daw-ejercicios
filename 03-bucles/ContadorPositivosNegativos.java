package bucles;

import java.util.Scanner;

//Escribe un programa que lea una lista de 10 números y determine cántos son positivos y negativos
//Cuántos hace referencia a cantidad, NO cuáles (se usa la variable CONTADOR)
//Uso del FOR

public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorPositivos = 0, contadorNegativos = 0;//contador++
        int numero;

        //for(Inicio; Comparación; Incremento)
        for (int veces = 1; veces <= 10; veces++) {
            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();
            if (numero < 0) {
                contadorNegativos++;
            } else if (numero > 0) {
                contadorPositivos++;
            }
        }//False (romper) veces > 10

        System.out.println("+: " + contadorPositivos++);
        System.out.println("-: " + contadorNegativos++);
    }
}
