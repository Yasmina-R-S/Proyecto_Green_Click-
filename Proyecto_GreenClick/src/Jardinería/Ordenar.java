package Jardinería;

public class Ordenar {

	 // MÉTODO PARA ORDENAR LOS PRODUCTOS SEGÚN SU PRECIO
    public static void ordenarPorPrecio(String[] nombres, double[] precios, boolean ascendente) {
        /*
         * Este método ordena los productos según su precio, ya sea de menor a mayor (ascendente)
         * o de mayor a menor (descendente).
         *
         * Parámetros:
         * - nombres: Lista con los nombres de los productos.
         * - precios: Lista con los precios de los productos.
         * - ascendente: Si es "true", ordena de menor a mayor. Si es "false", de mayor a menor.
         */

        int n = precios.length; // Cantidad de productos

        // Bucle anidado para ordenar los productos usando el método de Burbuja.
        // n Es la cantidad total de productos.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                /*
                 * Si ascendente es "true", cambiamos los productos de lugar si el precio actual
                 * es mayor que el siguiente. Si es "false", hacemos lo contrario.
                 */
                if ((ascendente && precios[j] > precios[j + 1]) || (!ascendente && precios[j] < precios[j + 1])) {
                    // Intercambiar los precios
                    double tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;

                    // Intercambiar los nombres para que sigan correspondiendo con los precios
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }

        // Imprimimos los productos ordenados según el criterio elegido
        System.out.println("Productos ordenados por precio " + (ascendente ? "ascendente" : "descendente") + ":");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - $" + precios[i]);
        }
    }
}