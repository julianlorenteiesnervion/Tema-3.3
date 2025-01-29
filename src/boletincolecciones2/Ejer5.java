package boletincolecciones2;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Declaramos el hashmap
		HashMap<String, Integer>films = new HashMap<>();
		
		// Variable para las opciones
		int input;
		
		// Variable para las series
		String film;
		
		// Variable para las valoraciones
		int valoration;
		
		// Do-while != 4
		do {
			System.out.println("1. Agregar serie.\n"
					+ "2. Buscar serie.\n"
					+ "3. Eliminar serie.\n"
					+ "4. Salir.");
	
			input = reader.nextInt();
			
			reader.nextLine();
			
			switch (input) {
			case 1 -> { // Añadir serie y valoración
				System.out.print("Introduce la serie: ");
				film = reader.nextLine();
				
				System.out.print("Introduce la valoración: ");
				valoration = reader.nextInt();
				
				films.put(film, valoration);
			}
			case 2 -> { // Buscar la valoración de la serie
				System.out.print("Introduce la serie: ");
				film = reader.nextLine();
				
				if (films.get(film) != null) {
					System.out.println("La valoración de la serie es de " + films.get(film) + " estrellas.");
				} else
					System.out.println("La serie no existe.");
			}
			case 3 -> { // Eliminar la valoración de la serie
				System.out.print("Introduce la serie: ");
				film = reader.nextLine();
				
				films.remove(film);
				
				System.out.println("Se ha eliminado la serie.");
			}
			case 4 -> { // Salir del programa
				System.out.println("Saliendo del programa...");
			}
			}
		} while (input != 4);
		
		reader.close();
	}

}
