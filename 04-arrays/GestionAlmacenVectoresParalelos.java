package arrays;

/*
Ejercicio 8: Vectores paralelos.
Se pretende emular el almacén de una tienda virtual a través de vectores paralelos.

Se tienen los siguientes arrays:
- Nombres de productos: [Lápiz, Bolígrafo, Sacapuntas, Borrador, Tiza]
- Precios de productos: [1.95, 9.99, 0.99, 0.89, 4.99]
- Stock de productos: [200, 145, 300, 500, 1000]

Operaciones que debe realizar el programa:
1. Visualizar por pantalla un resumen de todo lo que hay en el almacén.
2. Si se vendiera todo, ¿cuánto dinero recibiría la tienda?
3. Mostrar aquellos productos que tengan un stock menor de 250.

Además:
Debido a la huelga de transportes, se debe incrementar el precio de los productos un 10%.
Crear un nuevo vector con el valor calculado (sin modificar el precio original).
*/

public class GestionAlmacenVectoresParalelos {
    public static void main(String[] args) {
        // Definición de los vectores paralelos
        // Cada array tiene información relacionada por índice:
        // nombresProductos[i] corresponde a preciosProductos[i] y stockProductos[i].
        String[] nombresProductos = {"Lápiz", "Bolígrafo", "Sacapuntas", "Borrador", "Tiza"};
        double[] preciosProductos = {1.95, 9.99, 0.99, 0.89, 4.99};
        int[] stockProductos = {200, 145, 300, 500, 1000};

        // Operación 1: Mostrar un resumen del almacén.
        System.out.println("Resumen del Almacén:");
        // Recorremos los arrays y mostramos cada producto con su precio y stock.
        for (int i = 0; i < nombresProductos.length; i++) {
            System.out.printf("%s - Precio: %.2f€ - Stock: %d unidades%n",
                    nombresProductos[i], preciosProductos[i], stockProductos[i]);
        }

        // Operación 2: Calcular el ingreso total si se vendiera todo.
        // Para esto multiplicamos precio * stock para cada producto y lo sumamos al total.
        double ingresoTotal = 0;
        for (int i = 0; i < nombresProductos.length; i++) {
            ingresoTotal += preciosProductos[i] * stockProductos[i];
        }
        // Mostramos el ingreso total calculado.
        System.out.printf("%nIngreso total si se vendiera todo: %.2f€%n", ingresoTotal);

        // Operación 3: Mostrar productos con stock menor a 250.
        System.out.println("\nProductos con stock menor a 250:");
        // Recorremos el array de stock y verificamos si el stock es menor a 250.
        for (int i = 0; i < nombresProductos.length; i++) {
            if (stockProductos[i] < 250) { // Si el stock es menor a 250, lo mostramos.
                System.out.printf("%s - Stock: %d unidades%n", nombresProductos[i], stockProductos[i]);
            }
        }

        // Operación 4: Incrementar los precios un 10% y guardar los resultados en un nuevo array.
        // Creamos un nuevo array para los precios incrementados (sin modificar el original).
        double[] preciosIncrementados = new double[preciosProductos.length];
        for (int i = 0; i < preciosProductos.length; i++) {
            preciosIncrementados[i] = preciosProductos[i] * 1.10; // Aumentamos el precio un 10%.
        }

        // Mostramos los precios originales y los incrementados.
        System.out.println("\nPrecios incrementados en un 10%:");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.printf("%s - Precio original: %.2f€ - Precio incrementado: %.2f€%n",
                    nombresProductos[i], preciosProductos[i], preciosIncrementados[i]);
        }
    }
}