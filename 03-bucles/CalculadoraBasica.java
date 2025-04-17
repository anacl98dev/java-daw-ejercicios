package bucles;

import java.util.Scanner;

/*
 * Escribe un programa que simule una calculadora básica,
 * esta puede realizar operación de suma, resta, multiplicación,
 * división y potencia.
 * El programa debe recibir como entrada 2 números reales y un operador,
 * que puede ser +, -, *, / o **.
 * La salida del programa debe ser el resultado de la operación.
 * Ejemplo:
 * Operando: 3
 * Operador: +
 * Operando: 2
 * 3 + 2 = 5
 * Se debe tener en cuenta:
 * - La potencia no se puede realizar con Math.pow(), hay que hacerla con un bucle repetitivo.
 * - Cuando se acabe una operación, el programa pedirá si se quiere realizar otra operación o
 *** terminar el programa; es decir, que el usuario decide.
 */

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Variable para controlar si el usuario quiere continuar o salir del programa
        String opcion = "";
        // Bucle principal: se repite hasta que el usuario introduzca "N" para salir
        do {
            System.out.println("Introduce operando1, operador y operando2");
            double operando1 = teclado.nextDouble();
            String operador = teclado.next();
            double operando2 = teclado.nextDouble();
            // Limpiar el buffer
            teclado.nextLine();
            // Variable para almacenar el resultado de la operación
            double operacion;
            // Estructura switch para realizar la operación seleccionada por el usuario
            switch (operador) {
                case "+" -> operacion = operando1 + operando2;
                case "-" -> operacion = operando1 - operando2;
                case "*" -> operacion = operando1 * operando2;
                case "/" -> {
                    if (operando2 != 0) { // Comprobamos que el divisor no sea 0
                        operacion = operando1 / operando2;
                    } else { // Si el divisor es 0, mostramos un mensaje de error y continuamos con el bucle
                        System.out.println("Error: Division no permitida");
                        continue; // Volvemos al inicio del bucle
                    }
                }
                case "**" -> {
                    operacion = 1;
                    for (int veces = 1; veces <= operando2; veces++) {
                        operacion *= operando1;
                    }
                }
                default -> { // Caso por defecto si el operador no es válido
                    System.out.println("Operador no válido");
                    continue; // Volvemos al inicio del bucle
                }
            }
            // Mostramos el resultado de la operación
            System.out.println(operando1 + " " + operador + " " + operando2 + " = " + operacion);
            // Preguntamos al usuario si quiere continuar o salir
            do {
                System.out.println("¿Quieres seguir con el programa? (S/N)");
                opcion = teclado.nextLine().trim().toUpperCase();
                // Validamos que la opción sea "S" o "N"
                if (!opcion.equals("S") && !opcion.equals("N")) {
                    System.out.println("Entrada no válida. Por favor, introduzca S/N");
                }
            } while (!opcion.equals("S") && !opcion.equals("N")); // Repetimos hasta que la opción sea válida
        } while (!opcion.equals("N")); // El programa termina si la opción es "N"
        //Fin de programa
        System.out.println("Fin del programa");
    }
}
