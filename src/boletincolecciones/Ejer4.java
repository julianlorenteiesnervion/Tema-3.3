package boletincolecciones;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Método random
		Random random = new Random();
		
		// Declaramos la lista tree
		Set<Integer>numbers = new TreeSet<>();
		
		// Mientras el tamaño de la lista sea menor que 20, añadimos un número aleatorio
		while (numbers.size() < 20) {
			numbers.add(random.nextInt(1, 100));
			
		}
		
		// Imprimimos la lista
		System.out.print(numbers);
	}
}
