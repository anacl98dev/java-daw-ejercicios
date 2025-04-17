package bucles;

import java.util.Scanner;

//Muestra la tabla de multiplicar de un número introducido por teclado
//Se utiliza el FOR

public class MostrarTablaMultiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Introduce el número de la tabla a multiplicar");
        int numero = teclado.nextInt();

        //Algoritmo
        //for (Declarar e iniciar una variable; condicion de true; incremento/decremento)
        for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
            int operacion = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + operacion);
        }//Rompe-False cuando multiplicador >10

        //Salida de datos
        System.out.println("Fin del programa");
    }
}
