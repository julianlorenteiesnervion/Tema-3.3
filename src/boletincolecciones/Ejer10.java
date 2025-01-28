package boletincolecciones;

import java.util.*;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Variable para guardar la opción que escoge el usuario
		int input;
		
		// Variables para guardar el nombre del producto y su precio
		String producto;
		double precio;
		
		// Declaramos el hashmap
		HashMap<String, Double>productos = new HashMap<>();
		
		// Bucle do-while que se repetirá mientras el input no sea 0
		do {
			System.out.println("PRODUCTOS\n"
					+ "1. Alta de producto\n"
					+ "2. Baja de producto\n"
					+ "4. Listar existencias\n"
					+ "0. Salir");
			
			input = reader.nextInt();
			
			switch (input) {
			case 1 -> { // Alta de productos
				// Preguntamos por el nombre del producto y por su precio
				System.out.print("Nombre del producto: ");
				producto = reader.next();
				
				System.out.print("Precio del producto: ");
				precio = reader.nextDouble();
				
				// Añadimos el producto
				productos.put(producto, precio);
				System.out.println("✅ El producto " + producto + " ha sido registrado con un precio de " + precio + "€");
			}
			case 2 -> { // Baja de productos
				// Preguntamos por el nombre del producto
				System.out.print("Nombre del producto: ");
				producto = reader.next();
				
				// Si al eliminarlo nos devuelve null, significa que no existe
				if (productos.remove(producto) == null)
					System.out.println("❎ El producto " + producto + " no existe");
				else
					System.out.println("✅ El producto " + producto + " se ha eliminado correctamente");
			}
			case 4 -> { // Listar productos
				System.out.println(productos);
			}
			case 0 -> { // Salir
				System.out.println("Cerrando el programa...");
			}
			}
		} while (input != 0);
		
		reader.close();
		
	}

}
