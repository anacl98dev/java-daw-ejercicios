package arrays;

/*
 * ============================
 * VECTORES (ARRAYS UNIDIMENSIONALES)
 * ============================
 *
 * 1. Definición:
 *    Un vector (o array unidimensional) es una estructura de datos que permite
 *    almacenar varios valores del mismo tipo en una sola variable.
 *
 * 2. Características:
 *    - Los datos almacenados deben ser homogéneos (del mismo tipo).
 *    - Se accede a cada valor utilizando un índice numérico.
 *    - La primera posición del vector siempre tiene el índice 0.
 *    - Los elementos se almacenan en posiciones contiguas de memoria.
 *
 * 3. Declaración de un vector:
 *    - Sintaxis general:
 *          tipo[] nombreVector = new tipo[tamaño];
 *    - Ejemplo:
 *          int[] edades = new int[5]; // Vector que almacena 5 valores enteros.
 *
 * 4. Asignación de valores:
 *    - Se asignan valores mediante el índice:
 *          edades[0] = 19;
 *          edades[1] = 23;
 *          edades[2] = 26;
 *          edades[3] = 56;
 *          edades[4] = 59;
 *
 * 5. Acceder a los valores:
 *    - Para acceder a un elemento, se utiliza el índice correspondiente:
 *          System.out.println(edades[0]); // Muestra el valor en la posición 0.
 *
 * 6. Recorrer un vector con un bucle:
 *    - Es común utilizar bucles como 'for' para acceder a todos los elementos:
 *          for (int i = 0; i < edades.length; i++) {
 *              System.out.println("Posición " + i + ": " + edades[i]);
 *          }
 *
 * 7. Ejemplo de ejecución:
 *    Si el vector tiene los valores [19, 23, 26, 56, 59], la salida será:
 *          Posición 0: 19
 *          Posición 1: 23
 *          Posición 2: 26
 *          Posición 3: 56
 *          Posición 4: 59
 *
 * 8. Ventajas de usar vectores:
 *    - Permiten manejar grandes cantidades de datos sin declarar múltiples variables.
 *    - Facilitan la manipulación de datos mediante bucles y métodos.
 *    - Son eficientes en términos de acceso a memoria.
 */

// Guardar los valores de la edad de cada miembro de la familia

public class IntroBasicaVectores {

    public static void main(String[] args) {
        //Vector estático nativo de Java: declaramos un array de tamaño 5
        int[] edades = new int[5];

        // Mostrar contenido inicial del vector (valores por defecto: 0)
        System.out.print("Valores iniciales del vector: ");
        System.out.println(edades[0] + " " + edades[1] + " " + edades[2] + " " + edades[3] + " " + edades[4]);
        // Asignar valores al vector
        edades[0] = 19;
        edades[1] = 23;
        edades[2] = 26;
        edades[3] = 56;
        edades[4] = 59;

        // Mostrar valores del vector
        for (int i = 0; i < 5; i++) { // o i<edades.length
            System.out.println(edades[i] + " ");
            //
        }
    }
}
