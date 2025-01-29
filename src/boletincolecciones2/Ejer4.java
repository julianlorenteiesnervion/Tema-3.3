package boletincolecciones2;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Declaramos la lista
		ArrayList<String>list = new ArrayList<>();
		
		// Variable para recoger la opción del usuario
		int input;
		
		// Variable para guardar el nombre
		String name = "";
		
		// Do-while que se repetirá mientras la opción no sea 5
		do {
			System.out.println("1. Añadir nuevo nombre a la lista.\n"
					+ "2. Elimina un nombre específico.\n"
					+ "3. Ordena la lista alfabéticamente.\n"
					+ "4. Busca si un nombre específico está en la lista.\n"
					+ "5. Salir.");
			
			input = reader.nextInt();
			
			reader.nextLine();
			
			switch (input) {
			case 1 -> { // Añadir nombre
				System.out.print("Introduce el nombre: ");
				name = reader.nextLine();
				list.add(name);
				
				System.out.println("El nombre ha sido añadido.");
			}
			case 2 -> { // Eliminar nombre
				System.out.print("Introduce el nombre: ");
				name = reader.nextLine();
				list.remove(name);
				
				System.out.println("El nombre ha sido eliminado.");
			}
			case 3 -> { // Ordenar alfabéticamente
				Collections.sort(list);
				System.out.println("Lista ordenada alfabéticamente:\n" + list);
			}
			case 4 -> { // Buscar si el nombre está en la lista
				System.out.print("Introduce el nombre: ");
				name = reader.nextLine();
				
				if (list.indexOf(name) == -1)
					System.out.println("El nombre no está en la lista.");
				else
					System.out.println("El nombre está en la lista.");
			}
			case 5 -> { // Salir del programa
				System.out.println("Saliendo del programa...");
			}
			}
		} while (input != 5);
		
		reader.close();
	}

}
