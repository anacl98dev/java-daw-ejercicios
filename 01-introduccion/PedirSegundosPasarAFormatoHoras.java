package introduccion;

import java.util.Scanner;

//Pedir al usuario unos segundos
//Mostrarlo en formato horas, minutos y segundos
public class PedirSegundosPasarAFormatoHoras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Introduce los segundos: ");
        int entrada = teclado.nextInt();

        //Algoritmo
        if (entrada < 0) {
            System.out.println("Introduce un numero positivo.");
        } else {
            int h, m, s;
            s = entrada % 60;
            m = (entrada / 60) % 60;
            h = entrada / 3600;


            //Salida de datos
            System.out.println(h + " : " + m + " : " + s);
        }


    }
}
