package boletincolecciones;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Variable para guardar el número introducido por el usuario
		int num;
		
		// Lista para guardar los números
		ArrayList<Integer>numbers = new ArrayList<>();
		
		// Solicitamos un número
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		/* Mientras el número introducido sea mayor o igual a 0 (positivo),
		 * lo añadiremos a la lista y preguntaremos por otro número */
		while (num >= 0) {
			numbers.add(num);
			
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
		}
		
		// Recorremos la lista con un for each e imprimimos los valores pares
		for (int value : numbers) {
			if (value % 2 == 0)
				System.out.print(value + " ");
		}

	}

}
