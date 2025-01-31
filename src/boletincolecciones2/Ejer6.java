package boletincolecciones2;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO
		Scanner reader =  new Scanner(System.in);
		
		HashMap<String, LinkedHashSet<Integer>>people = new HashMap<>();
		
		int input;
		
		String name;
		
		int phone;
		
		do {
			System.out.println("1. Añadir persona.\n"
					+ "2. Añadir teléfono a una persona dada.\n"
					+ "3. Mostrar los teléfonos de una persona.\n"
					+ "4. Eliminar teléfono de una persona.\n"
					+ "5. Eliminar una persona.\n"
					+ "0. Salir.");
			
			input = reader.nextInt();
			reader.nextLine();
			
			switch (input) {
			case 1 -> {
				System.out.print("Introduce el nombre: ");
				name = reader.nextLine();
				
				System.out.print("Introduce el teléfono: ");
				phone = reader.nextInt();
				
				if (people.get(name) == null) {
					people.put(name, new LinkedHashSet<>());
				}
				
				if (people.get(name) != null) {
					people.get(name).add(phone);
				}
				
				System.out.println(people);
			}
			}
		} while (input != 0);
	}

}
