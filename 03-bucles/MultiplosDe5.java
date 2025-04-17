package bucles;

import java.util.Scanner;

//Muestra los números múltiplos de 5 del 0 al 100

public class MultiplosDe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //0-5-10-15...-100
        int acumulador = 0; //0
        while (acumulador <= 100) {
            if (acumulador == 100) {
                System.out.println(acumulador);
            } else {
                System.out.print(acumulador + "-");
            }
            acumulador += 5;
        }//Ruptura-False: acumulador > 100
    }
}
