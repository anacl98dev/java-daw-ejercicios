package bucles;

import java.util.Scanner;

/*Crear un programa que juegue con el usuario a adivinar un número
El programa generará un número al azar del 1 al 10
El usuario introducirá números hasta adivinarlo
Al final del programa se mostrará el número de intentos que ha tenido
*/
//No se puede usar el FOR porque se desconoce cuántas veces va a ejecutarse el bucle

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        int numAleatorio = (int) (Math.ceil(Math.random() * 10));
        //System.out.println(numAleatorio); Lo eliminamos para que no se muestre el número correcto
        int numUsuario;
        int contador = 0;

        //Algoritmo
        do {
            System.out.println("Introduzca un numero del 1 al 10");
            numUsuario = teclado.nextInt();
            contador++;
            if (numAleatorio == numUsuario) {
                System.out.println("Lo has adivinado");
            } else {
                System.out.println("No, ese no es");
            }
        } while (numUsuario != numAleatorio);

        //Salida de datos
        System.out.println("Has empleado: " + contador + " intento(s)");
        System.out.println("Fin de programa");
    }
}
