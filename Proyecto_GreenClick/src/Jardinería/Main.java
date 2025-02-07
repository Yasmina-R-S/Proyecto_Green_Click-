package Jardinería;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	  int opcion = 0;

	  while (opcion != 8) {
	      System.out.println("\n--- Menú ---");
	      System.out.println("1. Buscar por nombre");
	      System.out.println("2. Buscar por origen");
	      System.out.println("3. Ordenar por precio (menor a mayor)");
          System.out.println("4. Ordenar por precio (mayor a menor)");
	      System.out.println("5. Agregar producto al carrito");
	      System.out.println("6. Eliminar producto del carrito");
	      System.out.println("7. Finalizar compra");
	      System.out.println("8. Salir");
	      System.out.print("Seleccione una opción: ");
	            
	      opcion = scanner.nextInt();
	      scanner.nextLine();  // Consumir el salto de línea
	        
	      if (opcion == 1) {
	          System.out.print("Ingrese el nombre a buscar: ");
	          String nombre = scanner.nextLine();
	          Tienda.buscarPorNombre(nombre);
	                
	      } else if (opcion == 2) {
	          System.out.print("Ingrese el origen a buscar: ");
	          String origen = scanner.nextLine();
	          Tienda.buscarPorOrigen(origen);
	                
	      } else if (opcion == 3) {
	          Tienda.ordenarPorPrecio(true);
	                
	      } else if (opcion == 4) {
	          Tienda.ordenarPorPrecio(false);
	                
	      } else if (opcion == 5) {
	          System.out.print("Ingrese el nombre del producto: ");
	          String prod = scanner.nextLine();
	          System.out.print("Ingrese la cantidad: ");
	          double cant = scanner.nextDouble();
	          Carrito.agregarAlCarrito(prod, cant);
	                
	      } else if (opcion == 6) {
	          System.out.print("Ingrese el nombre del producto a eliminar: ");
	          String eliminar = scanner.nextLine();
	          Carrito.eliminarDelCarrito(eliminar);
	                
	      } else if (opcion == 7) {
	          Carrito.finalizarCompra();
	                
	      } else if (opcion == 8) {
	          System.out.println("Saliendo...");
	                
	      } else {
	          System.out.println("Opción no válida.");
	      }
	   }
	}
}