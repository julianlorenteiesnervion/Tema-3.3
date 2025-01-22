package boletincolecciones;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Creamos la lista para el diccionario
		TreeMap<String, String>diccionario = new TreeMap<>();
		
		// Strings para guardar la entrada del usuario
		String input;
		String inputIngles;
		
		// Booleano para cerrar el programa
		boolean terminarPrograma = false;
		
		// Lista de palabras
		String[][] palabras = {{"hola", "hello"},
				{"adios", "goodbye"}, {"por favor", "please"},
				{"gracias", "thank you"}, {"si", "yes"}, {"no", "no"},
				{"feliz", "happy"}, {"triste", "sad"}, {"rápido", "fast"},
				{"lento", "slow"}, {"alto", "tall"}, {"bajo", "short"},
				{"cielo", "sky"}, {"tierra", "earth"}, {"fuego", "fire"},
				{"agua", "water"}, {"aire", "air"}, {"luz", "light"},
				{"oscuridad", "darkness"}, {"estrella", "star"}};
		
		// For para guardar la lista de palabras en la lista del diccionario
		for (int i = 0; i < palabras.length; i++) {
			diccionario.put(palabras[i][0], palabras[i][1]);
		}
		
		// Bucle del programa
		while (!terminarPrograma) {
			// Mensaje con opciones
			System.out.println("1. Inserta palabra\n"
					+ "2. Busca palabra\n"
					+ "0. Salir");
			input = reader.next();
			
			// Switch para las distintas opciones
			switch (input) {
			// Con 1 insertamos una nueva palabra en el diccionario
			case "1" -> {
				System.out.print("Introduce la palabra en español: ");
				input = reader.next();
				
				System.out.print("Introduce la palabra en inglés: ");
				inputIngles = reader.next();
				
				diccionario.put(input, inputIngles);
				
				System.out.println("La palabra " + input + " ha sido añadida al diccionario como " + inputIngles);
			}
			
			// Con 2 realizamos una búsqueda en el diccionario
			case "2" -> {
				System.out.print("Introduce la palabra en español: ");
				input = reader.next();
				
				if (diccionario.get(input) != null)
					System.out.println(diccionario.get(input));
				else
					System.out.println("La palabra " + input + " no ha sido encontrada en el diccionario");
			}
			
			// Con 0 cerramos el programa
			case "0" -> {
				terminarPrograma = true;
			}
			}
		}
		
		reader.close();
	}
}