package boletincolecciones2;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		// Creamos la lista
		ArrayList<Integer>lista = new ArrayList<>();
		
		// Añadimos los números del 1 al 10
		for (int i = 1; i <= 10; i++) {
			lista.add(i);
		}
		
		// Imprimimos la lista sin desordenar
		System.out.println(lista);
		
		// Desordenamos la lista
		Collections.shuffle(lista);
		
		// Imprimimos la lista desordenada
		System.out.println(lista);
	}
}