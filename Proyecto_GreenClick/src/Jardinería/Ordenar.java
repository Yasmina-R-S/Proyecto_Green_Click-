package Jardinería;

public class Ordenar {

	  public static void ordenarPorPrecio(String[] nombres, double[] precios, boolean ascendente) {
	        int n = precios.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if ((ascendente && precios[j] > precios[j + 1]) || (!ascendente && precios[j] < precios[j + 1])) {
	                    // Intercambiar precios
	                    double tempPrecio = precios[j];
	                    precios[j] = precios[j + 1];
	                    precios[j + 1] = tempPrecio;

	                    // Intercambiar nombres
	                    String tempNombre = nombres[j];
	                    nombres[j] = nombres[j + 1];
	                    nombres[j + 1] = tempNombre;
	                }
	            }
	        }

	        System.out.println("Productos ordenados por precio " + (ascendente ? "ascendente" : "descendente") + ":");
	        for (int i = 0; i < n; i++) {
	            System.out.println(nombres[i] + " - $" + precios[i]);
	        }
	    }
	}