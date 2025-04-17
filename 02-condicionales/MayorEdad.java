package condicionales;

import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        String salida;

        //Algoritmo
        if (edad<0){
            salida = "Me estás vacilando";
        } else if (edad<18){
            salida = "No puedes pasar";
        } else{ //Lo contrario (≥18)
            salida = "Puedes pasar";
        }
        //Salida de datos
        System.out.println(salida);
    }

}
