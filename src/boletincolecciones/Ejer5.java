package boletincolecciones;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Declaramos la lista de los nombres
		LinkedHashSet<String>names = new LinkedHashSet<>();

		// String para guardar la entrada del usuario
		String input;
		
		// Le pedimos un nombre
		System.out.print("Introduce un nombre: ");
		input = reader.nextLine();
		
		// Mientras la entrada sea distinta de fin, seguimos añadiendo nombres
		while (!input.toLowerCase().equals("fin")) {
			// Añadimos el nombre
			names.add(input);
			
			// Preguntamos por otro
			System.out.print("Introduce otro nombre: ");
			input = reader.nextLine();
		}
		
		// Imprimimos la lista
		System.out.print(names);
		
		reader.close();
	}

}
