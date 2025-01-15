package boletincolecciones;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		// Generamos un tamaño aleatorio para la lista entre 5 y 10 (ambos incluidos)
		int randomSize = random.nextInt(5, 11);
		
		// Variables para guardar los valores de las operaciones
		int suma = 0;
		int media;
		int min;
		int max;
		
		// Creamos la lista
		ArrayList<Integer>numbers = new ArrayList<>();
		
		// Añadimos números según el tamaño de la lista
		for (int i = 0; i < randomSize; i++) {
			// Números entre 0 y 100
			numbers.add(random.nextInt(0, 101));
		}
		
		// Nos guardamos el primer valor como mínimo y máximo
		min = numbers.get(0);
		max = numbers.get(0);
		
		// Recorremos la lista
		for (int value : numbers) {
			suma += value; // Sumamos los valores
			
			if (value < min) // If para el mínimo
				min = value;
			else if (value > max) // If para el máximo
				max = value;
		}
		
		/* Calculamos la media dividiendo la suma total
		 * entre la cantidad de números que hay */
		media = suma / numbers.size();
		
		// Imprimimos los resultados
		System.out.print("Suma: " + suma +
				"\nMedia: " + media +
				"\nMáximo: " + max +
				"\nMínimo: " + min);
	}

}
