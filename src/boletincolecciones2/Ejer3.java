package boletincolecciones2;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Declaramos el mapa para guardar los contadores de letras
		LinkedHashMap<Character, Integer>lettersList = new LinkedHashMap<>();
		
		// Variable para guardar temporalmente el caracter
		char character;

		// Frase
		String phrase = "En un agujero en el suelo, vivia un hobbit."
				+ "No un agujero humedo, sucio, repugnante,"
				+ "con restos de gusanos y olor a fango,"
				+ "ni tampoco un agujero, seco, desnudo y arenoso,"
				+ "sin nada en que sentarse o que comer: era un"
				+ "agujero-hobbit, y eso significa comodidad";
		
		// For que recorre todas las letras de la frase
		for (int i = 0; i < phrase.length(); i++) {
			// Cogemos el caracter
			character = phrase.charAt(i);
			
			// Si el caracter es una letra...
			if (Character.isLetter(character)) {
				// Lo guardamos en minúscula
				character = Character.toLowerCase(character);
				
				/* Si el caracter ya está registrado en el mapa,
				 * actualizamos el valor de la clave en el mapa (+1) */
				if (lettersList.get(character) != null) {
					lettersList.put(character, (lettersList.get(character)) + 1);
				} else { // Si no, significa que no existe, así que lo registramos con valor 1
					lettersList.put(character, 1);
				}
			}
		}

		// Imprimimos la lista
		System.out.println(lettersList);
	}

}
