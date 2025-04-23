package arrays;

/*
Suma de números gigantes enteros.
Se quiere realizar una suma de dos números gigantes enteros. Para ello se plantea que
los números se almacenen por posiciones en un array y se pueda realizar la operación de
la suma.

Ejemplo:
Número 1: [1, 5, 7, 4]
Número 2: [3, 2, 6, 8]
Resultado: [4, 8, 4, 2]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class SumaNumerosGigantes {

    public static void main(String[] args) {
        int[] numero1 = {1, 9, 2, 4, 5, 7, 3, 2, 4};
        int[] numero2 = {9, 5, 1, 5, 1, 9, 1, 3, 2};
        ArrayList<Integer> resultado = new ArrayList<>();
        System.out.println(resultado);
        int acarreo = 0;

        for (int i = numero1.length - 1; i >= 0; i--) {
            int suma = numero1[i] + numero2[i] + acarreo;
            if (suma >= 10) {
                // resultado[i] = suma-10;
                resultado.add(0, suma - 10);
                acarreo = 1;
            } else {
                // resultado[i] = suma;
                resultado.add(0, suma);
                acarreo = 0;
            }
            System.out.println(resultado);
            //System.out.println(numero1[i]+ "+" +numero2[i]+ "=" +resultado[i] );
        }
        if (acarreo == 1) {
            resultado.add(0, 1);
        }
        System.out.println(Arrays.toString(numero1));
        System.out.println(Arrays.toString(numero2));
        System.out.println("______________________________");
        System.out.println(resultado);
    }
}
