package boletincolecciones2;

import java.util.*;

public class Ej2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		Set<Integer>randomNumbers = new LinkedHashSet<>();
		
		while (randomNumbers.size() < 10) {
			randomNumbers.add(random.nextInt(1, 21));
		}
		
		System.out.println(randomNumbers);
		
	}

}
