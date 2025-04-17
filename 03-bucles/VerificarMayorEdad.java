package bucles;

import java.util.Scanner;

//Pedir la edad a todos los usuarios y decir si pueden o no pasar hasta que tengan 18 o más
//En el momento en que reciba el número 0 se finaliza el programa
//Se utiliza el DO WHILE en este caso

public class VerificarMayorEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Entrada de datos
        //En este caso la entrada (el DO) pasa dentro del bucle
        int edad;

        //Algoritmo
        do { // Patrón de las instrucciones
            System.out.println("Dame tu carnet para verificar la edad");
            edad = teclado.nextInt();
            if (edad == 0) {
                System.out.println("El portero cierra y se va a casa.");
            } else if (edad < 18) {
                System.out.println("No puedes pasar");
            } else { // >= 18
                System.out.println("Puedes pasar");
            }
        } while (edad != 0); // False/ruptura --> edad = 0 (Se pone lo contrario a la ruptura)
        //Salida de datos
        System.out.println("Fin del programa.");
    }
}
