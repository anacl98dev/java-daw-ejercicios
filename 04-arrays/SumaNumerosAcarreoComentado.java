package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumaNumerosAcarreoComentado {

    public static void main(String[] args) {
        // Arrays que representan los números gigantes, almacenados por dígitos
        int[] numero1 = {1, 9, 2, 4, 5, 7, 3, 2, 4}; // Número 1: 192457324
        int[] numero2 = {9, 5, 1, 5, 1, 9, 1, 3, 2}; // Número 2: 951519132

        // Lista para almacenar el resultado final de la suma
        ArrayList<Integer> resultado = new ArrayList<>();

        // Variable para manejar el acarreo durante la suma
        // El acarreo ocurre cuando la suma de dos dígitos (más el acarreo previo) es mayor o igual a 10.
        // Por ejemplo, al sumar 9 + 5 = 14, el dígito "4" se guarda como resultado y el "1" se lleva
        // al siguiente dígito como acarreo.
        int acarreo = 0;

        // Recorremos los arrays desde el último dígito hacia el primero (de derecha a izquierda)
        // para simular la forma en que sumamos números en papel.
        for (int i = numero1.length - 1; i >= 0; i--) {
            // Sumar los dígitos correspondientes de numero1 y numero2, junto con el acarreo
            int suma = numero1[i] + numero2[i] + acarreo;

            // Obtener el dígito de las unidades del resultado y agregarlo al inicio de la lista
            // Si la suma es, por ejemplo, 14, aquí guardamos 4 (las unidades) en el resultado.
            resultado.add(0, suma % 10);

            // Calcular el nuevo acarreo (si la suma es 10 o mayor, hay acarreo)
            // Si la suma es 14, aquí el acarreo será 1 (el dígito de las decenas).
            acarreo = suma / 10; // Esto será 0 si la suma es menor que 10
        }

        // Si después de procesar todos los dígitos queda un acarreo (por ejemplo, al sumar 999 + 1),
        // lo agregamos al inicio del resultado.
        if (acarreo == 1) {
            resultado.add(0, 1); // El resultado final en este caso sería 1000.
        }

        // Imprimir los arrays originales y el resultado de la suma
        System.out.println("Numero 1: " + Arrays.toString(numero1)); // Imprime el array número 1
        System.out.println("Numero 2: " + Arrays.toString(numero2)); // Imprime el array número 2
        System.out.println("_________________________________________");
        System.out.println("Resultado: " + resultado);              // Imprime la lista con el resultado final
    }
}