package bucles;

import java.util.Scanner;

//Leer valores por teclado y que te diga si es igual, menor o mayor que 25.
//La marca fin de lectura será 12345678
//En este caso se hace con do while, recomendado cuando se interactua con un usuario

public class SalidaClaveSecreta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        do {//al añadir el do while el algoritmo empieza aquí y se repite
            //Entrada de datos

            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();

            //Algoritmo
            if (numero == 12345678) {//Si no se añade esto, se finaliza el programa pero aparece que es mayor que 25
                System.out.println("Fin de programa");
            } else if (numero > 25) {
                System.out.println("El numero es mayor que 25");//Salida de datos
            } else if (numero == 25) {
                System.out.println("El numero es 25");//Salida de datos
            } else {
                System.out.println("El numero es menor que 25");//Salida de datos
            }

            //Se consigue con el contrario de lo establecido como ruptura; false=numero==12345678
        } while (numero != 12345678);//Es necesario añadir una condicion para romper el bucle (fin de programa)
    }
}
