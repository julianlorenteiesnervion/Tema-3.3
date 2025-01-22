package boletincolecciones;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Método random
		Random random = new Random();
		
		// Creamos la lista de los números
		ArrayList<Integer>numbers = new ArrayList<>();
		
		// Añadimos 30 veces un número aleatorio a la lista
		for (int i = 0; i < 30; i++) {
			numbers.add(random.nextInt(1, 11));
		}
		
		// Ordenamos la lista
		Collections.sort(numbers);
		
		// Recorremos la lista con un for each e imprimimos el valor
		for (int value : numbers) {
			System.out.print(value + " ");
		}
		
	}

}
