package Jardinería;

public class Buscar {

    public static void buscarPorNombre(String[] nombres, double[] precios, String[] origenes, String nombre) {
        System.out.println("Buscando productos que contengan: " + nombre);
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(nombres[i] + " - $" + precios[i] + " - Origen: " + origenes[i]);
            }
        }
    }

    public static void buscarPorOrigen(String[] nombres, double[] precios, String[] origenes, String origen) {
        System.out.println("Buscando productos del origen: " + origen);
        for (int i = 0; i < origenes.length; i++) {
            if (origenes[i].equalsIgnoreCase(origen)) {
                System.out.println(nombres[i] + " - $" + precios[i]);
            }
        }
    }
}