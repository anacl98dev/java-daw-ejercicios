package introduccion;

import java.util.Scanner;
//Pedir al usuario la edad
//Mostrar la edad que tendrá el próximo año
public class PedirYMostrarEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Dime tu edad: ");
        int edad = teclado.nextInt();

        //Algoritmo
        edad = edad + 1;

        //Salida de datos
        System.out.println("El año que viene tendrás: "+edad+" años");




    }
}
