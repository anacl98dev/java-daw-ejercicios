package condicionales;

import java.util.Scanner;

//Ejercicio04 mejorado)
/*Pedir una nota de un alumno
y decir si es:
-insuficiente
-suficiente
-notable
-sobresaliente*/

public class CalificacionesEscolares1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Introduzca la nota");
        double nota = teclado.nextDouble();

        //Algoritmo
        String salida;
        if (nota < 0 || nota > 10) {
            salida = "Nota no válida";
        } else if (nota < 5) {
            salida = "Insuficiente";
        } else if (nota < 7) {
            salida = "Suficiente";
        } else if (nota < 9) {
            salida = "Notable";
        } else {
            salida = "Sobresaliente";
        }

        //Salida de datos
        System.out.println(salida);

    }
}
