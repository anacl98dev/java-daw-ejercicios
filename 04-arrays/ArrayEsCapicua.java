package arrays;

/*
 * Hacer un programa que pida un numero
 * por teclado y después diga si el numero
 * introducido es capicúa o no. (Mejora con String)
 */

public class ArrayEsCapicua {

    public static void main(String[] args) {
        int[] numeros = {3, 2, 1, 1, 2, 3};
        int descendente = numeros.length - 1;
        boolean esCapicua = true;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " " + descendente);
            if (numeros[i] != numeros[descendente]) {
                esCapicua = false;
                System.out.println("He entrado al bucle");
            }
            descendente--;
        }
        if (esCapicua) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
