package introduccion;

/*
 * GUÍA DE JAVA PARA ESTUDIANTES DE 1º DE DAW
 * Esta guía está diseñada para explicar detalladamente los conceptos clave de Java.
 * Contiene:
 * 1. Método `public static void main(String[] args)`.
 * 2. Clases.
 * 3. Variables.
 * 4. Métodos.
 * 5. Arrays.
 * 6. Condicionales.
 * 7. Bucles.
 * 8. Otros conceptos importantes.
 */

public class GuiaJavaIntroduccion {

    /***************************************************************
     * 1. METODO PRINCIPAL: `public static void main(String[] args)`
     ***************************************************************/

    /*
     * public:
     * - Modificador de acceso que hace que el método sea accesible desde cualquier lugar.
     * - Alternativas:
     *   - private: El metodo solo puede usarse dentro de la misma clase.
     *   - protected: Permite acceso desde el mismo paquete y subclases.
     *   - (default): Si no se especifica, solo es accesible dentro del paquete.
     *
     * static:
     * - Significa que el metodo pertenece a la clase, no a una instancia (objeto).
     * - Esto permite llamar al metodo sin crear un objeto.
     *
     * void:
     * - Indica que el metodo no devuelve ningún valor.
     * - Si quisieras devolver algo, podrías cambiarlo por tipos como int, String, etc.
     *
     * main:
     * - Es el nombre del metodo principal que Java busca como punto de inicio del programa.
     * - Si cambias este nombre, el programa no funcionará.
     *
     * String[] args:
     * - Es un array de cadenas de texto que recibe argumentos desde la línea de comandos.
     * - Si ejecutas `java GuiaJavaCompleta Hola Mundo`, args contendrá:
     *   args[0] = "Hola"
     *   args[1] = "Mundo"
     */
    public static void main(String[] args) {
        System.out.println("¡Bienvenido a la Guía Completa de Java!");

        // Mostrar argumentos pasados desde la línea de comandos
        if (args.length > 0) {
            System.out.println("Argumentos pasados al programa:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No se pasaron argumentos al programa.");
        }

        // Llamar a métodos para explicar más conceptos
        explicarClases();
        explicarVariables();
        explicarMetodos();
        explicarArrays();
        explicarCondicionales();
        explicarBucles();
    }

    /*******************************
     * 2. CLASES
     *******************************/
    public static void explicarClases() {
        System.out.println("\n=== CLASES ===");

        /*
         * - Una clase es una plantilla o modelo que define atributos (datos) y métodos (comportamientos).
         * - Una clase puede contener variables y métodos.
         * - Sintaxis básica:
         *       public class NombreDeLaClase {
         *           // Variables (atributos)
         *           // Métodos (funcionalidades)
         *       }
         * - En este ejemplo, `GuiaJavaCompleta` es nuestra clase principal.
         */
        System.out.println("Una clase es un modelo que agrupa variables y métodos.");
    }

    /*******************************
     * 3. VARIABLES
     *******************************/
    public static void explicarVariables() {
        System.out.println("\n=== VARIABLES ===");

        /*
         * - Una variable es un espacio en memoria que almacena datos.
         * - Tipos de variables en Java:
         *   - int: Enteros (ejemplo: 10, -5, 0).
         *   - double: Decimales (ejemplo: 3.14, -2.5).
         *   - char: Un solo carácter (ejemplo: 'A', 'z').
         *   - boolean: true o false.
         *   - String: Texto (ejemplo: "Hola", "Java").
         */

        // Declaración e inicialización de variables
        int edad = 20;
        double altura = 1.75;
        char inicial = 'J';
        boolean esEstudiante = true;
        String mensaje = "¡Estoy aprendiendo Java!";

        // Mostrar valores de las variables
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("Mensaje: " + mensaje);
    }

    /*******************************
     * 4. MÉTODOS
     *******************************/
    public static void explicarMetodos() {
        System.out.println("\n=== MÉTODOS ===");

        /*
         * - Un método es un bloque de código que realiza una tarea específica.
         * - Puede recibir parámetros y devolver valores.
         * - Sintaxis básica:
         *       public static TipoDeRetorno nombreDelMetodo(Tipo parametro) {
         *           // Código del método
         *           return valor; // Si el tipo de retorno no es void
         *       }
         */

        // Llamar a un método que devuelve un valor
        int suma = sumar(10, 5);
        System.out.println("La suma de 10 y 5 es: " + suma);
    }

    // Ejemplo de método que recibe parámetros y devuelve un valor
    public static int sumar(int a, int b) {
        return a + b; // Devuelve la suma de los parámetros
    }

    /*******************************
     * 5. ARRAYS
     *******************************/
    public static void explicarArrays() {
        System.out.println("\n=== ARRAYS ===");

        /*
         * - Un array es una estructura que almacena múltiples valores del mismo tipo.
         * - Los arrays tienen un tamaño fijo, definido al crearlos.
         * - Sintaxis básica:
         *       Tipo[] nombreDelArray = {valor1, valor2, valor3};
         */

        // Declarar e inicializar un array
        int[] numeros = {10, 20, 30, 40, 50};

        // Acceder a elementos del array
        System.out.println("Primer elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);

        // Recorrer un array con un bucle for
        System.out.println("Elementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }
    }

    /*******************************
     * 6. CONDICIONALES
     *******************************/
    public static void explicarCondicionales() {
        System.out.println("\n=== CONDICIONALES ===");

        /*
         * - Permiten tomar decisiones en función de condiciones.
         * - Ejemplo:
         *       if (condición) {
         *           // Código si la condición es verdadera
         *       } else {
         *           // Código si la condición es falsa
         *       }
         */

        int numero = 15;

        if (numero > 10) {
            System.out.println("El número es mayor que 10.");
        } else if (numero == 10) {
            System.out.println("El número es igual a 10.");
        } else {
            System.out.println("El número es menor que 10.");
        }
    }

    /*******************************
     * 7. BUCLES
     *******************************/
    public static void explicarBucles() {
        System.out.println("\n=== BUCLES ===");

        /*
         * - Los bucles permiten ejecutar un bloque de código repetidamente.
         * - Tipos de bucles:
         *   - for: Repite un bloque un número fijo de veces.
         *   - while: Repite un bloque mientras una condición sea verdadera.
         *   - do-while: Similar a while, pero se ejecuta al menos una vez.
         */

        // Bucle for
        System.out.println("Bucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // Bucle while
        System.out.println("Bucle while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Bucle do-while
        System.out.println("Bucle do-while:");
        int numero = 1;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
    }
}
