package bucles;

import java.util.Scanner;

//Leer valores por teclado y que te diga si es igual, menor o mayor que 25.
//La marca fin de lectura será 12345678
//En este caso se hace solo con while, diferenciando entre fuera y dentro del bucle

public class SalidaClaveSecreta2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.println("FUERA - Introduce un numero: ");
        numero = teclado.nextInt();

        while (numero != 12345678) {
            if (numero > 25) {
                System.out.println("El numero es mayor que 25");//Salida de datos
            } else if (numero == 25) {
                System.out.println("El numero es 25");//Salida de datos
            } else {
                System.out.println("El numero es menor que 25");//Salida de datos
            }
            System.out.println("DENTRO - Introduce un numero: ");
            numero = teclado.nextInt();
        }

        System.out.println("Fin de la entrada de datos.");
    }
}
