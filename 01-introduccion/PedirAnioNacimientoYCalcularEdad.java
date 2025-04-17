package introduccion;

import java.util.Scanner;
//Pedir al usuario su año de nacimiento
//el año actual y calcular la edad
public class PedirAnioNacimientoYCalcularEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Dime tu año de nacimiento");
        int nacimiento = teclado.nextInt();
        System.out.println("¿En qué año estamos?");
        int actual = teclado.nextInt();

        //Algoritmo
        int calculo = actual - nacimiento;

        //Salida de datos
        System.out.println("Tienes " +calculo+" años");



    }
}
