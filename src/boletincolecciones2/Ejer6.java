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
		
		System.out.println("1. Añadir persona.\n"
				+ "2. Añadir teléfono a una persona dada.\n"
				+ "3. Mostrar los teléfonos de una persona.\n"
				+ "4. Eliminar teléfono de una persona.\n"
				+ "5. Eliminar una persona.");
		
		input = reader.nextInt();
		
		switch (input) {
		case 1 -> {
			System.out.print("Introduce el nombre: ");
			name = reader.nextLine();
			
			System.out.print("Introduce el teléfono: ");
			phone = reader.nextInt();
			
			people.put(name, LinkedHashSet<phone>);
		}
		}
		
	}

}
