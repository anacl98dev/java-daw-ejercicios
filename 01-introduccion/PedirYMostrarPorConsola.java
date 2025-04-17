package introduccion;

import java.util.Scanner;
//Pedir al usuario un numero y mostrarlo por consola
public class PedirYMostrarPorConsola {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Ingrese el primer numero: ");
        int numero = teclado.nextInt();

        //Algoritmo: No hay (solo entrada y salda de datos)

        //Salida de datos
        System.out.println("El numero es: " +numero);




    }
}
